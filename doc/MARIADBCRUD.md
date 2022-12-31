CRUD
=======
CRUD는 대부분의 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능인 CREATE(생성)READ(읽기)UPDATE(갱신)DELETE(삭제)를 행하는 말이다.
--------
이러한 CRUD를 SQL용어로 바꾸면 insert/select/update/delete가 된다.
--------

# 기본 테이블 예시

CREATE TABLE MEMBER(
    name varchar(50),
    email varchar(50),
    mobile_no varchar(11),
    password varchar(50),
    marketing_yn bit,
    register_date datetime
)

# insert

insert into문을 사용해 테이블에 새로운 레코드를 추가 할수 있음.
레코드 행을 구분할수 있어야 하는데, 그래서 나온 개념이 primary key다
주 식별자키로 테이블의 모든 데이터를 식별하는 컬럼, 중복 불가, NULL불가함.

# SELECT

SELECT 문을 사용하여 테이블의 레코드를 선택할 수 있다.
FROM뒤에 레코드를 선택할 테이블의 이름을 명시한다.


# UPDATE

UPDATE 문을 사용하여 레코드의 내용을 수정할 수 있는데, 해당 테이블에서 WHERE 절의 조건을 만족하는 레코드의 값만을 수정한다.
만약, WHERE를 생략한 경우 해당 테이블에 저장된 모든 데이터가 일괄 수정된다.

#DELETE

DELETE 문을 사용하여 테이블의 레코드를 삭제할 수 있는데, 해당 테이블에서 WHERE 절의 조건을 만족하는 레코드만을 삭제한다.
만약 WHERE를 생략한 경우 해당 테이블에 저장된 모든 데이터가 삭제된다.