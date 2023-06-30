use sakila;

select first_name as Nombre, last_name as Apellido from actor
limit 5;
# muestra los 5 primeros nombres de los actores

select  first_name as Nombre, last_name as Apellido, email as Correo from customer
where active = 0;
# filtra usuarios innactivos

select title as Titulo, release_year as "Anio de estreno", description from film
where rental_duration > 5
order by rental_duration desc
;
#devuelve peliculas 

select * from rental
where rental_date between '2005-05-01' and '2005-06-01'
;

select * from rental
where year(rental_date) = 2005 and month(rental_date) = 05;