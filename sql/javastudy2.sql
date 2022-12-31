CREATE DATABASE JJBAE2;

create table ADDRESS_BOOK2 (
	SEQ_NUM			INT		primary key auto_increment COMMENT '일련번호'
	, NAME			VARCHAR(20) not null 	COMMENT '이름' 
	, PHONE_NUMBER	VARCHAR(20)			 	COMMENT	'전화번호 1'
	, PHONE_NUMBER2	VARCHAR(20)				COMMENT '전화번호 2'
	, BIRTH			VARCHAR(20)				COMMENT '생년월일'
	, ADDRESS		VARCHAR(100) not null 	COMMENT '주소'
) ENGINE=InnoDB DEFAULT CHARACTER SET UTF8 COLLATE UTF8_GENERAL_CI;

insert into address_book values (0, '배재준', '01087953817', '', '2009-04-13', '');
insert into address_book(NAME, PHONE_NUMBER, ADDRESS) values ('배재율', '01000000000', '경기도 수원시');
insert into	address_book(NAME, PHONE_NUMBER, ADDRESS) values ('배수현', '01000000000', '서울시 송파구');

delete from address_book where SEQ_NUM = 1;

update address_book set ADDRESS = '경기도 수원시' where SEQ_NUM = 1;

select * from address_book ab where SEQ_NUM = 1;
select * from address_book ab where ADDRESS like '%경기%';