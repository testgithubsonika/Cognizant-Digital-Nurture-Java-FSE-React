INSERT INTO Employees
VALUES (
    1,
    'Alice Johnson',
    'Manager',
    70000,
    'HR',
    TO_DATE('2015-06-15','YYYY-MM-DD')
);

INSERT INTO Employees
VALUES (
    2,
    'Bob Brown',
    'Developer',
    60000,
    'IT',
    TO_DATE('2017-03-20','YYYY-MM-DD')
);

-- for inserting isvip column in customer table
ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);