create database toystore;

use toystore;

create table cliente(
	id_cliente int auto_increment primary key, 
	nome varchar(40) not null,
    cpf varchar(11) not null,
    data_nasc date not null,
    sexo varchar(10) not null,
    estado_civil varchar(12) not null,
    email varchar(30) not null,   
	endereco varchar (40) not null,
    numero int not null,
    complemento varchar (20),
    num_telefone varchar(15) not null
);

create table vendedor(
	id_vendedor int auto_increment primary key,
    usuario varchar(15) not null,
    senha varchar(15) not null
);

create table notafiscal(
	numeronnota int auto_increment primary key,
    data_nota date not null,
    valor_total float not null,
    id_cliente int,
    nome_vendedor int,
    foreign key (id_cliente) references cliente(id_cliente)
);

create table produto(
	id_produto int auto_increment primary key,
    descricao varchar(30) not null,
    cod_barras varchar(18) not null,
    valor_venda decimal not null,
    valor_custo decimal not null,
    margem_lucro decimal(5,3) not null,
    categoria varchar(30) not null,
	foto blob,
	corredor char(1) not null,
    pratileira int not null,
    quantidade int not null
);

create table item_nota(
	id_item bigint auto_increment primary key,
    quantidade int not null,
    valor float not null,
    numero_nota int,
    id_produto int,
    foreign key (numeronota) references notafiscal(numeronota),
    foreign key (id_produto) references produto(id_produto)
);






