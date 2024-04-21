1. TERMINAL MYSQL DATABASE prueba_user

CREATE DATABASE prueba_user

USE prueba_user

CREATE TABLE users(
    id_user INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR (50) NOT NULL,
    email_address VARCHAR (50) NOT NULL UNIQUE,
    phonenumber CHAR(10) UNIQUE,
    create_at TIMESTAMP NOT NULL DEFAULT (NOW()),
    PRIMARY KEY (id_user)
)

2. Importar la libreria del mysql-connector-java-5.1.18-bin.jar
