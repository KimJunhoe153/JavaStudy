-- DDL (데이터 정의어)
-- create, alter, drop, truncate

-- 문자형 데이터타입
/*
 char 고정길이 225자
varchar 가변길이 65535자
tinytext 255자
text 65535자
mediumtext 16, 777, 215자
longtext 4, 294, 967, 295자
json 1GB
*/

-- 숫자형 데이터타입
/*
tinyint 1byte
smallint 2byte
mediumint 3byte
int 4byte
bigint 8byte

flote 4byte (소수점 아래 7자리)
double 8byte (소수점 아래 15자리)
decimal (전체자릿수, 소수점자릿수)
*/

-- 날짜시간형 데이터 타입
/*
date YYYY-MM-DD
time HH:MI:SS
datetime  YYYY-MM-DD HH:MI:SS
timestamp YYYY-MM-DD HH:MI:SS
*/

-- 이진형 (binary) 데이터타입 : 이미지, 오디오, 비디오
/*
tinyblob 225byte
blob 65535 (blob = binary large object)
medium blob 16, 777, 215byte
longblob 4, 294, 967, 295byte
*/

-- create 데이터베이스 생성
create database project1;
char set utf8mb4 collate utf8mb4_general_c1;
use project1;

-- 테이블 생성
create table 학과
(학과번호 char(2),
학과명 varchar(20),
학과장명 varchar(20));

insert into 학과
values ('AA', '컴퓨터', '김김김'),
	('BB', '소프트웨어', '이이이'),
	('CC', '디자인', '박박박');

create table 학생
(학번 char(5),
이름 varchar(20),
생일 date,
연락처 varchar(20),
학과번호 char(2));

insert into 학생
values ('S0001', '이이이', '2020-01-30',
'01011112222', 'AA');
insert into 학생
values ('S0002', '김김김', '2021-02-23',
null, 'AA');
insert into 학생
values ('S0003', '백백백', '2018-03-31',
'01033334444', 'DD');

-- alter 테이블명이나 컬럼명, 데이터타입을 변경하거나 컬럼 추가, 삭제
alter table 학생 add 성별 char(1); -- 컬럼 추가

-- 컬럼 데이터타입 변경
alter table 학생 modify column 성별 varchar(2);

-- 컬럼명 변경
alter table 학생 change column 연락처 핸드폰전화번호 varchar(20);

-- 컬럼 삭제
alter table 학생 drop column 성별;

-- 테이블명 변경
alter table 학생 rename 재학생;

-- drop 데이터베이스 또는 테이블 삭제
create database temp; -- 만들기
drop database temp; -- 삭제하기

create table 휴학생
(학번 char(5),
이름 varchar(20),
생일 date,
연락처 varchar(20),
학과번호 char(2));

drop table 휴학생;

