1.select last_name,salary from employees where salary>12000;
+-----------+----------+
| last_name | salary   |
+-----------+----------+
| King      | 24000.00 |
| Kochhar   | 17000.00 |
| De Haan   | 17000.00 |
| Russell   | 14000.00 |
| Partners  | 13500.00 |
| Hartstein | 13000.00 |
+-----------+----------+
6 rows in set (0.00 sec)

2.select last_name,department_id from employees where employee_id=176;
+-----------+---------------+
| last_name | department_id |
+-----------+---------------+
| Taylor    |            80 |
+-----------+---------------+
1 row in set (0.00 sec)

3.select last_name ,salary from employees where salary not between 5000 And 12000;
+-------------+----------+
| last_name   | salary   |
+-------------+----------+
| King        | 24000.00 |
| Kochhar     | 17000.00 |
| De Haan     | 17000.00 |
| Austin      |  4800.00 |
| Pataballa   |  4800.00 |
| Lorentz     |  4200.00 |
| Khoo        |  3100.00 |
| Baida       |  2900.00 |
| Tobias      |  2800.00 |
| Himuro      |  2600.00 |
| Colmenares  |  2500.00 |
| Nayer       |  3200.00 |
| Mikkilineni |  2700.00 |
| Landry      |  2400.00 |
| Markle      |  2200.00 |
| Bissot      |  3300.00 |
| Atkinson    |  2800.00 |
| Marlow      |  2500.00 |
| Olson       |  2100.00 |
| Mallin      |  3300.00 |
| Rogers      |  2900.00 |
| Gee         |  2400.00 |
| Philtanker  |  2200.00 |
| Ladwig      |  3600.00 |
| Stiles      |  3200.00 |
| Seo         |  2700.00 |
| Patel       |  2500.00 |
| Rajs        |  3500.00 |
| Davies      |  3100.00 |
| Matos       |  2600.00 |
| Vargas      |  2500.00 |
| Russell     | 14000.00 |
| Partners    | 13500.00 |
| Taylor      |  3200.00 |
| Fleaur      |  3100.00 |
| Sullivan    |  2500.00 |
| Geoni       |  2800.00 |
| Sarchand    |  4200.00 |
| Bull        |  4100.00 |
| Dellinger   |  3400.00 |
| Cabrio      |  3000.00 |
| Chung       |  3800.00 |
| Dilly       |  3600.00 |
| Gates       |  2900.00 |
| Perkins     |  2500.00 |
| Bell        |  4000.00 |
| Everett     |  3900.00 |
| McCain      |  3200.00 |
| Jones       |  2800.00 |
| Walsh       |  3100.00 |
| Feeney      |  3000.00 |
| OConnell    |  2600.00 |
| Grant       |  2600.00 |
| Whalen      |  4400.00 |
| Hartstein   | 13000.00 |
+-------------+----------+
55 rows in set (0.00 sec)


4.select last_name,job_id,hire_date from employees where last_name in('matos','taylor') ORDER BY hire_date;
+-----------+----------+------------+
| last_name | job_id   | hire_date  |
+-----------+----------+------------+
| Taylor    | SH_CLERK | 1998-01-24 |
| Matos     | ST_CLERK | 1998-03-15 |
| Taylor    | SA_REP   | 1998-03-24 |
+-----------+----------+------------+
3 rows in set (0.00 sec)

5.select last_name,department_id from employees where department_id  In(20,50) order by last_name;
+-------------+---------------+
| last_name   | department_id |
+-------------+---------------+
| Atkinson    |            50 |
| Bell        |            50 |
| Bissot      |            50 |
| Bull        |            50 |
| Cabrio      |            50 |
| Chung       |            50 |
| Davies      |            50 |
| Dellinger   |            50 |
| Dilly       |            50 |
| Everett     |            50 |
| Fay         |            20 |
| Feeney      |            50 |
| Fleaur      |            50 |
| Fripp       |            50 |
| Gates       |            50 |
| Gee         |            50 |
| Geoni       |            50 |
| Grant       |            50 |
| Hartstein   |            20 |
| Jones       |            50 |
| Kaufling    |            50 |
| Ladwig      |            50 |
| Landry      |            50 |
| Mallin      |            50 |
| Markle      |            50 |
| Marlow      |            50 |
| Matos       |            50 |
| McCain      |            50 |
| Mikkilineni |            50 |
| Mourgos     |            50 |
| Nayer       |            50 |
| OConnell    |            50 |
| Olson       |            50 |
| Patel       |            50 |
| Perkins     |            50 |
| Philtanker  |            50 |
| Rajs        |            50 |
| Rogers      |            50 |
| Sarchand    |            50 |
| Seo         |            50 |
| Stiles      |            50 |
| Sullivan    |            50 |
| Taylor      |            50 |
| Vargas      |            50 |
| Vollman     |            50 |
| Walsh       |            50 |
| Weiss       |            50 |
+-------------+---------------+
47 rows in set (0.00 sec)
6.mysql> select last_name as "employee",salary as "monthly salary" from employees where (salary between 5000 and 12000 ) And department_id  In(20,50);
+----------+----------------+
| employee | monthly salary |
+----------+----------------+
| Weiss    |        8000.00 |
| Fripp    |        8200.00 |
| Kaufling |        7900.00 |
| Vollman  |        6500.00 |
| Mourgos  |        5800.00 |
| Fay      |        6000.00 |
+----------+----------------+
6 rows in set (0.00 sec)

