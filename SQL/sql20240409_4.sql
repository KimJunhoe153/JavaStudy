-- now 현재 날짜와 시간
-- sysdate 현재 시스템의 날짜와 시간 (대부분 now와 동일)
-- curdate 현재 날짜
-- curtime 현재 시간
select
	now(),
	sysdate(),
	curdate(),
	curtime();

-- 연도, 분기, 월, 일, 시, 분, 초 반환 함수
select
	now(),
	year(now()),
	quarter(now()),
	month(now()),
	day(now()),
	hour(now()),
	minute(now()),
	second(now());

-- datediff 날짜간의 일수 차이
-- timestampdiff 두 날짜의 시간을 기준시간으로 변환하여 차를 계산하고
-- 다시 날짜로 변환하는 내부 프로세스를 따름
select
	now(),
	datediff('2025-12-20', now()),
	datediff(now(), '2025-12-20'),
	timestampdiff(year, now(), '2025-12-20'),
	timestampdiff(month, now(), '2025-12-20'),
	timestampdiff(day, now(), '2025-12-20'); 

-- adddate 특정날짜에 기간을 더한 날짜 반환
-- subdate 특정날짜에 기간을 뺀 날짜 반환
select
	now(),
	adddate(now(), 50),
	adddate(now(), -50),
	adddate(now(), interval 50 day),
	adddate(now(), interval 50 month),
	adddate(now(), interval 50 year),
	subdate(now(), interval 50 hour);
	
-- last_day 그 달의 마지막 날
-- dayofyear 현재 연도에서 며칠이 지났는지
-- minthname 월을 영문으로
-- weekday 요일을 정수로 (MySQL의 경우 월 = 0, 일 = 6)
select
	now(),
	last_day(now()),
	dayofyear(now()),
	monthname(now()),
	weekday(now()); 
	
-- cast 데이터타입을 변경시킴
/* MySQL / Maria의 데이터타입
chat, signed, unsigned, date, datetime, time, binary
*/
select
	cast('1' as unsigned),
	cast(2 as char);
	
-- if(조건식, 참인경우, 거짓인경우)
select
	if(12500 * 450 > 500000, '초과달성', '미달성');

-- ifnull(A, B)
-- A가 null이면 B, A가 null이 아니면 A를 반환
select
	ifnull(5, null),
	ifnull(null, '값이 없음'),
	ifnull(1 / 0, null);
	
-- case
-- 'case when 조건 then 실행'의 형태로 조건에 따른 실행을 여러개 설정가능
-- 조건의 마지막에 나머지를 의마하는 else 사용 (사용하지 않아도 됨)
-- case문의 마지막을 의미하는 end 사용 (반드시 사용)
select
	case
		when 21500 * 450 > 50000 then '초과달성'
		when 2500 * 450 > 400000 then '달성'
		else '미달성'
	end;
