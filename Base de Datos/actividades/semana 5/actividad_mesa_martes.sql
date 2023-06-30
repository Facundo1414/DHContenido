use musimundos;

# actividad 1
select * from canciones
where milisegundos > 120000;

# actividad 2
select * from canciones
where nombre like "A%" or  "E%" or  "I%" or  "O%" or  "U%";

# actividad 3
select * from canciones
order by compositor desc;

select * from canciones
where compositor != "" 
order by nombre;

# actividad 4
select count(nombre) as "Cantidad de canciones", compositor from canciones
group by compositor
having count(nombre) > 10;

# actividad 5
select ciudad_de_facturacion, sum(total) as total from facturas
where pais_de_facturacion = "Canada"
group by ciudad_de_facturacion
having total > 38;

select pais_de_facturacion, ciudad_de_facturacion, sum(total) as total from facturas
group by pais_de_facturacion, ciudad_de_facturacion
order by pais_de_facturacion;

# actividad 6
select id_genero, min(milisegundos) as Minimo, max(milisegundos) as Maximo, avg(milisegundos) as Promedio from canciones
group by id_genero;
