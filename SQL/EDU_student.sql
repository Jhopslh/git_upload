/*7/31*/

/*count,group by x join*/
select DEPARTMENTS.DEPARTMENT_NAME,EMPLOYEES.DEPARTMENT_ID,
count(EMPLOYEE_ID)
from EMPLOYEES
inner join DEPARTMENTS on departments.department_id=employees.department_id
group by DEPARTMENTS.DEPARTMENT_NAME,EMPLOYEES.DEPARTMENT_ID;

/*絤策9*/
/*Q1*/
select PLACE ,
    count(PLACE) as 跋羆掸计,
    max(CHLORINE) as 程パΤ緇粹, 
    min(CHLORINE) as 程パΤ緇粹,
    sum(HYDROGEN) as 粹瞒緻计羆㎝,
    avg(TURBIDITY) as 緽キА
from SQL_TAOYUAN_WATER
where PLACE in('T40','T44','T16')
group by PLACE 

/*Q2*/
select 
    SQL_TAOYUAN_REGIONS.TOWNSHIP as ︽現跋,
    count(SQL_TAOYUAN_WATER.place) as 跋羆掸计,
    avg(TURBIDITY) as 緽キА
from SQL_TAOYUAN_WATER, SQL_TAOYUAN_REGIONS
where SQL_TAOYUAN_WATER.place=sql_taoyuan_regions.serial 
group by SQL_TAOYUAN_REGIONS.TOWNSHIP
having avg(TURBIDITY)>0.7;

/*絤策10*/
insert into PRACTICE_EMP_0190040 
values('E0731','Emily','Z9999','1000#1010','XXXX场');
commit;

update PRACTICE_EMP_0190040 
set TEL='9999#9999';
commit;

delete from PRACTICE_EMP_0190040 
commit;

insert into PRACTICE_EMP_0190040
select * from SQL_EMP
where DEP='╰参秨祇场';

/*琩高絤策*/
select LAST_NAME, JOB_ID, SALARY
from EMPLOYEES
where JOB_ID= (select JOB_ID from EMPLOYEES where EMPLOYEE_ID=141)
and SALARY> (select SALARY from EMPLOYEES where EMPLOYEE_ID=143);

select LAST_NAME, JOB_ID, SALARY 
from EMPLOYEES
where SALARY=(select min(SALARY) from EMPLOYEES);

select DEPARTMENT_ID, min(SALARY)
from EMPLOYEES
group by DEPARTMENT_ID
having min(SALARY)<(select min(SALARY) from EMPLOYEES where DEPARTMENT_ID=50);

/*ANY絤策*/
select EMPLOYEE_ID, LAST_NAME, JOB_ID, SALARY
from EMPLOYEES
where SALARY <any(select SALARY from EMPLOYEES where JOB_ID='IT_PROG')
and JOB_ID <>'IT_PROG';
    