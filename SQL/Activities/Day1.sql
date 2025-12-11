--Activity1
CREATE TABLE salesman(
    salesman_id INT,
    salesman_name varchar2(20),
    salesman_city varchar2(20),
    commission INT)

--Activity2
INSERT ALL
    INTO SALESMAN VALUES (5001,'James Hoog','New York',15)
    INTO SALESMAN VALUES (5002,'Nail Knite ','Paris',30)
    INTO SALESMAN VALUES (5005,'Pit Alex','London',11)
    INTO SALESMAN VALUES (5006,'McLyon','Paris',14)
    INTO SALESMAN VALUES (5007,'Paul Adam','Rome',13)
    INTO SALESMAN VALUES (5003,'Lauson Hen','San Jose',12)


SELECT * FROM SALESMAN;

--Activity3

SELECT salesman_id, salesman_city FROM SALESMAN;

SELECT * FROM SALESMAN WHERE salesman_city='PARIS';

SELECT salesman_id, commission FROM SALESMAN WHERE salesman_name='Paul Adam';

--ACTIVITY4

ALTER TABLE SALESMAN
ADD (grade INT);

SELECT * FROM SALESMAN;

UPDATE SALESMAN
SET grade = 100;

--ACTIVITY5

UPDATE SALESMAN
SET grade = 200 WHERE salesman_city='Rome';

SELECT * FROM SALESMAN;

UPDATE SALESMAN
SET grade = 300 WHERE salesman_name='James Hoog';

UPDATE SALESMAN
SET salesman_name = 'Pierre' WHERE salesman_name='McLyon';

--ACTIVITY6

-- Create a table named orders
create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

-- Add values to the table
INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)
SELECT 1 FROM DUAL;

SELECT * FROM orders;

SELECT DISTINCT salesman_id FROM orders;

SELECT * FROM orders ORDER BY order_date;

SELECT * FROM orders ORDER BY purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount<500;

SELECT * FROM orders WHERE purchase_amount BETWEEN 1000 AND 2000;

ALTER TABLE orders
ADD (YourDateColumn DATE);

SELECT * FROM orders ORDER BY EXTRACT(DAY FROM order_date);