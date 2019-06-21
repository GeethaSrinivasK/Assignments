column level integrity:

mysql> create table products(productCode varchar(40) primary key,product_name varchar(40),product_vendor varchar(50));

table level Integrity:

mysql> create table products(productCode varchar(40),product_name varchar(40),product_vendor varchar(50),product_desc text,constraint productcode_pk primary key(productcode));

Referential integrity:

mysql> create table employees(empNumber int primary key,lastname varchar(40),firstname varchar(40),officecode varchar(40),constraint officecode_fk foreign key(officecode) references offices(officecode));

domain Integrity:

mysql> create table products(productCode varchar(40),product_name varchar(40),product_vendor varchar(50),product_desc varchar(20) UNIQUE,constraint productcode_pk primary key(productcode));

check Constraint:

mysql> create table employees(empNumber int primary key,lastname varchar(40),firstname varchar(40),officecode varchar(40),ext varchar(40),
                              constraint officecode_fk foreign key(officecode) references offices(officecode),
                              constraint ext_chk check(ext LIKE "x%"));


practice:

1.mysql> create table course_info(course_code varchar(10) primary key,
                                  course_name varchar(20) not null,
                                  course_desc varchar(25),
                                  course_start_date date,course_duration int,no_of_participants int,course_type char(3));


2.mysql> create table student_courses(student_id varchar(10),
                                      course_code varchar(10),
                                      constraint student_id_fk foreign key(student_id) references student_info(student_id),
                                      constraint course_code_fk foreign key(course_code) references course_info(course_code));


3.mysql> create table student_courses(student_id varchar(10) references student_info(student_id),course_code varchar(10) references course_info(course_code));

4.mysql> create table suppliers(supper_id int(10) not null primary key,supplier_name varchar(50) not null,address varchar(20),city varchar(20),state varchar(20),zipcode varchar(20));

5.mysql> create table customers(customer_id int(10) not null ,customer_name varchar(50) not null,address varchar(20),city varchar(20),state varchar(20),zipcode varchar(20),constraint customer_id_pk primary key(customer_id));

6.mysql> select s.student_id,s.first_name,s.last_name,c.course_code from student_info s join student_courses m on(s.student_id=m.student_id) join course_info c on(c.course_code="167");


renaming file name to new file name;

 rename table course_info to cms_course_info;

 changing column name to new column name:
mysql> alter table course_info change course course_name varchar(20);

7.mysql> update course_info set course_name="mysql",course_desc="mysql" where course_code="106";

8.mysql> delete from course_info where course_code="347";



mysql> create user geethasrinivas identified by 'geetha@123';
Query OK, 0 rows affected (0.02 sec)

mysql> grant create on *.* to "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)

mysql> grant select on *.* to "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)

mysql> grant insert on *.* to "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)

mysql> grant update on *.* to "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)

mysql> grant delete on *.* to "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)

mysql> revoke create on *.* from "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)

mysql> revoke insert on *.* from "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)

mysql> revoke update on *.* from "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)

mysql> revoke delete on *.* from "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)

mysql> revoke select on *.* from "geethasrinivas";
Query OK, 0 rows affected (0.01 sec)