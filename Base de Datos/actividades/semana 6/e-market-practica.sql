use emarket;

select count(ClienteID) as "Cantidad de clientes" from clientes;
/* 91 */

select count(ClienteID) as "Cantidad de clientes",ciudad from clientes
group by ciudad;
/* clientes x ciudad */

			/* Facuturas */

SELECT sum(transporte) as "Total de Transporte" FROM facturas;
/* 64942.69000000006 */

SELECT sum(transporte) as "Total de Transporte",Enviovia FROM facturas group by Enviovia;
/*
16185.329999999998	1
28244.849999999988	2
20512.50999999998	3 
*/

select count(facturaID) as "Cantidad_de_Facturas", ClienteID from facturas
group by ClienteID
order by Cantidad_de_Facturas desc
limit 5;

select paisEnvio, min(facturaID) from facturas
group by paisEnvio
order by paisenvio desc
limit 1;
/* Venelueza */

select EmpleadoID, count(facturaid) from facturas
group by EmpleadoID
order by count(facturaid)
limit 1
;
/* 5 */

	
				/* Facuturas detalle */


select * from facturadetalle;

select count(productoid)


/*
1) ¿Cuál es el producto que aparece en más líneas de la tabla Factura Detalle?
2) ¿Cuál es el total facturado? Considerar que el total facturado es la suma de
cantidad por precio unitario.
3) ¿Cuál es el total facturado para los productos ID entre 30 y 50?
4) ¿Cuál es el precio unitario promedio de cada producto?
5) ¿Cuál es el precio unitario máximo?


Consultas queries XL parte II - JOIN
1) Generar un listado de todas las facturas del empleado 'Buchanan'.
2) Generar un listado con todos los campos de las facturas del correo 'Speedy
Express'.
3) Generar un listado de todas las facturas con el nombre y apellido de los
empleados.
4) Mostrar un listado de las facturas de todos los clientes “Owner” y país de envío
“USA”.
5) Mostrar todos los campos de las facturas del empleado cuyo apellido sea
“Leverling” o que incluyan el producto id = “42”.
6) Mostrar todos los campos de las facturas del empleado cuyo apellido sea
“Leverling” y que incluya los producto id = “80” o ”42”.
7) Generar un listado con los cinco mejores clientes, según sus importes de
compras total (PrecioUnitario * Cantidad).

3

8) Generar un listado de facturas, con los campos id, nombre y apellido del cliente,
fecha de factura, país de envío, Total, ordenado de manera descendente por
fecha de factura y limitado a 10 filas.







*/
