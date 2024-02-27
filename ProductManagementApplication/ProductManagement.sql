CREATE TABLE login_info (
    id       NUMBER NOT NULL,
    username VARCHAR2(20) NOT NULL,
    password VARCHAR2(20) NOT NULL
);

CREATE TABLE products (
    id       NUMBER NOT NULL,
    name     VARCHAR2(50) NOT NULL,
    category VARCHAR2(50),
    price    NUMBER
);

CREATE SEQUENCE login_seq START WITH 1 INCREMENT BY 1;

CREATE SEQUENCE product_seq START WITH 1 INCREMENT BY 1;

insert into login_info values( login_seq.NEXTVAL , 'shruti' , 'shruti@123' );
commit;

insert into products values( product_seq.NEXTVAL , 'Sony Bravia' , 'TV' , 30000);
commit;
delete products where id = 2;

select * from login_info where username = '' and password = '';
select * from products order by id;
update products set name = 'Vivo', category = 'Mobile', price = 50000 where id = 4;
update login_info set isActive = 'Y' where id = 1;
update products set isdelete = 'N' where id in(1,3,4,21,24,25);


ALTER TABLE login_info
ADD isActive varchar2(10);

ALTER TABLE login_info
DROP COLUMN isDelete;

ALTER TABLE products
ADD isDelete varchar2(10);

select product_seq.nextval from dual;