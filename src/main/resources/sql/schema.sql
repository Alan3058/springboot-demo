drop table if exists user;

create table user (
	id varchar(32) primary key,
	name varchar(10),
	age int
);