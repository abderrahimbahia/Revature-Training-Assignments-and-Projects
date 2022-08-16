-- Programmer: Abderrahim Bahia

--Querying practice

--1- Select all records from the Employee table.
select * from "Employee" e ;

--Select all records from the Employee table where last name is King.
select * from "Employee" e 
where "LastName" like 'King';

--Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from "Employee" e 
where "FirstName" like 'Andrew'
and   "ReportsTo" = NULL;	

--Select all albums in Album table and sort result set in descending order by title.
select * from "Album" a 
order by "Title" desc;

--Select first name from Customer and sort result set in ascending order by city
select "FirstName"  from "Customer" c 
order by "City";

--Select all invoices with a billing address like “T%”
select * from "Invoice" i 
where "BillingAddress" like 'T%';

--Select all invoices that have a total between 15 and 50
select * from "Invoice" i 
where "Total" >= 15 and "Total" <= 50;

--Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from "Employee" e 
where "HireDate" >= '01-01-2003' and "HireDate" <= '01-03-2004';

--Insert practice

--Insert two new records into Genre table
insert into "Genre" values(26, 'Rhythm and Blues');
insert into "Genre" values(27, 'Country');

--Insert two new records into Employee table
insert into "Employee" values(9, 'Bahia', 'Abderrahim', 'IT Staff', '6', '01-01-1900', '01-08-2022', '6035 Ellington Cove', 'Atlanta', 'GA', 'United States', '30040', '4044044444', null, 'abahia@gmail.com');
insert into "Employee" values(10, 'Zidane', 'Zinedine', 'IT Staff', '6', '01-01-1999', '01-08-2022', '7854 Pits Road', 'Atlanta', 'GA', 'United States', '30350', '5054056053', null, 'zzidane@gmail.com');

--Insert two new records into Customer table
insert into "Customer" values(60,'raul', 'gonzalize', null, '457 Somewhere road', 'Madrid', null, 'Spain', '64798', '+46 5478 4578 4541', null, 'rgonzalize@gmail.com', 5);
insert into "Customer" values(61, 'Karim', 'Benzima', null, '5471 other road', 'Rabat', null, 'Morocco', '80000', '+212 4154 5412', null, 'kbenzima@gmail.com', 3);

--Update Practice

--Update Aaron Mitchell in Customer table to Robert Walter
update "Customer" 
set "FirstName" = 'Robert', "LastName" = 'Walter'
where "FirstName" = 'Aaron' and "LastName" = 'Mitchell';

--Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
update "Artist" 
set "Name" = 'CCR'
where "Name" = 'Creedence Clearwater Revival';
