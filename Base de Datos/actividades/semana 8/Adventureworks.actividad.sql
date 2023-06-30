use adventureworks;

#where
select Name,ListPrice,Color from product
where ListPrice > 100;

#Operadores & joins
select * from employee
where VacationHours > 90;

select Name,ListPrice from product
where ListPrice != 0;

select ProductID, Name, ListPrice from product
where ProductID between 776 and 778;

#Order by

select FirstName,LastName from contact
order by LastName and FirstName;

#Funciones de agregación
select count(LineTotal), sum(LineTotal) from salesorderdetail;

#Group by

select ps.Name,min(ListPrice) from product
join ProductSubcategory ps
on ps.ProductSubcategoryID = product.ProductSubcategoryID
group by ps.Name;

#Having

select SalesOrderID,LineTotal from salesorderdetail
where LineTotal > 10000
order by SalesOrderID;

#Joins
select LastName,FirstName from employee
join contact c
on c.ContactID = employee.ContactID;

