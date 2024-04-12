use testdb;

-- 1. 제품 테이블과 주문세부테이블을 조인하여 제품명 별로
-- 주문수량 합과 주문금액 합을 보이시오 (group by 써야함)
select
	제품명, 
	sum(주문수량) as 주문수량합,
	sum(주문수량 * 단가) as 주문금액합
from
	제품
inner join 주문세부
on
	제품.제품번호 = 주문세부.제품번호
group by
	제품명;

-- 2. 주문, 주문세부, 제품테이블을 조인하여 '아이스크림'제품에 대하여
-- 주문년도별 제품명별로 주문수량합을 보이시오
select
	year (주문일) as 주문년도,
	제품명,
	sum(주문수량) as 주문수량합
from
	주문
inner join 주문세부 on
	주문.주문번호 = 주문세부.주문번호
inner join 제품 on
	주문세부.제품번호 = 제품.제품번호
where
	제품명 like '%아이스크림%'
group by
	year(주문일),
	제품명
order by
	1,
	2;
	
-- 3. 제품, 주문세부 테이블을 조인하여 제품명별로 주문수량합을 보이시오
--	  이 때 주문이 한 번도 안된 제품에 대한 정보도 나타내시오
select
	제품명,
	sum(주문수량) as 주문수량합
from
	주문세부
right join 제품
on
	주문세부.제품번호 = 제품.제품번호
group by
	제품명
order by
	1;

-- 4. 고객회사중 마일리지 등급이 'A'인 고객의 정보를 조회하시오
-- 컬럼은 고객번호, 담당자명, 고객회사면, 등급명, 마일리지
select
	고객번호,
	담당자명,
	고객회사명,
	등급명,
	마일리지
from
	고객
inner join 마일리지등급
on
	마일리지 between 하한마일리지 and 상한마일리지
where
	등급명 = 'A';