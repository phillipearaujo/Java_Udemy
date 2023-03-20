select * from prefeitos;

select * from cidades;

select * from cidades c INNER JOIN prefeitos p on c.id = p.cidade_id;

select * from cidades c LEFT JOIN prefeitos p on c.id = p.cidade_id;

select * from cidades c RIGHT JOIN prefeitos p on c.id = p.cidade_id;

-- select * from cidades c FULL JOINprefeitos p on c.id = p.cidade_id;

-- Abaixo estamos simulando o FULL JOIN utilizando o UNION para unir as pesquisas.
select * from cidades c left join prefeitos p on c.id = p.cidade_id
UNION
select * from cidades c right join prefeitos p on c.id = p.cidade_id;