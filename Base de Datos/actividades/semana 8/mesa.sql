use proyecto_spotify;

#1. Mostrar la cantidad de canciones que pertenecen a ambos géneros pop y rock cuyo nombre contiene la letra “m”.

select * from cancion
join generoxcancion gxc
on gxc.idCancion = cancion.idCancion
join genero g
on g.idgenero = gxc.idgenero
where titulo like '%m%' and Genero = 'Pop' or Genero = 'Rock';

##Listar todas las canciones que pertenezcan a más de una playlist. Incluir en el listado el nombre de la canción, el código y a cuántas playlists pertenecen.

select cancion.titulo,cancion.idCancion as codigo, count(pl.IdPlaylist) from cancion
join playlistxcancion pl
on pl.idCancion = cancion.idCancion
join playlist py
on py.IdPlaylist = pl.IdPlaylist
group by codigo;

#Generar un reporte con el nombre del artista y el nombre de la canción que no
#pertenecen a ninguna lista, ordenados alfabéticamente por el nombre del artista.

select artista.Nombre, c.titulo from artista
join album al
on al.idArtista = artista.idArtista
left join cancion c
on c.IdAlbum = al.IdAlbum
order by artista.Nombre
;

#Modificar el país de todos los usuarios con el código postal “7600” a “Argentina”.

update usuario
set cp = '7600'
where (select Pais_idPais from pais where Pais = 'Argentina')
;




