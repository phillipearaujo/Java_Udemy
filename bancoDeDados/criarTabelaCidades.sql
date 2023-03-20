CREATE TABLE IF NOT EXISTS cidades(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    estado_id INT UNSIGNED NOT NULL,
    area DECIMAL(10,2),
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) REFERENCES estados (id)
);

-- Criamos uma tabela 'teste' com apenas uma coluna  ja atribuindo a ela a característica de PRYMARY KEY.
--CREATE TABLE IF NOT EXISTS teste(
--        id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY
--);

-- Abaixo vamos eliminara a tabela 'teste' utilizando o comando DROP. Adicionamos ao comando o IF EXISTS 
--DROP TABLE IF EXISTS teste;