7.mysql> select last_name,date_format(hire_date    ,'%d-%m-%y')hire_date from employees where year(hire_date)=1994;
+-----------+-----------+
| last_name | hire_date |
+-----------+-----------+
| Greenberg | 17-08-94  |
| Faviet    | 16-08-94  |
| Raphaely  | 07-12-94  |
| Mavris    | 07-06-94  |
| Baer      | 07-06-94  |
| Higgins   | 07-06-94  |
| Gietz     | 07-06-94  |
+-----------+-----------+
7 rows in set (0.01 sec)
8.select last_name,job_id from employees where manager_id is null;
+-----------+---------+
| last_name | job_id  |
+-----------+---------+
| King      | AD_PRES |
+-----------+---------+
1 row in set (0.00 sec)
9.select last_name,salary,commission_pct from employees where commission_pct is not null order by salary desc,commission_pct desc;
+------------+----------+----------------+
| last_name  | salary   | commission_pct |
+------------+----------+----------------+
| Russell    | 14000.00 |           0.40 |
| Partners   | 13500.00 |           0.30 |
| Errazuriz  | 12000.00 |           0.30 |
| Ozer       | 11500.00 |           0.25 |
| Cambrault  | 11000.00 |           0.30 |
| Abel       | 11000.00 |           0.30 |
| Vishney    | 10500.00 |           0.25 |
| Zlotkey    | 10500.00 |           0.20 |
| King       | 10000.00 |           0.35 |
| Tucker     | 10000.00 |           0.30 |
| Bloom      | 10000.00 |           0.20 |
| Fox        |  9600.00 |           0.20 |
| Sully      |  9500.00 |           0.35 |
| Bernstein  |  9500.00 |           0.25 |
| Greene     |  9500.00 |           0.15 |
| McEwen     |  9000.00 |           0.35 |
| Hall       |  9000.00 |           0.25 |
| Hutton     |  8800.00 |           0.25 |
| Taylor     |  8600.00 |           0.20 |
| Livingston |  8400.00 |           0.20 |
| Smith      |  8000.00 |           0.30 |
| Olsen      |  8000.00 |           0.20 |
| Doran      |  7500.00 |           0.30 |
| Cambrault  |  7500.00 |           0.20 |
| Smith      |  7400.00 |           0.15 |
| Bates      |  7300.00 |           0.15 |
| Marvins    |  7200.00 |           0.10 |
| Sewall     |  7000.00 |           0.25 |
| Tuvault    |  7000.00 |           0.15 |
| Grant      |  7000.00 |           0.15 |
| Lee        |  6800.00 |           0.10 |
| Ande       |  6400.00 |           0.10 |
| Banda      |  6200.00 |           0.10 |
| Johnson    |  6200.00 |           0.10 |
| Kumar      |  6100.00 |           0.10 |
+------------+----------+----------------+
35 rows in set (0.00 sec)




practice3:
1.
mysql> select curdate();
+------------+
| curdate()  |
+------------+
| 2019-06-19 |
+------------+
1 row in set (0.00 sec)

2.mysql> select employee_id,last_name,salary,(salary+(salary*155/1000)) As "new salary" from employees;
3.
mysql> select employee_id,last_name,salary,(salary+(salary*155/1000)) As "new salary" ,((salary+(salary*155/1000))-salary) as "increased" from employees;
4.
select last_name,length(last_name) from employees where (substr(last_name,1)=upper(last_name)) And last_name like "j%" or last_name like "m%" or last_name like "a%" order by last_name;


6.mysql> select last_name,timestampdiff(month,hire_date,curdate()) as "months_worked" from employees order by months_worked asc;


7.mysql> select concat(concat(last_name,"earns"),concat(salary,"monthly"),concat("but wants",3*salary)) as "dream salaries" from employees;

8.mysql> select last_name,lpad(salary,15,'*') from employees ;



PRACTICE-4


1.mysql> select max(salary),min(salary),sum(salary),round(avg(salary)) from employees;

2.mysql> select job_id, max(salary),min(salary),sum(salary),round(avg(salary)) from employees group by job_id;

3.mysql> select job_id,count(*) from employees group by job_id;

4.mysql> select count(manager_id)as "No of managers" from employees;

5.mysql> select (max(salary)-min(salary)) as "diffrence" from employees;

6.mysql> select manager_id,min(salary) from employees group by(manager_id) having min(salary)>6000 And manager_id is not null order by min(salary) desc;



PRACTICE-5

1.mysql> select l.location_id,l.street_address,l.city ,l.state_province,c.country_name from locations l  join countries c on (l.country_id=c.country_id);

2.mysql> select e.last_name,d.department_id,d.department_name from employees e join departments d on(e.department_id=d.department_id);

3.mysql> select e.last_name,e.job_id,e.department_id,d.department_name from employees e join departments d on(e.department_id=d.department_id) join locations l on(d.location_id=l.location_id) And l.city="toronto";

4.mysql> select e.last_name,e.employee_id,m.last_name,m.employee_id from employees e join employees m on (e.manager_id=m.employee_id);


practice-6

1.mysql> select last_name,hire_date from employees where department_id=(select department_id from employees where last_name="zlotkey") and last_name!="zlotkey";

2.mysql> select employee_id,last_name,salary from employees where salary>(select avg(salary) from employees) order by salary;

3.mysql> select employee_id,last_name from employees where department_id in(select department_id from employees where last_name like "%u%");

4.mysql> select last_name,department_id,job_id from employees where department_id in(select department_id from departments where location_id=1700);

5.mysql> select last_name,salary from employees where manager_id in(select employee_id from employees where manager_id is null);

6.mysql> select department_id ,last_name,job_id from employees where department_id in(select department_id from departments where department_name="executive");

7.mysql> select employee_id,last_name,salary from employees where salary>(select avg(salary) from employees) and department_id in(select department_id from employees where last_name like "%u%" or last_name like "%a%");