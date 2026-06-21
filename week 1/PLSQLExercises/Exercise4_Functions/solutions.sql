CREATE OR REPLACE FUNCTION CalculateAge(
    p_dob DATE
)
RETURN NUMBER
IS
BEGIN

    RETURN FLOOR(
        MONTHS_BETWEEN(SYSDATE, p_dob) / 12
    );

END;
/
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount NUMBER,
    p_interest_rate NUMBER,
    p_years NUMBER
)
RETURN NUMBER
IS
    v_months NUMBER;
    v_installment NUMBER;
BEGIN

    v_months := p_years * 12;

    v_installment :=
        (p_loan_amount +
        (p_loan_amount * p_interest_rate / 100))
        / v_months;

    RETURN ROUND(v_installment, 2);

END;
/
CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_account_id NUMBER,
    p_amount NUMBER
)
RETURN VARCHAR2
IS
    v_balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_account_id;

    IF v_balance >= p_amount THEN
        RETURN 'TRUE';
    ELSE
        RETURN 'FALSE';
    END IF;

END;
/