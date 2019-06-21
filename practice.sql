1.mysql> select member_id,member_name,city,membership_status from lms_members where membership_status="permanent";

2.

3.mysql> select b.member_id,b.member_name from lms_members b join lms_book_issue l on(b.member_id=l.member_id) where l.book_code="bl000002";

4.mysql> select book_code,book_title,author from lms_book_details where author like "p%";

5.mysql> select count(category) as "no_of_books" from lms_book_details where category="java";

6.mysql> select category,count(category) as "no_of_books" from lms_book_details group by category;

7.mysql> select count(publication) from lms_book_details where publication="prentice hall";

8.mysql> select book_code,book_title from lms_book_details where publish_date='2012-04-01';

9.mysql> select member_id,member_name,date_register,date_expire from lms_members where date_expire<'2013-04-01';

10.mysql> select member_id,member_name,date_register,membership_status from lms_members where date_register<'2012-03-01' and membership_status="temporary";

11.mysql> select member_id,member_name as "name" from lms_members where city="chennai" or city="delhi";

12.mysql> select concat(book_title,"_is_written_by_",author) as "book-written_by" from lms_book_details;

13.mysql> select avg(price) as "average price" from lms_book_details where category="java";

14.mysql> select supplier_id,supplier_name,email from lms_suppliers_details where email like "%gmail%";

15.mysql> select supplier_id,supplier_name,coalesce(contact,email,address) as "contact details" from lms_suppliers_details;

16.mysql> select supplier_id,supplier_name,if(contact is null,"no","yes") as "phone_no_availiable" from lms_suppliers_details;

17.mysql> select b.member_id,b.member_name,b.membership_status,sum(f.fine_amount) from lms_members b join lms_book_issue l on(b.member_id=l.member_id) join lms_fine_details f on(l.fine_range=f.fine_range) group by member_id;

18.mysql> select b.member_id,b.member_name,c.book_code,c.book_title from lms_members b join lms_book_issue l on(b.member_id=l.member_id) join lms_book_details c on(l.book_code=c.book_code);

19.mysql> select count(t.book_code) as "no_of_books_availiable" from lms_book_details t left join lms_book_issue t1 on (t.book_code=t1.book_code) where t1.book_code is null;

20.mysql> select l.member_id,l.member_id,b.fine_range,c.fine_amount from lms_members l join lms_book_issue b on(l.member_id=b.member_id) join lms_fine_details c on(b.fine_range=c.fine_range) where c.fine_amount<100;

21.mysql>  select book_code,book_title,publication,author,book_edition,price,year(publish_date) from lms_book_details order by year(publish_date);

22.mysql> select book_code,book_title,rack_num from lms_book_details where rack_num="a1" order by book_title;

23.mysql> select b.member_id,b.member_name,l.date_return as "duedate",l.date_returned as "date returned" from lms_members b join lms_book_issue l on(b.member_id=l.member_id);
 
24.mysql> select b.member_id,b.member_name,b.date_register from lms_members b left join lms_book_issue l on(b.member_id=l.member_id) where l.member_id is null;

25.mysql> select b.member_id,b.member_name from lms_members b join lms_book_issue l on(b.member_id=l.member_id) join lms_fine_details m on(l.fine_range=m.fine_range) where fine_amount=0 ;

26.mysql> select date_issue,count(date_issue) as no_of_books from lms_book_issue group by date_issue having count(date_issue)=(select max(counted) from (select count(date_issue) as counted from lms_book_issue group by date_issue) as t);

27.mysql> select book_title,supplier_id from lms_book_details where supplier_id="S01" and author="herbert schildt" and book_edition=5;

28.mysql> select rack_num,count(book_code) as no_of_books from lms_book_details group by rack_num;

29.mysql> select b.book_issue_no,m.member_name,m.date_register,m.date_expire,d.category,d.author,d.price,d.book_title,b.date_return,b.date_returned,f.fine_amount from lms_members m join lms_book_issue b on (b.member_id=m.member_id) join lms_book_details d on(d.book_code=b.book_code) join lms_fine_details f on(f.fine_range=b.fine_range);

30.mysql> select book_code,book_title,publish_date from lms_book_details where month(publish_date)="12";

31.mysql> select b.book_code,b.book_title,supplier_name,b.price from lms_book_details b join lms_suppliers_details s on (b.supplier_id=s.supplier_id) where b.price=(select max(price) from lms_book_details l where l.supplier_id=b.supplier_id);

32.mysql> select book_code,book_title,publication ,year(curdate())-year(date_arrival) as "how_old" from lms_book_details order by how_old desc;