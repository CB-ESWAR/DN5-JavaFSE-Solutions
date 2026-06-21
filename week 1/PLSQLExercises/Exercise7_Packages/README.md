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