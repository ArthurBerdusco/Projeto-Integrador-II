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
    nome varchar (40) not null,
    usuario varchar(15) not null,
    senha varchar(15) not null
);

create table pedido(
	id_pedido int auto_increment primary key,
    data_pedido date not null,
    valor_total float not null,
    id_cliente int,
    id_vendedor int,
    foreign key (id_cliente) references cliente(id_cliente),
    foreign key (id_vendedor) references cliente(id_cliente)
);

create table produto(
	id_produto int auto_increment primary key,
    descricao varchar(30) not null,
    cod_barras varchar(18) not null,
    valor_venda float not null,
    valor_custo float not null,
    margem_lucro decimal(5,3) not null,
    categoria varchar(20) not null,
	foto blob,
	corredor char(1) not null,
    pratileira int not null,
    quantidade int not null
);

create table item_pedido(
	id_item bigint auto_increment primary key,
    quantidade int not null,
    valor float not null,
    id_pedido int,
    id_produto int,
    foreign key (id_pedido) references pedido(id_pedido),
    foreign key (id_produto) references produto(id_produto)
);






