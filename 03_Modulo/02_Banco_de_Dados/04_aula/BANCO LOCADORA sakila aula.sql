select primeiro_nome, ultimo_nome from ator;

select * from ator where ator_id = 30; /*/tras a informação pedida*/

select * from ator where ator_id < 10;

select * from cidade where cidade = 'Acua';

select * from ator where primeiro_nome = 'Nick';

select * from filme;

select * from filme where titulo like 'h%';

select titulo, preco_da_locacao from filme order by preco_da_locacao;

/*Funções do SQL*/

 select min(preco_da_locacao) from filme;
 
  select max(preco_da_locacao) from filme;
  
 select avg(preco_da_locacao) from filme;
 
 select count(*) as 'Total filmes' from filmes;
 
 select * from sakila2.aluguel where aluguel_id = 1;
 
 select count(*) from sakila2.aluguel where funcionario_id = 1 group by funcionario_id;
 
 select funcionario_id, count(*) as 'Total locação' from sakila2.aluguel group by funcionario_id;
 
 
 /*Atividade */
 
 /*Quais países cadastrados? */
 select * from pais;
 
 /*Quantos países estão cadastrados?*/
 select count(*) as 'Total países' from pais;
 
 /*Quantos países terminam com a letra a?*/
 select * from pais where pais like '%a';
 
 /*Listar sem repetição os anos em que houveram lançamento de filme*/
 select distinct ano_de_lancamento from filme;
 
 /*Alterar o ano de lançamento igual 2007 para filmes que iniciem com a letra "B"*/
 update filme set ano_de_lancamento= 2007 where titulo like 'B%';
 
 /*Listar os filmes que possuem duração maior que 100 e classificação igual a "G"*/
select titulo from filme where duracao_do_filme > 100 and classificacao = 'G';

/*Listar a quantidade de filmes que estejam classificados*/ 
 
 