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
 