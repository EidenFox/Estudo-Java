create database JavaDB;
use JavaDB;

create table produto(
	id int primary key auto_increment,
    nome varchar(100) not null,
    quantidade int not null,
    preco decimal (10,2) not null,
    state bool NOT NULL default 1
);

insert into produto (nome, quantidade, preco)
value ("Mouse", 2, 25.78);

UPDATE produto SET state = 0 WHERE id = 1;
UPDATE produto SET state = 1;
UPDATE produto SET state = 0;

delete from produto where id > 1;

select * from produto;






