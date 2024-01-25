/*
	데이터베이스 : 데이터(자료) 집합(모임)
		- 관계형 데이터베이스 : 행/열 이루어진 데이터 모임(테이블) 이면서 테이블 간의 관계 
        - SQL : 데이터베이스에서 사용되는 데이터처리 언어
			DDL (Data Definition Language)정의어
				1.DROP		:데이터베이스/테이블 삭제
				2.CREATE	:데이터베이스/테이블 생성
                
            DML (Data Manipulation Language)조작어
				1.insert	:레코드 삽입
					1-1.모든 레코드 삽입 				: insert into 테이블명 values(값,값,값);
                    1-2.특정 레코드 삽입 				: insert into 테이블명(필드명1,필드명2,필드명3) values(값1,값2,값3);
				
                2.select	:레코드 검색
					2-1.모든 필드(*)가 포함된 레코드 검색 	: select * from 테이블명;
                    2-2.특정 필드를 포함한 레코드 검색 		: select 필드명1, 필드명2 from 테이블명;
				
                3.update	:레코드 필드의 값 수정
					3-1 모든 필드 값을 수정 				: update 테이블명 set 수정할필드명 = 새로운값, 수정할필드명 = 새로운값;
                    3-2 특정 레코드의 필드 값을 수정		: update 테이블명 set 수정할필드명 = 새로운값, 수정할필드명 = 새로운값 where 조건식;
				
                4.delete	:레코드 삭제
					4-1 모든 레코드 삭제 				: delete from 테이블명;
                    4-2 특정(조건에 충족하는) 레코드 삭제	: delete from 테이블명 where 조건식;
                    
            -제약조건
				not null	: null 값 넣지 않겠음
				unique		: 중복 없음
				default		: 기본값
				primary key(pk 필드명)
				foreign key(fk 필드명) references 참조할테이블명(참조할pk필드명)
		

*/
#1. 데이터 베이스 생성

