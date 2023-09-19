drop database if exists senacdw;
drop database if exists senacdw;
create database senacdw;
use senacdw;

create table produtos (
	id int auto_increment NOT NULL primary key,
	nome varchar(400) NOT NULL,
	fabricante varchar(100) NOT NULL,
	valor DECIMAL NOT NULL,
	peso DECIMAL NOT NULL,
	data_cadastro DATE NOT NULL
);

insert into produtos (nome, fabricante, valor, peso, data_cadastro)
values('Café', 'Ouro', 12.5, 0.5, sysdate());

insert into produtos (nome, fabricante, valor, peso, data_cadastro)
values('Chinela', 'Rasteiras de madeira', 80.5, 0.2, sysdate());