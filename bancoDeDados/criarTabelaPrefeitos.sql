CREATE TABLE IF NOT EXISTS prefeitos(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cidade_id INT UNSIGNED,
    PRIMARY KEY (id),
    UNIQUE KEY (cidade_id), -- não aceita duplicação, dessa forma 1 prefeito só pode estar associado a 1 cidade.
    FOREIGN KEY (cidade_id) REFERENCES cidades (id)
);