-- --------------------------------------------
-- BASE DE DATOS INTEGRADA - UNIVERSIDAD UNFPG
-- --------------------------------------------

DROP DATABASE IF EXISTS universidad_unfpg;
CREATE DATABASE universidad_unfpg CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE universidad_unfpg;

-- --------------------------------------------
-- TABLAS SIMPLES / CATÁLOGOS
-- --------------------------------------------

CREATE TABLE estadopago(
    codestp INT PRIMARY KEY AUTO_INCREMENT,
    nomestp VARCHAR(40) NOT NULL UNIQUE,
    estestp BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE metodopago(
    codmetp INT PRIMARY KEY AUTO_INCREMENT,
    nommetp VARCHAR(40) NOT NULL UNIQUE,
    estmetp BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE estadomatricula(
    codestm INT PRIMARY KEY AUTO_INCREMENT,
    nomestm VARCHAR(30) NOT NULL UNIQUE,
    estestm BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE tipomatricula(
    codtipm INT PRIMARY KEY AUTO_INCREMENT,
    nomtipm VARCHAR(40) NOT NULL UNIQUE,
    destipm VARCHAR(300) NOT NULL,
    esttipm BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE rollms(
    codroll INT PRIMARY KEY AUTO_INCREMENT,
    nomroll VARCHAR(40) NOT NULL UNIQUE,
    estroll BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE diasemana(
    coddias INT PRIMARY KEY AUTO_INCREMENT,
    nomdias VARCHAR(20) NOT NULL UNIQUE,
    estdias BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE rol(
    codrol INT PRIMARY KEY AUTO_INCREMENT,
    nomrol VARCHAR(40) NOT NULL UNIQUE,
    estrol BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE facultad(
    codfac INT PRIMARY KEY AUTO_INCREMENT,
    nomfac VARCHAR(50) NOT NULL UNIQUE,
    desfac TEXT NOT NULL,
    estfac BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE categorialibro(
    codcatl INT PRIMARY KEY AUTO_INCREMENT,
    nomcatl VARCHAR(40) NOT NULL UNIQUE,
    estcatl BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE distrito(
    coddis INT PRIMARY KEY AUTO_INCREMENT,
    nomdis VARCHAR(50) NOT NULL UNIQUE,
    estdis BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE sexo(
    codsex INT PRIMARY KEY AUTO_INCREMENT,
    nomsex VARCHAR(30) NOT NULL UNIQUE,
    estsex BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE tipodocumento(
    codtipd INT PRIMARY KEY AUTO_INCREMENT,
    nomtipd VARCHAR(30) NOT NULL UNIQUE,
    esttipd BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE areaempleo(
    codare INT PRIMARY KEY AUTO_INCREMENT,
    nomare VARCHAR(50) NOT NULL UNIQUE,
    estare BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE cargo(
    codcar INT PRIMARY KEY AUTO_INCREMENT,
    nomcar VARCHAR(50) NOT NULL UNIQUE,
    estcar BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE tipoaula(
    codtipa INT PRIMARY KEY AUTO_INCREMENT,
    nomtipa VARCHAR(50) NOT NULL UNIQUE,
    esttipa BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE ubicacion(
    codubi INT PRIMARY KEY AUTO_INCREMENT,
    nomubi VARCHAR(100) NOT NULL UNIQUE,
    desubi TEXT NULL,
    estubi BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE periodoacademico(
    codper INT PRIMARY KEY AUTO_INCREMENT,
    nomper VARCHAR(20) NOT NULL UNIQUE,
    fecini DATE NULL,
    fecfin DATE NULL,
    desper TEXT NULL,
    estper BIT NOT NULL DEFAULT 1,
    CHECK (fecfin IS NULL OR fecini IS NULL OR fecfin >= fecini)
)ENGINE=InnoDB;

CREATE TABLE bloque(
    codblo INT PRIMARY KEY AUTO_INCREMENT,
    nomblo VARCHAR(20) NOT NULL UNIQUE,
    iniblo TIME NOT NULL,
    finblo TIME NOT NULL,
    estblo BIT NOT NULL DEFAULT 1,
    CHECK (finblo > iniblo)
)ENGINE=InnoDB;

CREATE TABLE conceptopago(
    codconp INT PRIMARY KEY AUTO_INCREMENT,
    nomconp VARCHAR(100) NOT NULL UNIQUE,
    desconp TEXT NULL,
    estconp BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE estadocivil(
    codestc INT PRIMARY KEY AUTO_INCREMENT,
    nomestc VARCHAR(50) NOT NULL UNIQUE,
    estestc BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE gradoinstruccion(
    codgrai INT PRIMARY KEY AUTO_INCREMENT,
    nomgrai VARCHAR(50) NOT NULL UNIQUE,
    estgrai BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE estadoaula(
    codesta INT PRIMARY KEY AUTO_INCREMENT,
    nomesta VARCHAR(50) NOT NULL UNIQUE,
    estesta BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE tipocalificacion(
    codtipc INT PRIMARY KEY AUTO_INCREMENT,
    nomtipc VARCHAR(50) NOT NULL UNIQUE,
    esttipc BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE editorial(
    codedi INT PRIMARY KEY AUTO_INCREMENT,
    nomedi VARCHAR(100) NOT NULL UNIQUE,
    estedi BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

CREATE TABLE estadoprestamolibro(
    codestl INT PRIMARY KEY AUTO_INCREMENT,
    nomestl VARCHAR(50) NOT NULL UNIQUE,
    estestl BIT NOT NULL DEFAULT 1
)ENGINE=InnoDB;

-- --------------------------------------------
-- INFRAESTRUCTURA ACADÉMICA
-- --------------------------------------------

CREATE TABLE aula(
    codaul INT PRIMARY KEY AUTO_INCREMENT,
    nomaul VARCHAR(50) NOT NULL UNIQUE,
    capaul INT NOT NULL,
    codubi INT NOT NULL,
    codtipa INT NOT NULL,
    codesta INT NOT NULL,
    CHECK (capaul > 0),
    FOREIGN KEY (codtipa) REFERENCES tipoaula(codtipa),
    FOREIGN KEY (codubi) REFERENCES ubicacion(codubi),
    FOREIGN KEY (codesta) REFERENCES estadoaula(codesta)
)ENGINE=InnoDB;

-- --------------------------------------------
-- PERSONAS
-- --------------------------------------------

CREATE TABLE alumno(
    codalu INT PRIMARY KEY AUTO_INCREMENT,
    nomalu VARCHAR(50) NOT NULL,
    apepalu VARCHAR(40) NOT NULL,
    apemalu VARCHAR(40) NOT NULL,
    fecnac DATE NOT NULL,
    numdoc VARCHAR(20) NOT NULL UNIQUE,
    nacalu VARCHAR(20) NOT NULL,
    diralu TEXT NOT NULL,
    telalu VARCHAR(15) NULL,
    celalu VARCHAR(15) NULL,
    coralu VARCHAR(100) NOT NULL UNIQUE,
    estalu BIT NOT NULL DEFAULT 1,
    crealu TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    coddis INT NOT NULL,
    codsex INT NOT NULL,
    codtipd INT NOT NULL,
    codestc INT NOT NULL,
    FOREIGN KEY (coddis) REFERENCES distrito(coddis),
    FOREIGN KEY (codsex) REFERENCES sexo(codsex),
    FOREIGN KEY (codtipd) REFERENCES tipodocumento(codtipd),
    FOREIGN KEY (codestc) REFERENCES estadocivil(codestc)
)ENGINE=InnoDB;

CREATE TABLE docente(
    coddoc INT PRIMARY KEY AUTO_INCREMENT,
    nomdoc VARCHAR(50) NOT NULL,
    apepdoc VARCHAR(40) NOT NULL,
    apemdoc VARCHAR(40) NOT NULL,
    fecnac DATE NOT NULL,
    numdoc VARCHAR(20) NOT NULL UNIQUE,
    nacdoc VARCHAR(20) NOT NULL,
    dirdoc TEXT NOT NULL,
    teldoc VARCHAR(15) NULL,
    celdoc VARCHAR(15) NOT NULL,
    cordoc VARCHAR(100) NOT NULL UNIQUE,
    estdoc BIT NOT NULL DEFAULT 1,
    credoc TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    suedoc DECIMAL(8,2) NOT NULL,
    coddis INT NOT NULL,
    codsex INT NOT NULL,
    codtipd INT NOT NULL,
    codestc INT NOT NULL,
    CHECK (suedoc >= 0),
    FOREIGN KEY (coddis) REFERENCES distrito(coddis),
    FOREIGN KEY (codsex) REFERENCES sexo(codsex),
    FOREIGN KEY (codtipd) REFERENCES tipodocumento(codtipd),
    FOREIGN KEY (codestc) REFERENCES estadocivil(codestc)
)ENGINE=InnoDB;

CREATE TABLE docentegrado(
    coddoc INT NOT NULL,
    codgrai INT NOT NULL,
    institucion VARCHAR(150) NOT NULL,
    anioobtencion DATE NOT NULL,
    nomesp VARCHAR(100) NOT NULL,
    PRIMARY KEY(coddoc,codgrai),
    FOREIGN KEY (coddoc) REFERENCES docente(coddoc),
    FOREIGN KEY (codgrai) REFERENCES gradoinstruccion(codgrai)
)ENGINE=InnoDB;

CREATE TABLE empleado(
    codemp INT PRIMARY KEY AUTO_INCREMENT,
    nomemp VARCHAR(50) NOT NULL,
    apepemp VARCHAR(40) NOT NULL,
    apememp VARCHAR(40) NOT NULL,
    fecnac DATE NOT NULL,
    numdoc VARCHAR(20) NOT NULL UNIQUE,
    nacemp VARCHAR(20) NOT NULL,
    diremp TEXT NOT NULL,
    telemp VARCHAR(15) NULL,
    celemp VARCHAR(15) NOT NULL,
    coremp VARCHAR(100) NOT NULL UNIQUE,
    estemp BIT NOT NULL DEFAULT 1,
    creemp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    sueemp DECIMAL(8,2) NOT NULL,
    codare INT NOT NULL,
    codcar INT NOT NULL,
    coddis INT NOT NULL,
    codsex INT NOT NULL,
    codtipd INT NOT NULL,
    codestc INT NOT NULL,
    CHECK (sueemp >= 0),
    FOREIGN KEY (codare) REFERENCES areaempleo(codare),
    FOREIGN KEY (codcar) REFERENCES cargo(codcar),
    FOREIGN KEY (coddis) REFERENCES distrito(coddis),
    FOREIGN KEY (codsex) REFERENCES sexo(codsex),
    FOREIGN KEY (codtipd) REFERENCES tipodocumento(codtipd),
    FOREIGN KEY (codestc) REFERENCES estadocivil(codestc)
)ENGINE=InnoDB;

CREATE TABLE empleadogrado(
    codemp INT NOT NULL,
    codgrai INT NOT NULL,
    institucion VARCHAR(150) NOT NULL,
    anioobtencion DATE NOT NULL,
    nomesp VARCHAR(100) NOT NULL,
    PRIMARY KEY(codemp,codgrai),
    FOREIGN KEY (codemp) REFERENCES empleado(codemp),
    FOREIGN KEY (codgrai) REFERENCES gradoinstruccion(codgrai)
)ENGINE=InnoDB;

-- --------------------------------------------
-- ESTRUCTURA ACADÉMICA
-- --------------------------------------------

CREATE TABLE programa(
    codprog INT PRIMARY KEY AUTO_INCREMENT,
    nomprog VARCHAR(100) NOT NULL,
    estprog BIT NOT NULL DEFAULT 1,
    codfac INT NOT NULL,
    FOREIGN KEY(codfac) REFERENCES facultad(codfac)
)ENGINE=InnoDB;

CREATE TABLE planestudio(
    codpla INT PRIMARY KEY AUTO_INCREMENT,
    nompla VARCHAR(100) NOT NULL,
    despla TEXT NULL,
    estpla BIT NOT NULL DEFAULT 1,
    codprog INT NOT NULL,
    FOREIGN KEY(codprog) REFERENCES programa(codprog)
)ENGINE=InnoDB;

CREATE TABLE curso(
    codcur INT PRIMARY KEY AUTO_INCREMENT,
    sercur VARCHAR(20) NOT NULL UNIQUE,
    nomcur VARCHAR(150) NOT NULL,
    crecur INT NOT NULL DEFAULT 0,
    blocur INT NOT NULL DEFAULT 0,
    codprog INT NOT NULL,
    CHECK (crecur >= 0),
    CHECK (blocur >= 0),
    FOREIGN KEY (codprog) REFERENCES programa(codprog)
)ENGINE=InnoDB;

CREATE TABLE seccion(
    codsec INT PRIMARY KEY AUTO_INCREMENT,
    capsec INT NOT NULL DEFAULT 30,
    codcur INT NOT NULL,
    coddoc INT NOT NULL,
    codper INT NOT NULL,
    CHECK (capsec > 0),
    FOREIGN KEY (codcur) REFERENCES curso(codcur),
    FOREIGN KEY (coddoc) REFERENCES docente(coddoc),
    FOREIGN KEY (codper) REFERENCES periodoacademico(codper)
)ENGINE=InnoDB;

CREATE TABLE horario(
    codhor INT PRIMARY KEY AUTO_INCREMENT,
    codblo INT NOT NULL,
    codsec INT NOT NULL,
    coddias INT NOT NULL,
    codaul INT NOT NULL,
    FOREIGN KEY (codblo) REFERENCES bloque(codblo),
    FOREIGN KEY (codsec) REFERENCES seccion(codsec),
    FOREIGN KEY (coddias) REFERENCES diasemana(coddias),
    FOREIGN KEY (codaul) REFERENCES aula(codaul),
    UNIQUE(codblo, coddias, codaul)
)ENGINE=InnoDB;

-- --------------------------------------------
-- OPERACIÓN ACADÉMICA
-- --------------------------------------------

CREATE TABLE matricula(
    nummat INT PRIMARY KEY AUTO_INCREMENT,
    obsmat TEXT NULL,
    fecmat TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    codalu INT NOT NULL,
    codestm INT NOT NULL,
    codtipm INT NOT NULL,
    codper INT NOT NULL,
    estmat BIT NOT NULL DEFAULT 1,
    FOREIGN KEY (codalu) REFERENCES alumno(codalu),
    FOREIGN KEY (codestm) REFERENCES estadomatricula(codestm),
    FOREIGN KEY (codtipm) REFERENCES tipomatricula(codtipm),
    FOREIGN KEY (codper) REFERENCES periodoacademico(codper),
    UNIQUE(codalu, codper)
)ENGINE=InnoDB;

CREATE TABLE detallematricula(
    coddet INT PRIMARY KEY AUTO_INCREMENT,
    estdet BIT NOT NULL DEFAULT 1,
    nummat INT NOT NULL,
    codsec INT NOT NULL,
    FOREIGN KEY (nummat) REFERENCES matricula(nummat),
    FOREIGN KEY (codsec) REFERENCES seccion(codsec),
    UNIQUE(nummat, codsec)
)ENGINE=InnoDB;

CREATE TABLE calificacion(
    codcal INT PRIMARY KEY AUTO_INCREMENT,
    feccal DATETIME NOT NULL,
    nota DECIMAL(5,2) NOT NULL,
    coddet INT NOT NULL,
    codsec INT NOT NULL,
    codtipc INT NOT NULL,
    CHECK (nota >= 0 AND nota <= 20),
    FOREIGN KEY (coddet) REFERENCES detallematricula(coddet),
    FOREIGN KEY (codsec) REFERENCES seccion(codsec),
    FOREIGN KEY (codtipc) REFERENCES tipocalificacion(codtipc)
)ENGINE=InnoDB;

CREATE TABLE asistencia(
    codasis INT PRIMARY KEY AUTO_INCREMENT,
    fecasis DATETIME NOT NULL,
    presente BIT NOT NULL DEFAULT 0,
    justificada BIT NOT NULL DEFAULT 0,
    coddet INT NOT NULL,
    codsec INT NOT NULL,
    FOREIGN KEY (coddet) REFERENCES detallematricula(coddet),
    FOREIGN KEY (codsec) REFERENCES seccion(codsec)
)ENGINE=InnoDB;

CREATE TABLE traslado(
    codtra INT PRIMARY KEY AUTO_INCREMENT,
    progori VARCHAR(100) NULL,
    uniori VARCHAR(100) NULL,
    esttras BIT NOT NULL DEFAULT 1,
    nummat INT NOT NULL,
    FOREIGN KEY (nummat) REFERENCES matricula(nummat)
)ENGINE=InnoDB;

-- --------------------------------------------
-- FINANZAS
-- --------------------------------------------

CREATE TABLE ordenpago(
    codordpag INT PRIMARY KEY AUTO_INCREMENT,
    fecordpag DATETIME NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    estordpag BIT NOT NULL DEFAULT 1,
    nummat INT NOT NULL,
    codconp INT NOT NULL,
    codmetp INT NOT NULL,
    codestp INT NOT NULL,
    CHECK (monto > 0),
    FOREIGN KEY (codconp) REFERENCES conceptopago(codconp),
    FOREIGN KEY (nummat) REFERENCES matricula(nummat),
    FOREIGN KEY (codmetp) REFERENCES metodopago(codmetp),
    FOREIGN KEY (codestp) REFERENCES estadopago(codestp)
)ENGINE=InnoDB;

CREATE TABLE pago(
    codpag INT PRIMARY KEY AUTO_INCREMENT,
    fecpag DATETIME NOT NULL,
    montopag DECIMAL(10,2) NOT NULL,
    estpag BIT NOT NULL DEFAULT 1,
    codordpag INT NOT NULL,
    CHECK (montopag > 0),
    FOREIGN KEY (codordpag) REFERENCES ordenpago(codordpag)
)ENGINE=InnoDB;

-- --------------------------------------------
-- BIBLIOTECA
-- --------------------------------------------

CREATE TABLE libro(
    codlib INT PRIMARY KEY AUTO_INCREMENT,
    isbnlib VARCHAR(20) NULL,
    titlib VARCHAR(200) NOT NULL,
    autlib VARCHAR(150) NOT NULL,
    deslib VARCHAR(300) NULL,
    estlib BIT NOT NULL DEFAULT 1,
    codcatl INT NOT NULL,
    codedi INT NOT NULL,
    FOREIGN KEY (codcatl) REFERENCES categorialibro(codcatl),
    FOREIGN KEY (codedi) REFERENCES editorial(codedi)
)ENGINE=InnoDB;

CREATE TABLE ejemplarlibro(
    codeje INT PRIMARY KEY AUTO_INCREMENT,
    codlib INT NOT NULL,
    codejemplar VARCHAR(50) NOT NULL UNIQUE,
    estadoeje VARCHAR(30) NOT NULL DEFAULT 'DISPONIBLE',
    esteje BIT NOT NULL DEFAULT 1,
    FOREIGN KEY (codlib) REFERENCES libro(codlib),
    CHECK (estadoeje IN ('DISPONIBLE','PRESTADO','PERDIDO','MANTENIMIENTO'))
)ENGINE=InnoDB;

CREATE TABLE prestamolibro(
    numpre INT PRIMARY KEY AUTO_INCREMENT,
    fecpre DATE NOT NULL,
    fecdpre DATE NULL,
    devpre BIT NOT NULL DEFAULT 0,
    estpre BIT NOT NULL DEFAULT 1,
    codalu INT NOT NULL,
    codeje INT NOT NULL,
    codestl INT NOT NULL,
    FOREIGN KEY (codalu) REFERENCES alumno(codalu),
    FOREIGN KEY (codeje) REFERENCES ejemplarlibro(codeje),
    FOREIGN KEY (codestl) REFERENCES estadoprestamolibro(codestl)
)ENGINE=InnoDB;

-- --------------------------------------------
-- AULA VIRTUAL / LMS
-- --------------------------------------------

CREATE TABLE cursolms(
    codcurl INT PRIMARY KEY AUTO_INCREMENT,
    codpla INT NOT NULL,
    estcurl BIT NOT NULL DEFAULT 1,
    codsec INT NOT NULL,
    FOREIGN KEY (codpla) REFERENCES planestudio(codpla),
    FOREIGN KEY (codsec) REFERENCES seccion(codsec)
)ENGINE=InnoDB;

CREATE TABLE evaluacionlms(
    codeval INT PRIMARY KEY AUTO_INCREMENT,
    nomeval VARCHAR(100) NOT NULL,
    deseval TEXT NULL,
    feceval DATETIME NOT NULL,
    esteval BIT NOT NULL DEFAULT 1,
    codcurl INT NOT NULL,
    FOREIGN KEY (codcurl) REFERENCES cursolms(codcurl)
)ENGINE=InnoDB;

CREATE TABLE matriculalms(
    nummatl INT PRIMARY KEY AUTO_INCREMENT,
    fecmatl DATETIME NOT NULL,
    estmatl BIT NOT NULL DEFAULT 1,
    codalu INT NOT NULL,
    codcurl INT NOT NULL,
    codroll INT NOT NULL,
    FOREIGN KEY (codalu) REFERENCES alumno(codalu),
    FOREIGN KEY (codcurl) REFERENCES cursolms(codcurl),
    FOREIGN KEY (codroll) REFERENCES rollms(codroll),
    UNIQUE(codalu, codcurl)
)ENGINE=InnoDB;

-- --------------------------------------------
-- SEGURIDAD
-- --------------------------------------------

CREATE TABLE usuario(
    codusu INT PRIMARY KEY AUTO_INCREMENT,
    nomusu VARCHAR(50) NOT NULL UNIQUE,
    clausu VARCHAR(255) NOT NULL,
    corusu VARCHAR(100) NOT NULL UNIQUE,
    creusu TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estusu BIT NOT NULL DEFAULT 1,
    codalu INT NULL,
    coddoc INT NULL,
    codemp INT NULL,
    FOREIGN KEY (codalu) REFERENCES alumno(codalu),
    FOREIGN KEY (coddoc) REFERENCES docente(coddoc),
    FOREIGN KEY (codemp) REFERENCES empleado(codemp),
    CHECK (
        (codalu IS NOT NULL AND coddoc IS NULL AND codemp IS NULL) OR
        (codalu IS NULL AND coddoc IS NOT NULL AND codemp IS NULL) OR
        (codalu IS NULL AND coddoc IS NULL AND codemp IS NOT NULL)
    )
)ENGINE=InnoDB;

CREATE TABLE usuariorol(
    codusu INT NOT NULL,
    codrol INT NOT NULL,
    PRIMARY KEY(codusu,codrol),
    FOREIGN KEY (codusu) REFERENCES usuario(codusu),
    FOREIGN KEY (codrol) REFERENCES rol(codrol)
)ENGINE=InnoDB;

-- --------------------------------------------
-- ÍNDICES
-- --------------------------------------------

CREATE INDEX idx_alumno_doc ON alumno(numdoc);
CREATE INDEX idx_docente_doc ON docente(numdoc);
CREATE INDEX idx_empleado_doc ON empleado(numdoc);

CREATE INDEX idx_programa_facultad ON programa(codfac);
CREATE INDEX idx_plan_programa ON planestudio(codprog);
CREATE INDEX idx_curso_programa ON curso(codprog);
CREATE INDEX idx_seccion_curso ON seccion(codcur);
CREATE INDEX idx_seccion_docente ON seccion(coddoc);
CREATE INDEX idx_seccion_periodo ON seccion(codper);

CREATE INDEX idx_horario_seccion ON horario(codsec);
CREATE INDEX idx_matricula_alumno ON matricula(codalu);
CREATE INDEX idx_matricula_periodo ON matricula(codper);
CREATE INDEX idx_detallematricula_matricula ON detallematricula(nummat);
CREATE INDEX idx_detallematricula_seccion ON detallematricula(codsec);

CREATE INDEX idx_calificacion_detalle ON calificacion(coddet);
CREATE INDEX idx_asistencia_detalle ON asistencia(coddet);

CREATE INDEX idx_ordenpago_matricula ON ordenpago(nummat);
CREATE INDEX idx_pago_orden ON pago(codordpag);

CREATE INDEX idx_libro_categoria ON libro(codcatl);
CREATE INDEX idx_libro_editorial ON libro(codedi);
CREATE INDEX idx_ejemplar_libro ON ejemplarlibro(codlib);
CREATE INDEX idx_prestamo_alumno ON prestamolibro(codalu);
CREATE INDEX idx_prestamo_ejemplar ON prestamolibro(codeje);

CREATE INDEX idx_cursolms_seccion ON cursolms(codsec);
CREATE INDEX idx_matriculalms_alumno ON matriculalms(codalu);
CREATE INDEX idx_matriculalms_curso ON matriculalms(codcurl);

CREATE INDEX idx_usuario_alumno ON usuario(codalu);
CREATE INDEX idx_usuario_docente ON usuario(coddoc);
CREATE INDEX idx_usuario_empleado ON usuario(codemp);