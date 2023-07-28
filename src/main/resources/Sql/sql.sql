CREATE TABLE  EMPLEADO (
	"idEmpleado" SERIAL NOT NULL,
	"usuario" VARCHAR(60) NOT NULL,
	"idTipoDocumento" INT NOT NULL,
	"documento" VARCHAR(15) NOT NULL,
	"nombres" VARCHAR(100) NOT NULL,
	"apellidos" VARCHAR(100) NOT NULL,
	"telefono" VARCHAR(15) NOT NULL,
	"direccion" VARCHAR(100) NOT NULL,
	"correoElectronico" VARCHAR(80) NOT NULL,
	"fechaIngreso" Date NOT NULL,
    "fechaRetiro" Date NULL,
    "idTipoContrato" INT NOT NULL,
    "idTipoCargo" INT NOT NULL,
    "idEstadoEmpleado" INT NOT NULL,
    "supervisorInmediato" VARCHAR(60) NULL,
  	PRIMARY KEY ("idEmpleado"),
	  	CONSTRAINT "fk_TIPO_CONTRATO"
	    FOREIGN KEY ("idTipoContrato")
	    REFERENCES TIPO_CONTRATO ("id")
	    ON DELETE NO ACTION
	    ON UPDATE NO ACTION,
    CONSTRAINT "fk_TIPO_DOCUMENTO"
	    FOREIGN KEY ("idTipoDocumento")
	    REFERENCES TIPO_DOCUMENTO ("id")
	    ON DELETE NO ACTION
	    ON UPDATE NO action,
    CONSTRAINT "fk_TIPO_CARGO"
	    FOREIGN KEY ("idTipoCargo")
	    REFERENCES TIPO_CARGO ("id")
	    ON DELETE NO ACTION
	    ON UPDATE NO ACTION,
    CONSTRAINT "fk_ESTADO_EMPLEADO"
	    FOREIGN KEY ("idEstadoEmpleado")
	    REFERENCES ESTADO_EMPLEADO ("id")
	    ON DELETE NO ACTION
	    ON UPDATE NO ACTION);


CREATE TABLE  TIPO_CONTRATO (
	"id" SERIAL NOT NULL,
	"nombre" VARCHAR(100) NOT NULL,
	"descripcion" VARCHAR(150) NULL,
	PRIMARY KEY ("id"));

CREATE TABLE  TIPO_DOCUMENTO (
	"id" SERIAL NOT NULL,
	"nombre" VARCHAR(100) NOT NULL,
	"descripcion" VARCHAR(150) NULL,
	PRIMARY KEY ("id"));

CREATE TABLE  TIPO_CARGO (
	"id" SERIAL NOT NULL,
	"nombre" VARCHAR(100) NOT NULL,
	"descripcion" VARCHAR(150) NULL,
	PRIMARY KEY ("id"));

CREATE TABLE  ESTADO_EMPLEADO (
	"id" SERIAL NOT NULL,
	"nombre" VARCHAR(100) NOT NULL,
	"descripcion" VARCHAR(150) NULL,
	PRIMARY KEY ("id"));


CREATE TABLE  ESTADO_VACACION (
	"id" SERIAL NOT NULL,
	"nombre" VARCHAR(100) NOT NULL,
	"descripcion" VARCHAR(150) NULL,
	PRIMARY KEY ("id"));

CREATE TABLE  NOTIFICACION (
	"id" SERIAL NOT NULL,
	"idEmpleado" INT NOT NULL,
	"destinatarios" VARCHAR(400) NOT NULL,
	"asunto" VARCHAR(200) NOT NULL,
	"mensaje" VARCHAR(400) NOT NULL,
	PRIMARY KEY ("id"),
	CONSTRAINT "fk_EMPLEADO_NOTIFICACION"
           FOREIGN KEY ("idUsuario")
           REFERENCES EMPLEADO ("idEmpleado")
           ON DELETE NO ACTION
           ON UPDATE NO action);

