CREATE TABLE personas (
    ID int PRIMARY KEY,
    nombre varchar(255),
    apellido varchar(255),
    ciudad varchar(255)
);

INSERT INTO personas (ID, nombre, apellido, ciudad) VALUES 
(1, 'Juan', 'Pérez', 'Madrid'),
(2, 'María', 'González', 'Barcelona'),
(3, 'Carlos', 'Martínez', 'Sevilla'),
(4, 'Laura', 'López', 'Valencia'),
(5, 'Pedro', 'Hernández', 'Málaga'),
(6, 'Ana', 'Rodríguez', 'Bilbao'),
(7, 'Diego', 'Díaz', 'Alicante'),
(8, 'Sofía', 'García', 'Murcia'),
(9, 'Luis', 'Fernández', 'Palma de Mallorca'),
(10, 'Elena', 'Sánchez', 'Zaragoza');


CREATE USER 'alumno'@'%' IDENTIFIED BY 'admin1234';

GRANT Alter ON empresa.personas TO 'alumno'@'%';
GRANT Create ON empresa.personas TO 'alumno'@'%';
GRANT Delete ON empresa.personas TO 'alumno'@'%';
GRANT Drop ON empresa.personas TO 'alumno'@'%';
GRANT Insert ON empresa.personas TO 'alumno'@'%';
GRANT Select ON empresa.personas TO 'alumno'@'%';
GRANT Update ON empresa.personas TO 'alumno'@'%';