-- No exemplo abaixo vamos fazer um filtro por REGIÃO somando a POPULAÇÃO dos estados pertencentes.
-- Usamos 'as Região' e 'as Total' para renomear as colunas geradas pelo filtro.
-- Usamos a função 'SUM' para soma a população de cada região.
-- Usamos GROUP BY para agrupar por região.
-- Usamos ORDER BY ... desc para ordenas do maior para o menor(decrescente).
select 
    regiao as Região,
    sum(populacao) as Total
from `estados`
GROUP BY regiao
order by Total desc

-- Abaixo vamos fazer a soma da população de todos os estados.
select 
    sum(populacao) as Total
from `estados`

-- Abaixo utilizamos a função 'AVG' para gerar a media da população por estado. A função avg somou a população e dividiu pela quantidade de estados(linhas) na nossa tabela.
select 
    avg(populacao) as Total
from `estados`

