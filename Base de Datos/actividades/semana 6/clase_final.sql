/*Realizar una consulta de la facturación de e-market. Incluir la siguiente información:
● Id de la factura
● fecha de la factura
● nombre de la empresa de correo
● nombre del cliente
● categoría del producto vendido
● nombre del producto
● precio unitario
● cantidad*/

select f.FacturaID, f.FechaFactura, c.Compania, cl.Compania as correo, cat.CategoriaNombre as nombre_categoria , p.ProductoNombre, fd.PrecioUnitario, fd.Cantidad from facturas f
inner join correos c
on f.EnvioVia = c.CorreoID
join clientes cl
on f.ClienteID = cl.ClienteID
join facturadetalle fd
on f.FacturaID = fd.FacturaID
join productos p
on p.ProductoID = fd.ProductoID
join categorias cat
on p.CategoriaID = cat.CategoriaID;

/*1. Listar todas las categorías junto con información de sus productos. Incluir todas
las categorías aunque no tengan productos.
*/

select c.CategoriaNombre, p.ProductoNombre from categorias c left join productos p
on c.CategoriaID = p.CategoriaID;
/*2. Listar la información de contacto de los clientes que no hayan comprado nunca
en emarket.*/

select cl.contacto, cl.direccion, cl.ciudad, fac.FacturaID from facturas fac
right join clientes cl
on fac.ClienteID = cl.ClienteID
order by fac.FacturaID;

/*3. Realizar un listado de productos. Para cada uno indicar su nombre, categoría, y
la información de contacto de su proveedor. Tener en cuenta que puede haber
productos para los cuales no se indicó quién es el proveedor*/

select p.ProductoNombre, cat.CategoriaNombre, pr.compania as proveedor from productos p 
join categorias cat
on p.CategoriaID = cat.CategoriaID
left join proveedores pr
on pr.ProveedorID = p.ProveedorID;

/*4. Para cada categoría listar el promedio del precio unitario de sus productos.
*/

select cat.CategoriaNombre, round(avg(PrecioUnitario),2) as precio_promedio from productos p 
join categorias cat
on p.CategoriaID = cat.CategoriaID
group by cat.CategoriaNombre;
/*5. Para cada cliente, indicar la última factura de compra. Incluir a los clientes que
nunca hayan comprado en e-market.
*/

select cl.Compania, coalesce(max(fechafactura),"nunca compro") as fecha from facturas fac
right join clientes cl
on fac.ClienteID = cl.ClienteID
group by cl.Compania;

/*6. Todas las facturas tienen una empresa de correo asociada (enviovia). Generar un
listado con todas las empresas de correo, y la cantidad de facturas
correspondientes. Realizar la consulta utilizando RIGHT JOIN.*/

select c.Compania, count(f.FacturaID) as cantidad from facturas f
right join correos c
on f.EnvioVia = c.CorreoID
group by c.Compania;

/*1. Crear una vista con los siguientes datos de los clientes: ID, contacto, y el
Fax. En caso de que no tenga Fax, colocar el teléfono, pero aclarándolo. Por
ejemplo: “TEL: (01) 123-4567”.*/

select ClienteID, contacto, fax,
case
	when fax = "" then concat("TEL: ", telefono)
    else fax
end as telfax
from clientes;