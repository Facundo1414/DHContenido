USE musimundos;

select count(pais) from clientes
where pais = "Brazil";

select id_genero, count(id) as 'Cantidad de canciones' from canciones
group by id_genero;

select sum(total) from facturas;

select avg(milisegundos) as 'duracion',id_album from canciones
group by id_album
order by duracion;

select min(bytes) from canciones;

select id_cliente,sum(total) from facturas
group by id_cliente
having sum(total) > 45
;


use movies_db;

select count(id) as "cantin  dad de peliculas" from movies /* 21 */
;

select count(id) as "cantidad de peliculas" from movies
where (awards between 3 and 7) and rating > 7
;

select count(id) as "cantin  dad de peliculas", genre_id from movies
group by genre_id
;


select count(id) as "cantin  dad de peliculas", genre_id from movies
group by genre_id
having sum(awards) > 5
;