CREATE TABLE  VACACIONES (
	"id" SERIAL NOT NULL,
	"idEmpleado" INT NOT NULL,
	"fechaSolicitud" Date NOT NULL,
    "diasSolicitados" INT NOT NULL,
    "diasAFavor" INT NOT NULL,
    "idEstadoVacacion" INT NOT NULL,
    "numeroSolicitud" INT NOT NULL,
    "fechaReintrego" Date NULL,
    "idUsuarioVerifico" INT NULL,
    "aprobado" BOOLEAN NULL,
  	PRIMARY KEY ("id"),
	  	CONSTRAINT "fk_EMPLEADO"
		    FOREIGN KEY ("idEmpleado")
		    REFERENCES EMPLEADO ("idEmpleado")
		    ON DELETE NO ACTION
		    ON UPDATE NO ACTION,
	    CONSTRAINT "fk_ESTADO_VACACION"
		    FOREIGN KEY ("idEstadoVacacion")
		    REFERENCES ESTADO_VACACION ("id")
		    ON DELETE NO ACTION
		    ON UPDATE NO action,
		CONSTRAINT "fk_EMPLEADO_VERIFICO"
		    FOREIGN KEY ("idUsuarioVerifico")
		    REFERENCES EMPLEADO ("idEmpleado")
		    ON DELETE NO ACTION
		    ON UPDATE NO action);


-- Inserción de Tipos de contrato
INSERT INTO TIPO_CONTRATO VALUES (1, 'Indefinido', 'Contrato directo por la empresa');
INSERT INTO TIPO_CONTRATO VALUES (2, 'Prestación de servicios', 'Contrato por la modalidad de prestación de servicios');
INSERT INTO TIPO_CONTRATO VALUES (3, 'Pasantias', 'Contrato de pasantias estudiantes');
INSERT INTO TIPO_CONTRATO VALUES (4, 'Semillero', 'Contrato ayuda de plan semillero');

-- Inserción de Tipos de documentos
INSERT INTO TIPO_DOCUMENTO VALUES (1, 'Contraseña', 'Documento valido como cedula de ciudadania');
INSERT INTO TIPO_DOCUMENTO VALUES (2, 'Cedula ciudadania', 'Documento para nacionales');
INSERT INTO TIPO_DOCUMENTO VALUES (3, 'Cedula extranjero', 'Documento de ciudadanos extranjeros');
INSERT INTO TIPO_DOCUMENTO VALUES (4, 'Pasaporte', 'Documento para personas que no cuentan con un documento tipo cedula');
INSERT INTO TIPO_DOCUMENTO VALUES (5, 'Tarjeta Identidad', 'Documento para aprendiz');

-- Inserción de Tipos de cargo
INSERT INTO TIPO_CARGO VALUES (1, 'CEO', '');
INSERT INTO TIPO_CARGO VALUES (2, 'Scrum Master de servicios', '');
INSERT INTO TIPO_CARGO VALUES (3, 'Product Owner', '');
INSERT INTO TIPO_CARGO VALUES (4, 'QA', '');
INSERT INTO TIPO_CARGO VALUES (5, 'Arquitecto Software', '');
INSERT INTO TIPO_CARGO VALUES (6, 'Recursos Humanos', '');
INSERT INTO TIPO_CARGO VALUES (7, 'Auxiliar Recursos Humanos', '');
INSERT INTO TIPO_CARGO VALUES (8, 'Contador', '');
INSERT INTO TIPO_CARGO VALUES (9, 'Psicologo', '');
INSERT INTO TIPO_CARGO VALUES (10, 'Lider tecnico', '');
INSERT INTO TIPO_CARGO VALUES (11, 'Aprendiz', '');
INSERT INTO TIPO_CARGO VALUES (12, 'Semillero', '');

-- Inserción de Estado empleado
INSERT INTO ESTADO_EMPLEADO VALUES (1, 'Prueba', '');
INSERT INTO ESTADO_EMPLEADO VALUES (2, 'Vinculado', '');

-- Inserción de Estado vacacion
INSERT INTO ESTADO_VACACION VALUES (1, 'Parcial', '');
INSERT INTO ESTADO_VACACION VALUES (2, 'Completa', '');

--https://start.spring.io/#!type=gradle-project&language=java&platformVersion=2.7.14&packaging=jar&jvmVersion=11&groupId=com.bebolder&artifactId=bebolder-vacation&name=bebolder-vacation&description=Proyecto%20para%20solicitud%20de%20vacaciones%20en%20Be%20Bolder&packageName=com.bebolder-vacation&dependencies=web