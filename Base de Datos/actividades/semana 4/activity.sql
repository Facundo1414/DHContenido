select CategoriaNombre,Descripcion from emarket.categorias;

select * from emarket.productos
where Discontinuado = 0;

select * from emarket.productos
where ProveedorID = 8;

select * from emarket.productos
where PrecioUnitario between 10 and 22;

select * from emarket.productos
where UnidadesStock < NivelReorden;

select * from emarket.productos
where UnidadesStock < NivelReorden and UnidadesPedidas = 0;


select Contacto,Compania,Titulo,Pais from emarket.clientes
order by Pais;

select * from emarket.clientes
where Titulo = "Owner";

select * from emarket.clientes
where Contacto like "C%";


select * from emarket.facturas
order by FechaFactura;

select * from emarket.facturas
where PaisEnvio = "USA" and EnvioVia != 3;

select * from emarket.facturas
where clienteID = "GOURL";

select * from emarket.facturas
where EmpleadoID in (2,3,5,8,9)
order by EmpleadoID;


select * from emarket.productos
order by PrecioUnitario desc;

select * from emarket.productos
order by PrecioUnitario desc
limit 5;

select * from emarket.productos
order by UnidadesStock desc
limit 10;

select FacturaID,ProductoID,Cantidad from facturadetalle
where cantidad between 50 and 100
order by Cantidad desc
;

select FacturaID,ProductoID,(PrecioUnitario * Cantidad) AS "Total" from facturadetalle
;


select * from emarket.clientes
where Pais in ("Brazil","Mexico") or Titulo like "Sales%";

select * from emarket.clientes
where Compania like "A%";

select Ciudad as "Apellido", Ciudad as "Nombre", Titulo as "Puesto" from emarket.clientes
where Ciudad = "Madrid";

select * from emarket.facturas
where FacturaID between 10000 and 10500 or ClienteID like "B%";

select * from emarket.facturas
where CiudadEnvio = "Vancouver" or EnvioVia = 3;

select * from emarket.empleados
;