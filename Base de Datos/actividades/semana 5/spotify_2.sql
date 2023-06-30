select * from proyecto_spotify.cancion
where titulo like "%z%";

select * from proyecto_spotify.cancion
where titulo like "_a%" and titulo like "%s";

select idusuario AS "id Usuarios", titulo AS "Titulo", cantcanciones AS "Cant Canciones", idestado AS "id Estado" from proyecto_spotify.playlist
order by cantcanciones desc
limit 1;

select * from proyecto_spotify.usuario
order by fecha_nac
limit 10
offset 5;

select * from proyecto_spotify.cancion
order by cantreproduccion desc
limit 5;


select * from proyecto_spotify.album
order by titulo;

select * from proyecto_spotify.album
where imagenportada is null
order by titulo;

select * from proyecto_spotify.usuario;

insert into proyecto_spotify.usuario
(nombreusuario, nyap, fecha_nac, sexo, CP, password ,Pais_idPais)
value
("nuevousuariodespotify@gmail.com","Elmer Gomez","1991-11-15","M","B4129ATF","S4321m",2);

insert into proyecto_spotify.usuario
(nombreusuario, nyap, fecha_nac, sexo, CP, password ,Pais_idPais, idUsuario)
value
("JUan@gmail.com","Elmer GomjuANez","1991-11-15","M","B41DD29ATF","S43D21m",2, 20);


select * from proyecto_spotify.generoxcancion;

delete from proyecto_spotify.generoxcancion
where IdGenero = 9;

select * from proyecto_spotify.artista;

update proyecto_spotify.artista 
set imagen = "imagen faltante"
where imagen is null;
