drop database if exists senacdw;
create database senacdw;
use senacdw;

create table fabricantes (
id int auto_increment not null primary key,
nome varchar(400) not null,
cnpj varchar(14) not null,
cidade varchar(50),
cep varchar(8),
UF varchar(45)
);


create table produtos (
	id int auto_increment NOT NULL primary key,
	nome varchar(400) NOT NULL,
	fabricante int NOT NULL,
	valor DECIMAL NOT NULL,
	peso DECIMAL NOT NULL,
	data_cadastro DATE NOT null,
	foreign key (fabricante) references fabricantes(id)
);

insert into fabricantes values(1,'pepsi', 16845279621547, 'nova iorque', 40028922, 'felicidade');
insert into fabricantes values(2,'Avaianas', 16845279627611, 'salvador', 86175498, 'bahia');
insert into produtos values(1, 'cola', 1, 10, 1, now());
insert into produtos values(2, 'chinela', 2, 20, 1, now());


select*from produtos;
select*from fabricantes;
