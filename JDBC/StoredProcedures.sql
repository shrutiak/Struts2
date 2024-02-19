CREATE OR REPLACE PROCEDURE insertemployee (
    id     IN NUMBER,
    name   IN VARCHAR2,
    salary IN NUMBER
) IS
BEGIN
    INSERT INTO employee VALUES (
        id,
        name,
        salary
    );

END;
--------------------------------------------------------------------------------

CREATE OR REPLACE PROCEDURE getemployeebyid (
    id     IN employee.emp_id%TYPE,
    name   OUT employee.emp_name%TYPE,
    salary OUT employee.emp_salary%TYPE
) IS
BEGIN
    SELECT
        emp_name,
        emp_salary into name, salary
    FROM
        employee
    WHERE
        emp_id = id;

END;