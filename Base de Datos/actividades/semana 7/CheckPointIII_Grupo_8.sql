-- ========================== Proyecto - DHespegar =========================== --
use dhalmundo;
-- =========================== Resolucion Checkpoint III ========================== --
-- INTEGRANTES: Allende Facundo, Pablo Morelli, Aitor Fagoaga, Ivan Miguez

-- 1. Listar todas las reservas de hoteles realizadas en la ciudad de Napoles

select * from hotelesxreserva
where idHotel = (select idhotel from hoteles where ciudad = 'Napoles');

-- cantidad de registros que devuelve = 6 

-- 2.Listar el numero de pago (idpago), el precio , la cantidad de cuotas de todas las reservas realizadas con tarjeta de credito

select reservas.idPago,precioTotal,cantidadCuotas from reservas
join pagos pg
on pg.idPago = reservas.idPago
join metodospago mtp
on mtp.idMetodosPago = pg.idMetodosPago
where nombre = 'Tarjeta de Crédito';

-- cantidad de registros que devuelve = 19 

-- 3.Listar la cantidad de reservas realizadas de acuerdo al metodo de pago

select count(idreserva) as 'Cantidad de reservas realizadas',nombre as 'Metodo de pago' from reservas
join pagos pg
on pg.idPago = reservas.idPago
join metodospago mtp
on mtp.idMetodosPago = pg.idMetodosPago
group by nombre;

-- cantidad de registros que devuelve = 3

-- 4.Listar las reservas de los clientes cuyo pago lo hicieron a traves de tarjeta de credito ,se pide mostrar el nombre ,apellido ,pais y el metodo de pago

select concat(cl.nombres,' ',cl.apellidos) as Cliente,ps.nombre as Pais, mtp.nombre as 'Metodo de pago' from reservas
join pagos pg
on pg.idPago = reservas.idPago
join metodospago mtp
on mtp.idMetodosPago = pg.idMetodosPago
join clientes cl
on cl.idCliente = reservas.idCliente
join paises ps
on ps.idPais = cl.idPais
where mtp.nombre = 'Tarjeta de Crédito';

-- cantidad de registros que devuelve = 19

-- 5. Listar la cantidad de reservas de hoteles por pais ,se necesita mostrar el nombre del pais y la cantidad 

select ps.nombre as 'Pais', count(reservas.idreserva) as 'Cantidad de reservas de hoteles por pais' from reservas
join hotelesxreserva hxr
on hxr.idReserva = reservas.idReserva
join hoteles hs
on hs.idHotel = hxr.idHotel
join paises ps
on  ps.idPais = hs.idPais
group by ps.nombre;

-- cantidad de registros que devuelve = 8

-- 6. Listar el nombre ,apellido ,numero de pasaporte,ciudad y nombre del pais de los clientes de origen Peruano 

select concat(clientes.nombres,' ',clientes.apellidos) as Cliente, numeroPasaporte,ciudad,ps.nombre as Pais from clientes
join paises ps
on  ps.idPais = clientes.idPais
where ps.nombre = 'Peru';

-- cantidad de registros que devuelve = 5 

-- 7.Listar la cantidad de reservas realizadas de acuerdo al cliente y el método de pago, mostrar el nombre completo del cliente, y el método de pago, ordenar por apellido

SELECT mtp.nombre AS 'Metodo de pago', CONCAT(cl.apellidos,' ',cl.nombres) AS Cliente, COUNT(reservas.idreserva) as cantidad 
FROM reservas
JOIN clientes cl ON cl.idCliente = reservas.idCliente
JOIN pagos pg ON pg.idPago = reservas.idPago                          
JOIN metodospago mtp ON mtp.idMetodosPago = pg.idMetodosPago
GROUP BY mtp.nombre, Cliente
order by Cliente ASC;

-- cantidad de registros que devuelve = 51 

-- 8. Mostrar la cantidad de  clientes por  pais ,se necesita visualizar el nombre del pais y la cantidad de clientes 

select ps.nombre as Pais, count(idcliente) as 'Cantidad de clientes' from clientes
join paises ps 
on ps.idPais = clientes.idPais
group by ps.nombre
order by ps.nombre;

-- cantidad de registros que devuelve = 11 

-- 9. Listar todas las reservas de hotel ,se pide mostrar el nombre del hotel,direccion ,ciudad ,el pais y que tengan como tipo de hospedaje 'Media pension'

select hs.nombre as Hotel, hs.direccion, hs.ciudad, ps.nombre as Pais,tpdh.nombre as 'tipo de hospedaje' from hotelesxreserva
join hoteles hs
on hs.idHotel = hotelesxreserva.idHotel
join tiposhospedaje tpdh
on tpdh.idTiposHospedaje = hotelesxreserva.idTiposHospedaje
join paises ps
on ps.idPais = hs.idPais
where tpdh.nombre = 'Media Pensión ';

-- cantidad de registros que devuelve = 22

-- 10.Mostrar por cada metodo de pago el monto total obtenido,se pide visualizar el nombre del metodo de pago y el total 

select nombre as 'metodo de pago', sum(precioTotal) as 'Monto total' from metodospago
join pagos pg
on pg.idMetodosPago = metodospago.idMetodosPago
group by nombre;

