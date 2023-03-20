
ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

insert into empresas
    (nome, cnpj)
value
    ('Bradesco', 65336361000159),
    ('Vale', 17946368000140),
    ('Cielo', 63723258000136),
    ('Usiminas', 31712360000140);

DESC EMPRESAS;
DESC PREFEITOS;
select * from empresas;
select * from cidades;

INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
VALUES
    (1, 1, 1),
    (2, 1, 0),
    (1, 2, 0),
    (4, 5, 1),
    (2, 2, 1);