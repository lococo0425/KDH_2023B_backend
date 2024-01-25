# 1. 데이터베이스 생성
drop database if exists test5;
create database test5;
use test5;							# DB서버 내 여러개의 데이터베이스가 존재하기 때문에 db를 선택해야한다.

# 2. 테이블 생성
drop table if exists table1;
create table table1(테이터필드1 int , 데이터필드2 varchar(30) );
 
 # 3. 조작어
 #insert
 insert into table1 values (1, "유재석");
 insert into table1 (데이터필드1) values(5);
 
 #select
 select * from table1;
 select 데이터필드2 from table1;
 
 #update
 update table1 set 데이터필드2 = '강호동';
 
 #delete 
 delete from table1;
 
 
