/*Criar três view que envolva duas tabelas*/

create view pagamentoCliente as 
select count(pagamento.cliente_id), cliente.primeiro_nome from pagamento join cliente
on cliente.cliente_id = pagamento.cliente_id group by cliente.primeiro_nome;

select * from pagamentoCliente;

create view clienteNomeEnderecoCidade as 
select cliente.primeiro_nome, endereco.endereco, cidade.cidade from cliente, endereco, cidade
where cliente.endereco_id = endereco.endereco_id and cidade.cidade_id = endereco.cidade_id;

 

select * from clienteNomeEnderecoCidade;

/*Criar três views que envolva três tabelas ou mais*/

create view numeroalugado as
select filme.filme_id, count(*) as 'numero de vezes alugado', filme.titulo 
from aluguel inner join inventario 
on aluguel.inventario_id = inventario.inventario_id join filme 
on filme.filme_id=inventario.filme_id 
where aluguel.inventario_id=inventario.inventario_id 
group by filme.filme_id;

select * from numeroalugado;

/*Stored Procedure*/

DELIMITER $$
CREATE PROCEDURE INSERIR_VENDEDOR(
	IN CODIGO_VENDEDOR INT,
	IN N_VEND VARCHAR(40),
	IN SAL_VEND FLOAT,
	IN COMISSAO INT

 

)
BEGIN
INSERT INTO VENDEDOR
(
ID_VENDEDOR,
NOME_VENDEDOR,
SALARIO_VENDEDOR,
COMISSAO
)
VALUES(CODIGO_VENDEDOR,N_VEND,SAL_VEND,COMISSAO);
END
$$