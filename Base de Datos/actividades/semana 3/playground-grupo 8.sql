create schema playground;
use playground;
create table categorias (
	id_categoria INT NOT NULL,
    nombre VARCHAR(100) NULL,
    primary key (id_categoria)
);
create table usuarios(
	idusuario INT NOT NULL,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    email VARCHAR(50),
    id_categoria INT NULL,
    primary key (idusuario),
		Foreign key (id_categoria)
		references categorias (id_categoria)
);
create table carrera(
	idcarrera INT NOT NULL,
    titulo VARCHAR(45),
    descripcion VARCHAR(100),
    primary key (idcarrera)
);
create table usuarios_carrera(
	id INT NOT NULL,
    usuario INT,
    carrera INT,
    fechainscripcion DATE,
    primary key (id),
		FOREIGN KEY (usuario)
        REFERENCES usuarios (idusuario),
        FOREIGN KEY (carrera)
        REFERENCES carrera (idcarrera)
);
INSERT INTO categorias (id_categoria, nombre)
VALUES
(1, "Alumno"),
(2, "Docente"),
(3, "Editor"),
(4, "Administrador");

Delete from categorias
where nombre = "Editor";

Delete from categorias
where nombre = "Alumno";