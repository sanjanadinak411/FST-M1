SELECT SUM(purchase_amount) AS TotalAmount FROM orders;

SELECT AVG(purchase_amount) AS AVAmount FROM orders;

SELECT MAX(purchase_amount) AS MAXAmount FROM orders;

SELECT MIN(purchase_amount) AS MINAmount FROM orders;

SELECT * FROM SALESMAN;

SELECT * FROM ORDERS;

SELECT COUNT(DISTINCT(SALESMAN_ID)) FROM SALESMAN ;

SELECT MAX(PURCHASE_AMOUNT) AS MAX_AMOUNT, CUSTOMER_ID FROM orders
GROUP BY  CUSTOMER_ID;

SELECT MAX(PURCHASE_AMOUNT) AS MAX_SALE_AMOUNT, SALESMAN_ID FROM orders
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD')
GROUP BY  SALESMAN_ID,order_date;

SELECT SALESMAN_ID, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders
GROUP BY SALESMAN_ID, order_date
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

-- Create the customers table
create table customersGRADE (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT ALL
    INTO customersGRADE VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customersGRADE VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customersGRADE VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customersGRADE VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customersGRADE VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customersGRADE VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customersGRADE VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customersGRADE VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

SELECT * FROM customersGRADE;
SELECT * FROM SALESMAN;

SELECT customersGRADE.SALESMAN_ID,customersGRADE.customer_name,SALESMAN.GRADE FROM 
customersGRADE 
LEFT OUTER JOIN SALESMAN ON
customersGRADE.SALESMAN_ID=SALESMAN.SALESMAN_ID WHERE SALESMAN.GRADE<300;

SELECT customersGRADE.customer_name,SALESMAN.SALESMAN_NAME,SALESMAN.COMMISSION FROM 
customersGRADE
INNER JOIN SALESMAN ON
customersGRADE.SALESMAN_ID=SALESMAN.SALESMAN_ID WHERE SALESMAN.COMMISSION>12;

--ACTIVITY10
SELECT * FROM orders
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT grade, COUNT(*) FROM customers
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders
WHERE salesman_id IN( SELECT salesman_id FROM salesman
WHERE commission=( SELECT MAX(commission) FROM salesman));

--ACTIVITY11
SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, salesman_name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, o.order_no, 'highest on', o.order_date, o.purchase_amount FROM salesman a, orders o
WHERE a.salesman_id=o.salesman_id
AND o.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = o.order_date)
UNION
SELECT a.salesman_id, a.salesman_name, o.order_no, 'lowest on', o.order_date, o.purchase_amount FROM salesman a, orders o
WHERE a.salesman_id=o.salesman_id
AND o.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = o.order_date)
ORDER BY order_date;