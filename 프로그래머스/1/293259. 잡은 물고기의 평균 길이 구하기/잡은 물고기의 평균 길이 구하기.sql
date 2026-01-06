-- 코드를 작성해주세요
select round(avg(IFNull(length, 10)), 2) AS AVERAGE_LENGTH
from FISH_INFO ;