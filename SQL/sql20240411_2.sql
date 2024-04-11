-- join 두 개 이상의 테이블을 연결하여 데이터를 검색하는 방법
/*
 cross join
 inner join
 outer join
 self join
 */
use testdb;

-- cross join 한 쪽 테이블의 각 행마다 다른 쪽 테이블의 모든 행이 한 번씩
--			  매칭되는 조인을 의미
select
	부서.부서번호,
	부서명,
	이름,
	사원.부서번호
from
	부서
cross join 사원
where
	이름 = '배재용';
	
-- inner join (내부조인) 각 테이블에서 조인조건에 일치하는 데이터만 조인
-- '이소미'사원의 사원호, 직위, 부서번호, 부서명
-- ANSI SQL 조인
select
	사원번호, 
	직위,
	부서.부서번호,
	부서명
from
	사원
inner join 부서
on
	사원.부서번호 = 부서.부서번호
where
	이름 = '이소미';
	
-- Non-ANSI SQL 조인 (위 방법과 결과는 같으나 문법이 다름)
select
	사원번호,
	직위,
	부서.부서번호,
	부서명
from
	사원
where
	사원.부서번호 = 부서.부서번호
	and 이름 = '이소미';
	
-- 고객회사들이 주문한 주문건수를 많은 순서대로 보이시오
-- 컬럼은 고객번호, 담당자명, 고객회사명, 주문건수

select
	고객.고객번호,
	담당자명,
	고객회사명,
	count(*) as 주문건수
from
	고객
inner join 주문
on
	고객.고객번호 = 주문.고객번호
group by
	고객.고객번호,
	담당자명,
	고객회사명
order by
	count(*) desc;
	
-- 고객별로 주문금액 합을 보이되, 주문금액 합이 많은 순서대로
-- 컬럼은 고객번호, 담당자명, 고객회사명, 주문금액합
select
	고객.고객번호,
	담당자명,
	고객회사명,
	sum(주문수량 * 단가) as 주문금액합
from
	고객
inner join 주문
	on
	고객.고객번호 = 주문.고객번호
inner join 주문세부
	on
	주문.주문번호 = 주문세부.주문번호
group by
	고객.고객번호,
	담당자명,
	고객회사명
order by
	4 desc;	

-- 모든 사원의 사원번호, 이름, 부서명 표시
select
	사원번호,
	이름,
	-부서명
from
사원,
부서;

-- 주문번호 'H0255'의 제품명과 주문수량, 단가 표시
select
	o.주문번호,
	p.제품명,
	o.주문수량,
	o.단가
from
	주문세부 o
inner join 제품 p 
on
	o.제품번호 = p.제품번호
where
	o.주문번호 = 'H0255';

-- Non-Equi Join =연산자가 아닌 부등호 비교연산자를 이용한 조인
select
	고객번호,
	고객회사명,
	담당자명,
	마일리지,
	등급명
from
	고객
inner join 마일리지등급
on
	마일리지 >= 하한마일리지
	and 마일리지 <= 상한마일리지
where
	담당자명 = '이은광';

-- outer Join (외부조인)
-- 사원중에 부서배치가 되지 않은 사원이 누군지 확인가능
-- outer 키워드는 생략 사능
select
	사원번호,
	이름,
	부서명
from
	사원
left outer join 부서
on
	사원.부서번호 = 부서.부서번호;

-- 부서중에 사원이 소속되어 있지 않는 부서를 확인 가능
select
	사원번호,
	이름,
	부서명
from
	사원
right outer join 부서
on
	사원.부서번호 = 부서.부서번호;

-- self join (셀프조인) 동일한 테이블 안에서 한 컬럼이 다른 컬럼을 참조하는 경우에 사용
-- 마치 동일한 테이블을 다른 테이블인 것 처럼 조인시키는 방법
select
	사원.사원번호,
	사원.이름,
	사원.상사번호 as '상사의 사원번호',
	상사.이름 as '상사의 이름'
from
	사원
inner join 사원 as 상사
on
	사원.상사번호 = 상사.사원번호;
	
-- 상사가 없는 사원까지 포함된 데이터를 요구할 경우 사용
select
	사원.사원번호,
	사원.이름,
	사원.상사번호 as '상사의 사원번호',
	상사.이름 as '상사의 이름'
from
	사원
left outer join 사원 as 상사
on
	사원.상사번호 = 상사.사원번호;