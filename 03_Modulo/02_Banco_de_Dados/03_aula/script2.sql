 create database imobiliaria;
 use imobiliaria;
 
 create table users (
 id_user serial primary key,
 nome varchar (50),
 email varchar (50),
 telefone varchar (50),
 endereco varchar (50)
 );
 
 create table clientes (
 id_cliente serial primary key, 
 nome varchar (50),
 endereco varchar (50),
 telefone varchar (20), 
 email varchar (50)
 );
 
 insert into users (nome, email, telefone, endereco) 
 values('Ana do Microondas', 'ana@microondas.com', '123456', 'Rua do Microondas')
 
 
select * from users;
 
 
 
 
 