drop database if exists Psdb;
create database Psdb;
use Psdb;
drop table if exists psmember;
create table psmember(
   mno int auto_increment,
   mid varchar(50),
    mpw varchar(50),
    mphone varchar(20),
    
    primary key(mno)
);
drop table if exists movies;
create table movies(
movie_id int auto_increment primary key ,
    movie_title VARCHAR(255),
    director VARCHAR(255),
    producer VARCHAR(255),
    income_company VARCHAR(255),
    distribution_company VARCHAR(255),
    release_date VARCHAR(30),
    movie_type VARCHAR(255),
    movie_style VARCHAR(255),
    nationality VARCHAR(255),
    total_screen_count INT,
    sales_price DOUBLE,
    viewing_number INT,
    seoul_sales_price DOUBLE,
    seoul_viewing_number INT,
    genre VARCHAR(255),
    grade VARCHAR(255),
    movie_subdivision VARCHAR(255)
    
);



select * from psmember;
select *from movies;