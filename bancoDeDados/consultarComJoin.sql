select * from estados e, cidades c 
WHERE e.id = c.estado_id;
-- Neste exemplo criamos um filtro relacionando as 2 tabelas (estados e cidades) e atribuimos a elas um "apelido"
-- para facilitar na busca relacionada utilizando a chave estrangeira 'estado_id'. 
-- DESCRIPTION SELECT -> retorne da busca em toda a tabela estado "e" e na tabela cidades "c" onde 
-- o id da tabela estados for igual ao estado_id da tabela cidades

select e.nome as ESTADO, 
       c.nome as CIDADE,
       regiao as REGIÃO  
from estados e, cidades c 
WHERE e.id = c.estado_id;
-- Neste realizamos um filtro utilizando o alias(apelido) devido a ambiguidade da coluna nome que está
--presente nas 2 tabelas e alteramos o rótulo da tabela utilizando 'as'. A coluna regiao não necessita de 
-- utilizar o alias porque não possui ambiguidade entre as tabelas.
--DESCRIPTION SELECT -> retorne da busca a coluna nome da tabela estados e a coluna nome da tabela cidades 
-- e a região na tabela exixtente onde o id da tabela estados for igual ao estado_id da tabela cidades

select 
    e.nome as Estado,
    c.nome as Cidade,
    regiao as Região
from estados e
INNER JOIN cidades c
on e.id = c.estado_id
--Neste exemplo utilizamos o 'INNER JOIN' para fazer a junção das tabelas ao gerar o filtro
-- retornando o mesmo resultado do filtro anterior.

    -- OUTROS TIPOS DE JOIN --
--INNER JOIN -> tem como resultado o que está dentro da interceção entre 2 tabelas. O qua ha em comum entre elas
--OUTER JOIN -> trás tudo o que está fora da interceção. O que não há nehum aspecto em comum
--LEFT JOIN -> além do inner, adiciona o que está a ESQUERDA dessa relação.
--RIGHT JOIN -> além do inner, adiciona o que está a DIREITA dessa relação.
--FULL JOIN -> este não é suportado pelo MySQL mas podemos simular usando o UNION pois outros bancos trás esse suporte.
--O full join como o próprio nome diz, retorna toodo o conteúdo das tabelas pesquisadas.