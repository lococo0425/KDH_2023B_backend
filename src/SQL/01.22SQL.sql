/* 주석 */
# 한줄 주석
-- 한줄 주석


#코드실행 : Ctrl+enter  한줄씩 실행
#		  위에 번개모양 클릭 ---> 한번에 실행 		



-- 1. 데이터베이스 : 데이터가 모여있는 공간 = 테이블을 여러개 저장하는 공간 
drop database if exists test3;		 #만약 test3 데이터베이스가 존재하면 삭제 
create database test3; 				 #test3 데이터베이스 생성
use test3;							 #test3 데이터베이스 사용선언

-- 2. 테이블 : 행/열로 이루어진 표/테이블 [ * 테이블 간 관계가 있으면 => 관계형 데이터베이스]
drop table if exists member;				#만약 'member'라는 테이블이 존재하면 삭제 


create table member( 		
	mno int,				-- 회원번호
    mid varchar(30),		-- 회원아이디
    mphone char(20),		
			-- char(고정길이) (필드의 저장할 문자의 길이가 절대적으로 고정값일때 사용)
			-- varchar(가변길이) (필드에 저장할 문자의 길이가 명확하지 않을때)
	mname varchar(10),		-- 회원 이름
    confirm tinyint,		-- 광고 문자 전송 여부 boolean true/false 1/0
    joindate datetime		-- db는 대소문자 구별(X) ,  날짜 0000-00-00 0:00:00
    #마지막 필드 뒤에 쉼표 없음!!
);						
#member라는 테이블 생성  create 테이블명(필드명 타입)

select * from member;			#'member'테이블 검색
#---------------------------------------------------------------------------------------------#
#테이블 : 행/열 이루어진 데이터 집합
#레코드 : 테이블 행 단위(row)
#필드 : 테이블 열 단위(column)

 #1. 레코드(=필드값) 삽입 (= insert into 테이블명 values(값1, 값2,값3,값4,값5,값6...); )
 insert into member values(1,'qwe','010-0000-0000','유재석',false,"2024-01-22 16:07:01");
	-- 리터럴 값을 넣을때는 [숫자 그냥 넣기] , [문자 ' '] ,[날짜/시간 ' ']
select * from member;

#(필드 데이터의) 제약조건(검사규칙)---------------------------------------------------------------------------#
#1. not null : 해당 필드에 null 이 포함 되지 않는다.
drop table if exists member2;
create table member2(
회원번호1 int, 		#1. not null -> 해당 필드에 null 값을 사용 할 것 인지 안할 것인지!
회원번호2 int not null
);
#레코드 삽입
	#1. insert into 테이블명 values(값)
    #2. insert into 테이블명(특정필드) values(값)

insert into member2 values(1,2);      -- (전체 필드에 값 대입시)회원번호 1 필드에 1 대입 , 회원번호 2 필드에 2 대입 
-- insert into member2(회원번호1) values(1);		  -- (특정 필드에 값 대입시 필드명 명시)  회원번호2 필드가 not null 이므로 오류 발생!!
insert into member2(회원번호2) values(2);		  -- (특정 필드에 값 대입시 필드명 명시)
select * from member2;

#2. default : 해당 필드의 기본값 설정 
drop table if exists member3;
create table member3(
	회원번호1 int,				
    회원번호2 int default 0,				#2. defualt 값 
    국적 char(4) default '대한민국',
    동의여부 boolean default true,
    날짜 datetime default now()		# now() 함수는 현재날짜와시간을 반환해주는 SQL 함수
);
insert into member3 values();		# 레코드 삽입시 필드 값이 없을 경우 기본 값으로 대입 
insert into member3 values(10, 20 ,"일본",false,"2024-01-22 16:44:00");		# 레코드 삽입시 필드 값이 있을 경우 대입
select *from member3;

#3. unique : 중복된 값을 저장 할 수 없다. 
drop table if exists member4;
create table member4(
회원번호1 int,
회원번호2 int unique
);
insert into member4 values(1,2);
# insert into member4 values(1,2); 앞에 중복된 값이 있으므로 들어갈 수 없다. 
insert into member4 values(1,3);
select * from member4;

#4. primary key(기본키)
    #1 식별용 [레코드를 고유하게 구분하기 위한 최소의 정보](=식별)
#5. foreign key(외래키)
    #1 참조용 [다른 테이블의 기본키와 연결된 정보](=참조)

#----------회원제 게시판----------#
#계층구조 : 회원 (상위), 게시판 (하위)
#테이블1개 : 서로 다른 목적의 데이터들을 하나의 테이블로 작성시 이상현상(중복/불필요한정보)발생
#테이블2개 : 동일한 목적의 데이터끼리 테이블을 생성해서 연결/관계(pk-fk) 이용한 관계형 데이터베이스 구축 

#5-1 회원 테이블 
	#1.회원번호/2.회원아이디/3.비밀번호/4.이름
    # 필드별 타입 선정 ->제약조건 걸기 -> pk 선정(식별키 : 중복 없음, 공백 없음, 하나의 레코드 대표가 되어야함!!)
drop table if exists member5;
create table member5(
 mno int not null unique,				-- not null 이면서 중복없는 필드 
 mid varchar(30) not null unique,		-- not null 이면서 중복없는 필드
 mpw varchar(30) not null, 				-- not null
 mname varchar(20) default"익명",		-- default값이 익명이고 값을 입력하면(insert) 입력값 저장
primary key(mno)						-- mno 필드를 기본키(pk)로 사용 / 관례적으로 테이블 하나당 pk필드 1개 이상....
);

#5-2 게시판 테이블 
	#1.게시물번호/ 2.게시물제목/3.게시물내용
    # 필드별 타입 선정 -> 제약조건걸기 -> fk 선정(외래키 : 
drop table if exists board;
create table board(
bno int 	not null unique,
btitle varchar(255)		not null,
bcontent longtext,
primary key(bno) ,				-- bno 필드를 기본키(pk)로 사용
-- 참조 만들기. 게시물 회원 참조
mno_fk int,
foreign key(mno_fk) references member5(mno)
# foreign key(fk로 사용할 필드) references pk필드테이블(pk필드)     관례적으로 fk는 pk 와 동일 명칭을 사용 한다 
);
select * from board

