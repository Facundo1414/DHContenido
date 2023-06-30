#1. Generar un reporte que responda la pregunta: ¿cuáles son los diez clientes que más dinero gastan y en cuantos alquileres lo hacen?

use sakila;

select concat(first_name, last_name) as cliente, count(rental_id) as cantidad_de_alquileres, sum(amount) as total from customer
join payment py
on py.customer_id = customer.customer_id
group by cliente
order by total desc
limit 10; 

#2. Generar un reporte que indique: el id del cliente, la cantidad de alquileres y el monto total para todos los clientes que hayan gastado más de 150 dólares en alquileres.

select customer.customer_id, count(rental_id) as cantidad_de_alquileres, sum(amount) as total from customer
join payment py
on py.customer_id = customer.customer_id
group by customer_id
having total > 150
order by total
; 

# 3. Generar un reporte que responda a la pregunta: ¿cómo se distribuyen la cantidad y el monto total de alquileres en los meses pertenecientes al año 2005? (tabla payment).

select count(payment_id) as cantidad_de_alquileres, sum(amount) as monto_total_en_2005  from payment
where year(payment_date) = '2005'
;

# 4. Generar un reporte que responda a la pregunta: ¿cuáles son los 5 inventarios más alquilados? (columna inventory_id en la tabla rental) Para cada una de ellas, indicar la cantidad de alquileres.

select inventory_id, count(rental_id) from rental
group by inventory_id
order by count(rental_id) desc
limit 5;

/*
Parte 2:
1. Generar un reporte que responda a la pregunta: Para cada tienda
(store), ¿cuál es la cantidad de alquileres y el monto total del dinero
recaudado por mes? */

select store.store_id, count(inventory_id) as cantidad_de_alquileres from store
join inventory inv
on inv.store_id = store.store_id
group by store.store_id;

/*
2. Generar un reporte que responda a la pregunta: ¿cuáles son las 10 películas
que generan más ingresos? ¿ Y cuáles son las que generan menos ingresos?
Para cada una de ellas indicar la cantidad de alquileres.*/

select * from film
order by replacement_cost desc
limit 10;



