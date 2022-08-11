DROP table IF EXISTS cliente;

create table empleado(
    id int auto_increment,
    nombre varchar(250),
    empleo varchar(250),
    salario varchar(250)
);

insert into empleado (nombre, empleo,salario)values('Jaume','Programador',28000);
insert into empleado (nombre, empleo,salario)values('Joan','Administrativo',20000);
insert into empleado (nombre, empleo,salario)values('David','Programador',28000);
insert into empleado (nombre, empleo,salario)values('Marc','Disenador',32000);