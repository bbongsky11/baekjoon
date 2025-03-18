-- 코드를 입력하세요
SELECT o.YEAR , o.MONTH
     , count(DISTINCT o.user_id) as PURCHASED_USERS
    , ROUND(count(DISTINCT o.user_id) / u.userCnt, 1) as PUCHASED_RATIO
FROM (
    select *, count(USER_ID) OVER() as userCnt
     from USER_INFO
     where YEAR(JOINED)='2021'
     ) u
inner join 
     (
    select *, YEAR(SALES_DATE) as YEAR, MONTH(SALES_DATE) as MONTH
    from ONLINE_SALE
    ) o
on u.USER_ID = o.USER_ID
group by o.YEAR , o.MONTH
order by o.YEAR, o.MONTH;

   