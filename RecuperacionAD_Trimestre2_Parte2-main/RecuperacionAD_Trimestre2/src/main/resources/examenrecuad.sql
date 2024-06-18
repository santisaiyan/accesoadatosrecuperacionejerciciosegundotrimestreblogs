
CREATE DATABASE IF NOT EXISTS examenrecuad;


USE examenrecuad;


CREATE TABLE alumnado (
    id INT(11) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(32) NOT NULL,
    telefono VARCHAR(32) NOT NULL,
    email VARCHAR(32) NOT NULL,
    ad DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


COMMIT;

INSERT INTO alumnado (nombre, telefono, email, ad) VALUES
('Sergio Ayala', '123456789', 'sergio.ayala@example.com', 8.5),
('Alba Perez', '987654321', 'alba.perez@example.com', 9.0),
('Esteban Ruiz', '456789123', 'esteban.ruiz@example.com', 3.5),
('Laura Martinez', '321654987', 'laura.martinez@example.com', 6.5),
('Carlos Gomez', '654987321', 'carlos.gomez@example.com', 4.0);


COMMIT;