-- cantidad de registros que devuelve = 3 

-- 11.Mostrar la suma de los pagos realizados en la sucursal de Mendoza, llamar al resultado “TOTAL MENDOZA”.

select ciudad,sum(precioTotal) as 'TOTAL MENDOZA' from sucursales
join reservas rs
on rs.idSucursal = sucursales.idSucursal
join pagos pg
on pg.idPago = rs.idPago
where ciudad = 'Mendoza'
group by ciudad;

-- cantidad de registros que devuelve = 1

-- 12.Listar todos los clientes que no han realizado reservas.

select * from clientes
left join reservas rs
on rs.idcliente = clientes.idcliente
where idreserva is null;

-- cantidad de registros que devuelve = 34

-- 13.Listar todas las reservas de vuelos realizadas donde el origen sea Chile y el destino Ecuador, mostrar el código de la reserva, número de vuelo, fecha de partida, fecha de llegada, fecha de la reserva.

select codigoReserva as 'código de la reserva',nroVuelo as 'número de vuelo',fechaPartida,fechaLlegada,fechaRegistro as 'fecha de la reserva' from vuelosxreserva
join vuelos vl
on vl.idVuelo = vuelosxreserva.idVuelo
join reservas rs
on rs.idReserva = vuelosxreserva.idReserva
where origen = 'CHILE' and destino = 'ECUADOR';

-- cantidad de registros que devuelve = 3

-- 14.Listar el nombre y cantidad de habitaciones de aquellos hoteles que tengan de 30 a 70 habitaciones pertenecientes al país Argentina.

select hoteles.nombre as 'Hotel', sum(cantidadHabitaciones) as habitaciones from hoteles
join paises ps
on ps.idPais = hoteles.idPais
where (cantidadHabitaciones between 30 and 70) and ps.nombre = 'Argentina'
group by hoteles.nombre;

-- cantidad de registros que devuelve = 3

-- 15.Listar el top 10 de hoteles más utilizados y la cantidad de reservas en las que ha sido reservado.

select hoteles.nombre as hotel, count(rs.idReserva) as cantidad from hoteles
join hotelesxreserva hxr
on hxr.idHotel = hoteles.idHotel
join reservas rs
on rs.idReserva = hxr.idReserva
group by hoteles.nombre
order by cantidad desc
limit 10;

-- cantidad de registros que devuelve = 10

-- 16.Listar los clientes (nombre y apellido) que pagaron con transferencia bancara o en efectivo, esta lista deberá estar ordenada por apellidos de manera ascendente.

SELECT mtp.nombre AS 'Metodo de pago', CONCAT(cl.apellidos,' ',cl.nombres) AS Cliente, COUNT(reservas.idreserva) as cantidad 
FROM reservas
JOIN clientes cl ON cl.idCliente = reservas.idCliente
JOIN pagos pg ON pg.idPago = reservas.idPago                          
JOIN metodospago mtp ON mtp.idMetodosPago = pg.idMetodosPago
where mtp.nombre = 'Efectivo' or mtp.nombre = 'Transferencia Bancaria'
GROUP BY mtp.nombre, Cliente
order by Cliente ASC;

-- cantidad de registros que devuelve = 37

-- 17.Listar la cantidad de reservas que se realizaron para los vuelos que el origen ha sido de Argentina o Colombia, cuyo horario de partida sean las 18:11 hs. Mostrar la cantidad de vuelos y país de origen.

SELECT count(vl.idVuelo) as 'cantidad de vuelos', origen as ' país de origen' FROM vuelosxreserva
JOIN vuelos vl
ON vl.idVuelo = vuelosxreserva.idVuelo
JOIN reservas rs										
ON rs.idReserva = vuelosxreserva.idReserva
WHERE (vl.origen = 'ARGENTINA' OR vl.origen = 'COLOMBIA') AND DATE_FORMAT(vl.fechaPartida, '%H:%i') = '18:11'
group by origen;

-- cantidad de registros que devuelve = 1

-- 18.Mostrar los totales de ventas de sucursales por países y ordenarlas de mayor a menor.

select ps.nombre as pais, sum(precioTotal) as 'totales de ventas' from sucursales
join paises ps
on ps.idPais = sucursales.idPais
join reservas rs
on rs.idSucursal = sucursales.idSucursal
join pagos pg
on pg.idPago = rs.idPago
group by pais
order by sum(precioTotal) desc
;

-- cantidad de registros que devuelve = 2

-- 19.Mostrar los países que no tienen clientes asignados ordenados por los que empiezan por Z primero(desc).

select * from paises
left join clientes cl
on cl.idpais = paises.idpais
where cl.nombres is null
order by paises.nombre desc
;

-- cantidad de registros que devuelve = 19

-- 20. Generar un listado con los hoteles que tuvieron más de 2 reservas realizadas. Mostrar el nombre del hotel y la cantidad.

select hoteles.nombre as Hotel, count(rs.idReserva) as 'Cantidad de reservas realizadas' from hoteles
join hotelesxreserva hxr
on hxr.idHotel = hoteles.idhotel
join reservas rs
on rs.idReserva = hxr.idReserva 
group by hotel
having count(rs.idReserva) > 2;

-- cantidad de registros que devuelve = 4

