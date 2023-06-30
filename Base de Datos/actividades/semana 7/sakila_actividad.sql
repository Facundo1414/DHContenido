use sakila;

#1. Obtener el nombre y apellido de los primeros 5 actores disponibles. Utilizaralias para mostrar los nombres de las columnas en español.

select first_name as Nombre,last_name as Apellido from actor
limit 5;

#2. Obtener un listado que incluya nombre, apellido y correo electrónico de losclientes (customers) inactivos. Utilizar alias para mostrar los nombres de lascolumnas en español.

select first_name as Nombre,last_name as Apellido,email from customer
where active = 0;

#3. Obtener un listado de films incluyendo título, año y descripción de los films que tienen un rental_duration mayor a cinco. Ordenar por rental_duration de mayor a menor. Utilizar alias para mostrar los nombres de las columnas en español.

select title as titulo, release_year as estreno, description as descripccion from film
where rental_duration > 5
order by rental_duration desc;

#4. Obtener un listado de alquileres (rentals) que se hicieron durante el mes de mayo de 2005, incluir en el resultado todas las columnas disponibles.

select * from rental
where rental_date between '2005-05-01' and '2005-06-01';
		



# Reportes parte 2: Sumemos complejidad


# Obtener la cantidad TOTAL de alquileres (rentals). Utilizar un alias para mostrarlo en una columna llamada “cantidad”.


select count(rental_Id) as 'Cantidad alquileres' from rental;


#2. Obtener la suma TOTAL de todos los pagos (payments). Utilizar un alias para mostrarlo en una columna llamada “total”, junto a una columna con la
# cantidad de alquileres con el alias “Cantidad” y una columna que indique el “Importe promedio” por alquiler.

select count(payment_id) as total ,count(r.rental_Id) as 'Cantidad alquileres',avg(amount) as 'Importe promedio'  from payment
join rental r 
on r.rental_Id = payment.rental_Id;


#3. Generar un reporte que responda la pregunta: ¿cuáles son los diez clientes
# que más dinero gastan y en cuántos alquileres lo hacen?

 select customer.customer_id,  first_name as Nombre,last_name as Apellido, sum(amount) as gasto, count(rl.rental_id) as 'Cantidad de alquileres' from customer
join payment pay
on pay.customer_id = customer.customer_id
join rental rl
on rl.customer_id = customer.customer_id
group by customer.customer_id
order by gasto
limit 10
;

select * from rental;



/*4. Generar un reporte que indique: ID de cliente, cantidad de alquileres y monto
total para todos los clientes que hayan gastado más de 150 dólares en
alquileres.*/


 select customer.customer_id,count(rl.rental_id) as 'Cantidad de alquileres',sum(amount) as gasto from customer
join payment pay
on pay.customer_id = customer.customer_id
join rental rl
on rl.customer_id = customer.customer_id
group by customer.customer_id
having gasto > 150;



/*5. Generar un reporte que muestre por mes de alquiler (rental_date de tabla
rental), la cantidad de alquileres y la suma total pagada (amount de tabla
payment) para el año de alquiler 2005 (rental_date de tabla rental).*/

select month(rental_date) as mes, count(rental.rental_id) as 'Cantidad de alquileres', sum(amount) as gasto from rental
join payment pay
on pay.rental_id = rental.rental_id
where year(rental_date) = 2005
group by mes
;


#6. Generar un reporte que responda a la pregunta: ¿cuáles son los 5
#inventarios más alquilados? (columna inventory_id en la tabla rental). Para
#cada una de ellas indicar la cantidad de alquileres.


SELECT inventory_id, count(*)
from rental
group by inventory_id
order by count(*) desc
Limit 5;


