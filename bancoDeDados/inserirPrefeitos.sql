insert into prefeitos
    (nome, cidade_id)
values
    ('Rodrigo Neves', 2),
    ('Raquel Lira', 3),
    ('Zenaldo Coutinho', null);

insert into prefeitos
    (nome, cidade_id)
values
    ('Rafael Greca', null)

select * from prefeitos

select * from cidades

insert into prefeitos
    (nome, cidade_id)
values
    ('Gustavo Nunes', (select id from cidades where nome = 'Ipatinga'))