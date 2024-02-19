select * from student;
INSERT INTO STUDENT    (ID, NAME)
VALUES (3, 'studentC');

CREATE TABLE customers  
( customer_id number(10) NOT NULL,  
  customer_name varchar2(50) NOT NULL,  
  city varchar2(50)  
);  
Insert into customers (customer_id, customer_name, city) values (1, 'Shruti', 'Latur');
Insert into customers (customer_id, customer_name, city) values (2, 'Abhijit', 'Pune');
Insert into customers (customer_id, customer_name, city) values (3, 'Shrikant', 'Nagpur');
delete customers where customer_id = 3;

ALTER TABLE customers  
  ADD phone number(10);   

desc employee
SELECT * FROM employee
select * from dba_ts_quotas  

