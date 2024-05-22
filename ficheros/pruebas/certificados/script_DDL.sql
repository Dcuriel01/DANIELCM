CREATE TABLE certificados_energeticos (
    id_certificado VARCHAR(10) PRIMARY KEY,
    propietario VARCHAR(50),
    direccion VARCHAR(100),
    tipo_de_propiedad VARCHAR(20),
    clasificacion_energetica CHAR(1),
    fecha_de_expedicion DATE,
    empresa_certificadora VARCHAR(50),
    codigo_tecnico VARCHAR(10)
);
