-- O uso do 'WHERE' é indispensável para que não se corra o risco de excluir toda a tabela acidentalmente, a não ser que
--propositalmente você queira excluir toda a tabela. 
-- O comando (delete from `estados`) é um comando válido e excluirá todos os registros da tabela.

select nome,
       sigla,
       populacao
from estados
WHERE id = 1000

delete from `estados`
where sigla = 'MN'

select * from `estados`

delete from estados
WHERE id >= 1000 -- pode usar um intervalo para realizar o delete.

select * from `estados`