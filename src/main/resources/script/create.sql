drop database if exists exemplo;
drop database if exists dbaluno;
create database exemplo;
use exemplo;

create table produtos (
	id int auto_increment NOT NULL primary key,
	nome varchar(400) NOT NULL,
	fabricante varchar(100) NOT NULL,
	valor DECIMAL NOT NULL,
	peso DECIMAL NOT NULL,
	data_cadastro DATE NOT NULL
);