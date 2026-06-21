DECLARE

    CURSOR GenerateMonthlyStatements IS
    SELECT TransactionID,
           AccountID,
           Amount
    FROM Transactions
    WHERE EXTRACT(MONTH FROM TransactionDate)
          = EXTRACT(MONTH FROM SYSDATE);

    v_transaction_id Transactions.TransactionID%TYPE;
    v_account_id Transactions.AccountID%TYPE;
    v_amount Transactions.Amount%TYPE;

BEGIN

    OPEN GenerateMonthlyStatements;

    LOOP

        FETCH GenerateMonthlyStatements
        INTO v_transaction_id,
             v_account_id,
             v_amount;

        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(
            'Transaction: '
            || v_transaction_id
            || ' Account: '
            || v_account_id
            || ' Amount: '
            || v_amount
        );

    END LOOP;

    CLOSE GenerateMonthlyStatements;

END;
/
DECLARE

    CURSOR ApplyAnnualFee IS
    SELECT AccountID
    FROM Accounts;

BEGIN

    FOR acc IN ApplyAnnualFee LOOP

        UPDATE Accounts
        SET Balance = Balance - 100
        WHERE AccountID = acc.AccountID;

    END LOOP;

    COMMIT;

END;
/
DECLARE

    CURSOR UpdateLoanInterestRates IS
    SELECT LoanID
    FROM Loans;

BEGIN

    FOR l IN UpdateLoanInterestRates LOOP

        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE LoanID = l.LoanID;

    END LOOP;

    COMMIT;

END;
/