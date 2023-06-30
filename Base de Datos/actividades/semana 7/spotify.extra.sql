use proyecto_spotify;

# 2. Generar un reporte, donde se muestre el método de pago , la cantidad
# de operaciones que se realizaron con cada uno y el importe total .

select TipoFormaPago as 'Metodo de pago', count(ds.IdDatosPagoxUsuario) as 'cantidad de operaciones' , sum(Importe) as total from pagos
join datospagoxusuario ds
on ds.idDatosPagoxUsuario = pagos.idDatosPagoxUsuario
join tipoformapago tp
on tp.idTipoFormaPago = ds.idTipoFormaPago
group by TipoFormaPago;

# Genera un reporte por género e informar la cantidad de canciones que
# posee. Si una canción tiene más de un género, debe ser incluida en la
# cuenta de cada uno de esos géneros.


select genero,count(IdCancion) as 'cantidad de canciones'  from genero
join generoxcancion gxc
on gxc.IdGenero = genero.IdGenero
group by genero;

#Listar la suma total obtenida por cada tipo de suscripción, en el periodo
#del 01-01-2020 al 31-12-2020

select tp.TipoUsuario, count(idSuscripcion) as 'cantidad de usuarios' from suscripcion
join tipousuario tp
on tp.IdTipoUsuario = suscripcion.IdTipoUsuario
where FechaInicio between '2020-01-01' and '2020-12-31'
group by tp.TipoUsuario ;


#Listar todas las canciones hayan o no recibido likes (cuántos) y
#aclarar si han sido reproducidas o no. Listar las 15 primeras ordenadas
#como si fueran un Ranking


select titulo,cantreproduccion,cantlikes from cancion
order by cantreproduccion desc
limit 15;



#14.Listar todas las canciones, el nombre del artista, la razón social de la
#discográfica y la cantidad de veces que fue reproducida.

select cancion.titulo, ar.Nombre as artista, ds.nombre as "razon social", cantreproduccion from cancion
join album ab
on ab.idAlbum = cancion.idAlbum
join artista ar
on ar.idArtista = ab.idArtista
join discografica ds
on ds.idDiscografica = ab.idDiscografica;


#Generar un reporte por usuario , listando las suscripciones que tiene o
#tuvo, el importe que abonó y los datos de las formas de pago con que
#lo realizó.


select nombreusuario,count(ss.idSuscripcion) as name,sum(importe) as importe,max(fechaPago) as ultimaFecha from usuario
join suscripcion ss
on ss.idUsuario = usuario.idUsuario
join pagos pg
on pg.idpagos = ss.idpagos
group by nombreusuario;












