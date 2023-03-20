select nome, id from estados where sigla = 'RJ'

INSERT INTO cidades
    (nome, area, estado_id)
VALUES
    ('Campinas', 795, 28)

INSERT INTO cidades
    (nome, area, estado_id)
VALUES
    ('Niterói', 133.9, 22)

INSERT INTO cidades
    (nome, area, estado_id)
VALUES
    ('Caruaru', 920.6, (select id from estados where sigla = 'PE')) -- neste caso iserimos o filtro no lugar do estado_id

INSERT INTO cidades
    (nome, area, estado_id)
VALUES
    ('Juazeiro do Norte', 248.2, (select id from estados where sigla = 'CE')) -- neste caso iserimos o filtro no lugar do estado_id

INSERT INTO cidades
    (nome, area, estado_id)
VALUES
    ('Ipatinga', 165.5, (select id from estados where sigla = 'MG')) -- neste caso iserimos o filtro no lugar do estado_id

select * from cidades