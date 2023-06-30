use emarket;

/*1) Empleados
a) Crear un SP que liste los apellidos y nombres de los empleados ordenados
alfabéticamente.
b) Invocar el SP para verificar el resultado.*/


DELIMITER $$
CREATE PROCEDURE sp_listaEmpleados()
BEGIN
	SELECT concat(Nombre, Apellido) as Empleado from empleados
    order by Empleado;
END $$

DELIMITER ;

CALL sp_listaEmpleados;

/*2) Empleados por ciudad
a) Crear un SP que reciba el nombre de una ciudad y liste los empleados de esa
ciudad.
b) Invocar al SP para listar los empleados de Seattle. */


DELIMITER $$
CREATE PROCEDURE sp_listarEmpleadoPorCiudad(IN filtro_ciudad Varchar(10))
BEGIN
	SELECT concat(Nombre, Apellido) as Empleado from empleados
    where Ciudad = filtro_ciudad
    order by Empleado;
END $$

DELIMITER ;


CALL sp_listarEmpleadoPorCiudad('Seattle');


/*
3) Clientes por país
a) Crear un SP que reciba el nombre de un país y devuelva la cantidad de clientes
en ese país.
b) Invocar el SP para consultar la cantidad de clientes en Portugal. */


DELIMITER $$
CREATE PROCEDURE sp_cantidadClientesPorPais(IN filtro_pais Varchar(25))
BEGIN
	SELECT count(ClienteID) as cantidad_de_clientes, pais from clientes
    where Pais = filtro_pais
    group by pais;
    
END $$

DELIMITER ;

CALL sp_cantidadClientesPorPais('Portugal');

/*
4) Productos sin stock
a) Crear un SP que reciba un número y liste los productos cuyo stock está por
debajo de ese número. El resultado debe mostrar el nombre del producto, el
stock actual y el nombre de la categoría a la que pertenece el producto.
b) Listar los productos con menos de 10 unidades en stock.
c) Listar los productos sin stock. */






/*
5) Ventas con descuento
a) Crear un SP que reciba un porcentaje y liste los nombres de los productos que
hayan sido vendidos con un descuento igual o superior al valor indicado,
indicando además el nombre del cliente al que se lo vendió.
b) Listar la información de los productos que hayan sido vendidos con un
descuento mayor al 10%.
*/


DELIMITER $$
CREATE PROCEDURE sp_porcentajeNombre (IN porcentaje double)
BEGIN 
	select pr.ProductoNombre , cl.Contacto from facturadetalle
    join productos pr on pr.ProductoID = facturadetalle.ProductoID
    join facturas fac on fac.FacturaID = facturadetalle.FacturaID
    join clientes cl on cl.ClienteID = fac.ClienteID
    where facturadetalle.Descuento >= (porcentaje/100)
	;

END $$
DELIMITER ;

CALL sp_porcentajeNombre(20);

