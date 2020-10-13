DROP DATABASE IF EXISTS sistema_alumnos_db;
CREATE DATABASE sistema_alumnos_db;
USE sistema_alumnos_db;

CREATE TABLE alumno(
	id BIGINT AUTO_INCREMENT,
    rut VARCHAR(12) UNIQUE,
    nombre VARCHAR(50),
    direccion VARCHAR(200),
    CONSTRAINT pk_alumno PRIMARY KEY (id)
);

CREATE TABLE materia(
id BIGINT AUTO_INCREMENT,
nombre VARCHAR(50),
alumno_id BIGINT,
CONSTRAINT pk_materia PRIMARY KEY (id),
CONSTRAINT fk_alumno FOREIGN KEY materia(alumno_id) REFERENCES alumno(id)
);

INSERT INTO alumno (rut, nombre, direccion)
VALUES ("15123456-5", "Jose Gómez","Los Españas 115");

INSERT INTO alumno (rut, nombre, direccion)
VALUES ("12153124-5", "Gustavo Solar","Los United 35");

INSERT INTO alumno (rut, nombre, direccion)
VALUES ("11215321-4", "Manuel Perez","Las Betis 3841");

INSERT INTO alumno (rut, nombre, direccion)
VALUES ("12351125-4", "Mauricio Gonzalez","Los Spurs 351");

INSERT INTO alumno (rut, nombre, direccion)
VALUES ("12352425-4", "Juan Contreras","LasPool 3321");

INSERT INTO materia(nombre, alumno_id)
VALUES ("Armonia Aplicada 1", 1);

INSERT INTO materia(nombre, alumno_id)
VALUES ("Armonia Aplicada 2", 2);

INSERT INTO materia(nombre, alumno_id)
VALUES ("Taller de coro", 3);

INSERT INTO materia(nombre, alumno_id)
VALUES ("Teoría y Solfeo 2", 4);

INSERT INTO materia(nombre, alumno_id)
VALUES ("Apreciación Musical", 5);

SELECT * FROM materia;

SELECT * FROM alumno;


