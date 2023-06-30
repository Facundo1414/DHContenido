create schema `playground_2`;
create table `playground_2`.`categorias`(
`idcategoria` INT NOT NULL,
`nombre` VARCHAR(100) NULL,
primary key (`idcategoria`)
);
create table `playground_2`.`usuarios`(
`idusuario` INT NOT NULL,
`nombre` VARCHAR(100) NULL,
`apellido` VARCHAR(100) NULL,
`email` varchar(50) NULL,
`categoria` INT NULL,
primary key (`idusuario`),
INDEX `FKcategoria_idx` (`categoria` ASC) VISIBLE,
constraint `FKcategoria`
	foreign key (`categoria`)
    references `playground_2`.`categorias` (`idcategoria`)
);
create table `playground_2`.`carrera`(
`idcarrera` INT NOT NULL,
`titulo` VARCHAR(45) NULL,
`descripcion` VARCHAR(100) NULL,
primary key (`idcarrera`)
);
create table `playground_2`.`usuarios_carrera`(
`id` INT NOT NULL,
`usuario` INT NULL,
`carrera` INT NULL,
`fechainscripcion` DATE NULL,
primary key (`id`),
index `usuario_idx` (`usuario` ASC) VISIBLE,
index `carreara_idx` (`carrera` ASC) VISIBLE,
constraint `usuario`
	foreign key (`usuario`)
    references`playground_2`.`usuarios` (`idusuario`),
constraint `carrera`
	foreign key (`carrera`)
    references `playground_2`.`carrera` (`idcarrera`)
);
insert into `playground_2`.`categorias`
(`idcategoria`,`nombre`)
values
(1, "Alumno"),
(2, "Docente"),
(3, "Editor"),
(4, "Admin");

insert into `playground_2`.`usuarios`
(`idusuario`,`nombre`,`apellido`,`email`,`categoria`)
values
(1, "Juan", "Perez", "jperez@gmail.com", 1);

insert into `playground_2`.`carrera`
(`idcarrera`, `titulo`, `descripcion`)
values
(1, "Certified Tech Developer", "Carrera de programacion y desarrollo de productos digitales");

insert into `playground_2`.`usuarios_carrera`
(`id`,`usuario`,`carrera`,`fechainscripcion`) 
values
(1, 1, 1,'2021-03-01');
delete from `playground_2`.`categorias`
where nombre = "Editor";