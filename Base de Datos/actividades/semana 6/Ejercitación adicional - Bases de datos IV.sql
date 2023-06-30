use movies_db;

#Join
#1. Utilizando la base de datos de movies, queremos conocer, por un lado, los
#títulos y el nombre del género de todas las series de la base de datos.


select title as Titulo, name as "Nombre de genero" from series
join genres ge
on ge.id = series.genre_id
;


#2. Por otro, necesitamos listar los títulos de los episodios junto con el nombre y
#apellido de los actores que trabajan en cada uno de ellos.


select title as Titulo, first_name as nombre, last_name as apellido from episodes
join actor_episode ac
on ac.episode_id = episodes.id
join actors a
on a.id = ac.actor_id
order by Titulo
;

#3. Para nuestro próximo desafío, necesitamos obtener a todos los actores o
# actrices (mostrar nombre y apellido) que han trabajado en cualquier película
# de la saga de La Guerra de las galaxias.

select first_name as nombre, last_name as apellido, title from actors
join actor_movie am
on am.actor_id = actors.id
join movies mv
on mv.id = am.movie_id
where title like 'La Guerra de las galaxias%'
;

select * from movies;

select * from genres;


#4. Crear un listado a partir de la tabla de películas, mostrar un reporte de la cantidad de películas por nombre de género.

select count(title) as cantidad_de_peliculas ,name from movies
join genres gs
on gs.id = movies.genre_id
group by name
order by name
;




