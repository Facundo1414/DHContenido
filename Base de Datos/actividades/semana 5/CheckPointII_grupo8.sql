
//* camada 7 - Allende Facundo - Pablo Morelli - Fagoaga Aitor - Ivan Miguez / Grupo 8  */


use dhalmundo;

/*. Listar todos los clientes que su apellido empiece por A, ordenados por apellido
de manera ascendente.*/
select * from clientes where apellidos like '%a%' 
order by apellidos asc;


/*Listar nombre, apellido,dirección de aquellos clientes que en su dirección
contengan la palabra “martin”.*/
select nombres,apellidos,direccion from clientes
where direccion like "%martin%";

/*Listar todos los hoteles que tengan de 30 a 60 habitaciones*/
select * from hoteles
where cantidadHabitaciones between 30 and 60;

/*Mostrar cuál ha sido el mayor importe facturado y llamarlo “Precio Mayor”,
también mostrar cuál es el total facturado y llamarlo “TOTAL”.*/

select max(precioTotal) AS 'Precio Mayor', sum(precioTotal) AS 'TOTAL'
from pagos;

/*Listar las reservas que fueron realizadas el día 16/01/2022 entre las 15hs y las
21hs pertenecientes a la sucursal número 5.*/

select * from reservas
where idSucursal = 5 and fechaRegistro  BETWEEN '2022-01-16 15:00:00' AND '2022-01-16 21:00:00' ;

/*Mostrar el top 3 de reservas con mayor cantidad de vuelos*/

SELECT idReserva, count(*) nrovuelos 
FROM vuelosxreserva 
GROUP BY idReserva 
ORDER BY nrovuelos DESC 
limit 3;

/*Listar los 10 pagos de menor precio.*/

 select * from pagos
 order by precioTotal asc
 limit 10;
 
 /*Listar todos los países ordenados alfabéticamente y con su nombre en
mayúsculas.*/
 
 select nombre as "Nombre" from paises
 order by nombre;
 
 /*Mostrar todos las reservas de vuelos que sean de clase turista y el id de vuelo
sea 11 o 13.*/
 
 select * from vuelosxreserva
 where idVuelo in (11,13) and idCategoriasVuelos = 2;
 
/* Listar los usuarios que hayan realizado 2 reservas.*/
 
SELECT COUNT(r.idCliente) cantidad_cliente, r.idCliente  FROM reservas r
GROUP BY r.idCliente
HAVING cantidad_cliente = 2;

/*Mostrar todos los vuelos que tengan como origen Italia o destino Jamaica.*/

select * from vuelos where origen like '%italia%'or destino like '%jamaica%';
 
 /*Mostrar todos los vuelos que tengan como destino Cuba y la cantidad de
pasajeros de primera clase sea menor o igual a 15 personas.*/

select * from vuelos
where destino = "cuba" and cantidadPrimeraClase <= 15;

/*Se desea conocer cuál es la cantidad de vuelos que tienen como origen México.*/

SELECT count(destino) FROM vuelos
where destino like "mexico";



/*Se desea conocer cuál es la cantidad de reservas realizadas en la sucursal de
Mendoza por el cliente cuyo pasaporte es EC158846.*/

select count(idreserva) as "Cantidad de reservas" from reservas
where idSucursal = 1 and idCliente = 13 ;


/*Cual es el promedio de pasajeros de clase turista que tengan como destino
Jamaica.*/

select avg(cantidadTurista) as "Promedio" from vuelos
where destino = "Jamaica";

/*Cual es el promedio de pasajeros de clase turista que tengan como destino
Jamaica.*/


/*Cual es el monto total de los pagos realizados en efectivo.(campo:preciototal ).*/

select sum(precioTotal) from pagos
where idMetodosPago = 1;


/*Mostrar el tercer importe de pagos realizado con menor valor.*/

select * from pagos
order by precioTotal asc
limit 1
offset 2;

/*Se desea conocer la cantidad de reservas realizadas en Chile más
específicamente en el 'Santiago Hotel' .*/

select count(idReserva) from hotelesxreserva
where idHotel = 15;

/*Agregar al cliente Solari Carlos cuyo pasaporte es AR221422 , domiciliado en
calle Av.Libertad 451 de la ciudad de Córdoba-Argentina, teléfono móvil
+542645667714.*/

update tiposhospedaje
set nombre = "Pensión Premium"
where nombre = 'Pensión Completa';

/*Modificar el tipo de hospedaje de 'Pensión Completa' a 'Pensión Premium'*/

insert into clientes (nombres, apellidos, numeroPasaporte, direccion, ciudad, telefono, idPais)  values ('solari', 'carlos', 'AR221422',' av.libertas 451', 1, '542645667714', 1);

