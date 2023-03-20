SELECT * FROM `estados` 

SELECT nome, sigla from `estados`

SELECT sigla, nome as 'Nome do Estado' from `estados`

SELECT sigla, nome as 'Nome do Estado' from `estados` -- para alterar o rótulo da coluna adicionar 'as'
WHERE regiao = 'Sul' -- para filtrar algo dentro da tabela utilizar 'WHERE'

select nome, regiao, populacao from `estados` 
WHERE populacao >= 10
order by populacao -- ordenando de forma crescente.

select 
    nome, 
    regiao, 
    populacao 
from `estados` 
WHERE populacao >= 10
order by populacao desc -- para ordenar em forma decrescente adicionar 'desc'. 