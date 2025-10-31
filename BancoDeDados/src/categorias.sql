use JavaDB;

create table if not exists categoria(
	id int not null auto_increment primary key,
    nomeCategoria varchar(50) not null default "NULL",
    descricaoCategoria varchar(100) not null,
    estadoCategoria boolean default true
);

insert into categoria (nomeCategoria, descricaoCategoria) values
	("Perecivel", "Items que tem um curto prazo de validade"),
    ("Null", "Categoria apenas para teste");

select * from categoria;
