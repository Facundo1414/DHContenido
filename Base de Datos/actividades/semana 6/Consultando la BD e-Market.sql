use emarket;

select facturas.FacturaID, FechaFactura, NombreEnvio as "empresa de correo", Contacto as Cliente, Cantidad, fc.PrecioUnitario ,ProductoNombre, CategoriaNombre from facturas
join facturadetalle fc
on fc.FacturaID = facturas.FacturaID
join clientes cl
on cl.ClienteID = facturas.ClienteID
join productos pr
on pr.ProductoID = fc.ProductoID
join categorias cat
on cat.CategoriaID = pr.CategoriaID
;


#Reportes parte II - INNER, LEFT Y RIGHT JOIN

#1. Listar todas las categorías junto con información de sus productos. Incluir todas
# las categorías aunque no tengan productos.

select * from categorias
left join productos pr 
on categorias.CategoriaID = pr.CategoriaID;



#2. Listar la información de contacto de los clientes que no hayan comprado nunca
# en emarket.

select Contacto from clientes
LEFT join facturas fc
on fc.ClienteID = clientes.ClienteID
where FacturaID is null;

# 3 Realizar un listado de productos. Para cada uno indicar su nombre, categoría, y
# la información de contacto de su proveedor. Tener en cuenta que puede haber
# productos para los cuales no se indicó quién es el proveedor.

select ProductoNombre, pv.* , CategoriaNombre from productos
left join proveedores pv
on pv.ProveedorID = productos.ProveedorID
JOIN categorias ct
on ct.CategoriaID = productos.CategoriaID;

# 4. Para cada categoría listar el promedio del precio unitario de sus productos.


select CategoriaNombre, avg(PrecioUnitario) as "Promedio de precios Unitarios" from categorias
join productos p
on p.CategoriaID = categorias.CategoriaID
group by CategoriaNombre
;

#5. Para cada cliente, indicar la última factura de compra. Incluir a los clientes quenunca hayan comprado en e-market.

select Contacto, max(FechaFactura) from clientes
LEFT join facturas fc
on fc.ClienteID = clientes.ClienteID
group by Contacto
;


#6. Todas las facturas tienen una empresa de correo asociada (enviovia). Generar un listado con todas las empresas de correo, y la cantidad de facturas
# correspondientes. Realizar la consulta utilizando RIGHT JOIN.


select  Compania,count(FacturaID) FROM facturas
right join correos c
on c.CorreoID = facturas.EnvioVia
group by Compania;



