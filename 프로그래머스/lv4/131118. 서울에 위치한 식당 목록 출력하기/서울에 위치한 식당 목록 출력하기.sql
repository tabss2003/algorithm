-- 코드를 입력하세요

select ri.REST_ID, ri.REST_NAME, ri.FOOD_TYPE, ri.FAVORITES,ri.ADDRESS,
round(avg(rr.review_score),2) as SCORE
from rest_info ri join rest_review rr 
on ri.rest_id = rr.rest_id
group by ri.rest_id
having ri.address like '서울%'
order by SCORE desc, ri.FAVORITES desc;