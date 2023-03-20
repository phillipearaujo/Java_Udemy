insert into estados
    (id, nome, sigla, regiao, populacao)
value
    (1000, 'Novo', 'NV', 'Sul', 2.54) -- id foi inserido de forma manual mesmo sendo auto incremento


insert into estados
    (nome, sigla, regiao, populacao)
value
    ('Mais Novo', 'MN', 'Norte', 2.51) -- id foi auto incrementado para 1001. O próximo após o maior informado

select * from `estados`