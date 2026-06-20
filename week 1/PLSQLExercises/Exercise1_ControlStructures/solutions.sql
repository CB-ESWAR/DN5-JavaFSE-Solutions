-- Scenario 1
-- Apply 1% discount to loan interest rates for customers above 60 years

DECLARE
    v_age NUMBER;
BEGIN

    FOR c IN (SELECT CustomerID, DOB FROM Customers) LOOP

        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12);

        IF v_age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = c.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

END;
/

--------------------------------------------------

-- Scenario 2
-- Mark customers as VIP if balance is greater than 10000

ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);

BEGIN

    FOR c IN (SELECT CustomerID, Balance FROM Customers) LOOP

        IF c.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = c.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

END;
/

--------------------------------------------------

-- Scenario 3
-- Generate reminders for loans due within 30 days

BEGIN

    FOR l IN (
        SELECT CustomerID, LoanID, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer '
            || l.CustomerID
            || ' Loan '
            || l.LoanID
            || ' is due on '
            || TO_CHAR(l.EndDate, 'DD-MON-YYYY')
        );

    END LOOP;

END;
/