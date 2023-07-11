-- 코드를 입력하세요
# SELECT * from car_rental_company_rental_history 
# where year(start_date) = 2022 
# and month(start_date) >= 8 and month(start_date) <=10;

select month(start_date) MONTH, 
    CAR_ID, count(history_id) RECORDS 
from car_rental_company_rental_history
where car_id in (
        select car_id
        from car_rental_company_rental_history
        where year(start_date) = 2022 
            and month(start_date) in (8,9,10)
        group by car_id
        having count(car_id)>=5
    ) and year(start_date) = 2022 
        and month(start_date) in (8,9,10)
group by MONTH, car_id
having RECORDS >0
order by MONTH asc, car_id desc;