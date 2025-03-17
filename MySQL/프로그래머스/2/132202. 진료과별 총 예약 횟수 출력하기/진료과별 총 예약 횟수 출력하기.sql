-- 코드를 입력하세요
SELECT a.MCDP_CD as '진료과코드',
count (a.PT_NO) as '5월예약건수'
FROM APPOINTMENT a
where substring(APNT_YMD, 1,7) = '2022-05'
group by a.MCDP_CD
order by count (a.PT_NO) , a.MCDP_CD