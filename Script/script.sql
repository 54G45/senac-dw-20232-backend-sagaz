drop database if exists senacdw;
create database senacdw;
use senacdw;

create table fabricantes (
id int auto_increment not null primary key,
nome varchar(400) not null,
cnpj varchar(14) not null

);

CREATE TABLE produtos (
	id int auto_increment not null primary key,
	nome varchar(400) not null,
	id_fabricante int not null,
	valor decimal not null,
	peso decimal not null,
	data_cadastro date not null,
	foreign key (id_fabricante) references fabricantes(ID)
);

insert into fabricantes (nome, cnpj)
values('Ouro', '11222333000022');

insert into fabricantes (nome, cnpj)
values('Pelé', '10222333000022');

insert into fabricantes (nome, cnpj)
values('Havaianas', '55222333000022');

insert into fabricantes (nome, cnpj)
values('Rider', '88222333000022');

insert into produtos (nome, id_fabricante, valor, peso, data_cadastro)
values('Café', 1, 12.5, 0.5, sysdate());

insert into produtos (nome, id_fabricante, valor, peso, data_cadastro)
values('Café', 2, 10.0, 0.5, sysdate());

insert into produtos (nome, id_fabricante, valor, peso, data_cadastro)
values('Chinela de tira', 3, 80.5, 0.2, sysdate());

insert into produtos (nome, id_fabricante, valor, peso, data_cadastro)
values('Chinela pesada', 4, 70.2, 0.3, sysdate());










