--Programmer: abderrahim bahia
--SQL Assignment

-- 1 Select each number as its opposite
select -value from table1;

-- 2 Select all the divisions thet have had revenue this year
select id from table1 
where revenue > 0 
and year >=  '01-01-2021'
and year <= '12-31-2021'; 

-- 3 Find the century for the year
select year/100 as century from table1;

-- 4 Even or Odd
select case 
	when value % 2 = 0 then 'even' 
	when value % 2 = 1 then 'odd' 
	end as even_odd 
	from table1;

-- 5 Group by age
select age, count(age) as count from table1 
group by age
order by age;  

-- 6 Return a greeting string
select concat('Hi, ', name, '! How are you today?') from table1; 

-- 7 Find the best selling products
select  name, amountSold
from table1 t 
order by amountSold desc
fetch first 5 rows only;

-- 8 Who needs a passport
select name from table1 t 
where country != 'united states' and country != 'canada';

-- 9 Just the unique value
select distinct age from table1;

-- 10 Add the ages
select sum(age) from table1; 
 

