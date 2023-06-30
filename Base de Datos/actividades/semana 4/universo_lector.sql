create schema `Universo_lector`;
create table `Universo_lector`.`libro`(
`id_libro` int not null,
`ISBN` varchar(13) null,
`titulo` varchar(200) null,
`anio_escritura` date null,
`anio_edicion` date null,
primary key (`id_libro`),
`autor`int null,
`editorial` int null,
index `autor_idx` (`autor` ASC) VISIBLE,
index `editorial_idx` (`editorial` ASC) VISIBLE,
constraint `autor`
	foreign key (`autor`)
    references`Universo_lector`.`autor` (`id_autor`),
constraint `editorial`
	foreign key (`editorial`)
    references `Universo_lector`.`editorial` (`id_editorial`)
);
create table `Universo_lector`.`autor`(
 `id_autor` int not null,
 `apellido` varchar(100) null,
 `nombre` varchar (100) null,
  primary key (`id_autor`)
);
create table `Universo_lector`.`editorial`(
	`id_editorial` int not null,
    `razon_social` varchar(100) null,
    `telefono` varchar(100) null,
    primary key (`id_editorial`));
create table`Universo_lector`.`volumen`(
`id_volumen` int not null,
`libro` int null,
`deteriorado` boolean null,
primary key (`id_volumen`),
constraint `libro`
	foreign key(`libro`)
    references `Universo_lector`.`libro`(`id_libro`));
create table `Universo_lector`.`prestamo_x_volumen`(
`id_prestamoxvolumen` int not null,
`prestamo` int null,
`volumen` int null,
primary key (`id_prestamoxvolumen`),

index `prestamo_idx` (`prestamo` ASC) VISIBLE,
index `volumen_idx` (`volumen` ASC) VISIBLE,


constraint `prestamo`
	foreign key (`prestamo`)
    references`Universo_lector`.`prestamo` (`id_prestamo`),
    
    
constraint `volumen`
	foreign key (`volumen`)
    references `Universo_lector`.`volumen` (`id_volumen`)
);
create table `Universo_lector`.`prestamo`(
`id_prestamo` int not null,
`socio` int null,
`fecha` datetime null,
`fecha_devolucion` date null,
`fecha_tope` date null,
primary key (`id_prestamo`),
constraint `socio`
	foreign key (`socio`)
    references `Universo_lector`.`socio` (`id_socio`)
);
create table `Universo_lector`.`socio`(
`id_socio` int not null,
`DNI` int null,
`apellido` varchar(100) null,
`nombres` varchar(100) null,
`direccion` varchar(200)null,
`localidad` varchar(100) null,
primary key (`id_socio`)
);
create table `Universo_lector`.`telofo_x_socio`(
`id_telefonoxsocio` int not null,
`nrotelefono` varchar(100) null,
`socio` int null,
primary key (`id_telefonoxsocio`),
constraint `socio_telefono`
	foreign key (`socio`)
    references `Universo_lector`.`socio` (`id_socio`));





insert into `Universo_lector`.`prestamo_x_volumen`
(`id_prestamoxvolumen`,`prestamo`,`volumen`)
values
(1,1,1);
insert into `Universo_lector`.`prestamo_x_volumen`
(`id_prestamoxvolumen`,`prestamo`,`volumen`)
values
(2,2,2);
insert into `Universo_lector`.`prestamo_x_volumen`
(`id_prestamoxvolumen`,`prestamo`,`volumen`)
values
(3,3,1);
insert into `Universo_lector`.`prestamo_x_volumen`
(`id_prestamoxvolumen`,`prestamo`,`volumen`)
values
(4,3,3);





insert into `Universo_lector`.`prestamo`
(`id_prestamo`,`socio`,`fecha`,`fecha_devolucion`,`fecha_tope`)
values
(1,1,'2020-01-01','2020-01-07','2020-01-07');
insert into `Universo_lector`.`prestamo`
(`id_prestamo`,`socio`,`fecha`,`fecha_devolucion`,`fecha_tope`)
values
(2,1,'2020-01-07','2020-01-09','2020-01-08');
insert into `Universo_lector`.`prestamo`
(`id_prestamo`,`socio`,`fecha`,`fecha_devolucion`,`fecha_tope`)
values
(3,2,'2020-03-04','2020-01-05','2020-01-07');




