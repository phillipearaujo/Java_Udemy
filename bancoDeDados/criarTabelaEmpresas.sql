CREATE TABLE IF NOT EXISTS empresas (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cnpj INT UNSIGNED,
    PRIMARY KEY (id),
    UNIQUE KEY (cnpj)
);

-- cidades_empresas
CREATE TABLE IF NOT EXISTS empresas_unidades (
    empresa_id INT UNSIGNED NOT NULL,
    cidade_id INT UNSIGNED NOT NULL,
    sede TINYINT(1) NOT NULL, 
    PRIMARY KEY (empresa_id, cidade_id)
);
-- O atributo 'sede' indica se a empresa tem sede ou não na cidade. Por meio do valor tipo TINYINT de 1 dígito
-- será atribuído 0 para não sede e 1 para sede na cidade.
-- A chave primária é uma composição de 2 colunas.