insert into `Universo_lector`.`volumen`
(`id_volumen`,`libro`,`deteriorado`)
values
(1,1,0);
insert into `Universo_lector`.`volumen`
(`id_volumen`,`libro`,`deteriorado`)
values
(2,1,0);
insert into `Universo_lector`.`volumen`
(`id_volumen`,`libro`,`deteriorado`)
values
(3,2,0);



insert into `Universo_lector`.`libro`
(`id_libro`,`ISBN`,`titulo`,`anio_escritura`,`anio_edicion`,`autor`,`editorial`)
values
(1,"9781907545009","Harry Potter y la piedra filosofal",'1997-01-01','1997-01-01',1,4);
insert into `Universo_lector`.`libro`
(`id_libro`,`ISBN`,`titulo`,`anio_escritura`,`anio_edicion`,`autor`,`editorial`)
values
(2,"9789878000114","Harry Potter Y La Camara Secreta ",'2020-01-01','2020-01-01',1,4);


insert into `Universo_lector`.`editorial`
(`id_editorial`, `razon_social`,`telefono`)
values
(1,"Bloomsbury Publishing",54911564874);
insert into `Universo_lector`.`editorial`
(`id_editorial`, `razon_social`,`telefono`)
values
(2,"Scholastic",223483646);
insert into `Universo_lector`.`editorial`
(`id_editorial`, `razon_social`,`telefono`)
values
(3,"Pottermore Limited",5694839582);
insert into `Universo_lector`.`editorial`
(`id_editorial`, `razon_social`,`telefono`)
values
(4,"Editorial Salamandra ",011-239-2343);

insert into `Universo_lector`.`autor`
(`id_autor`, `apellido`,`nombre`)
values
(1,"Rowling","J. K.");


insert into `Universo_lector`.`telofo_x_socio`
(`id_telefonoxsocio`,`nrotelefono`,`socio`)
value
(1,54911-45636453,1);
insert into `Universo_lector`.`telofo_x_socio`
(`id_telefonoxsocio`,`nrotelefono`,`socio`)
value
(2,54-11-47867654,2);
insert into `Universo_lector`.`telofo_x_socio`
(`id_telefonoxsocio`,`nrotelefono`,`socio`)
value
(3,11498-21733,3);
insert into `Universo_lector`.`telofo_x_socio`
(`id_telefonoxsocio`,`nrotelefono`,`socio`)
value
(4,1684736,4);
insert into `Universo_lector`.`telofo_x_socio`
(`id_telefonoxsocio`,`nrotelefono`,`socio`)
value
(5,2645887755,5);



insert into `Universo_lector`.`socio`
(`id_socio`,`DNI`,`apellido`,`nombres`,`direccion`,`localidad`)
values
(1,3000000,"PATRICIA","JOHNSON","28 MySQL Boulevard","QLD");
insert into `Universo_lector`.`socio`
(`id_socio`,`DNI`,`apellido`,`nombres`,`direccion`,`localidad`)
values
(2,2988800,"LINDA","WILLIAMS","23 Workhaven Lane","Alberta");
insert into `Universo_lector`.`socio`
(`id_socio`,`DNI`,`apellido`,`nombres`,`direccion`,`localidad`)
values
(3,2500000,"BARBARA","JONES","1411 Lillydale Drive","QLD");
insert into `Universo_lector`.`socio`
(`id_socio`,`DNI`,`apellido`,`nombres`,`direccion`,`localidad`)
values
(4,32980002,"LOIS","BUTLER","1688 Okara Way","Nothwest Border Prov");
insert into `Universo_lector`.`socio`
(`id_socio`,`DNI`,`apellido`,`nombres`,`direccion`,`localidad`)
values
(5,2313909,"ROBIN","BUTLER","1688 Okara Way","Nothwest Border Prov");


delete from `Universo_lector`.`socio`
where nombres = 'PATRICIA';

update `Universo_lector`.`socio`
set direccion = "Monroe 860"
where id_socio = 3;
