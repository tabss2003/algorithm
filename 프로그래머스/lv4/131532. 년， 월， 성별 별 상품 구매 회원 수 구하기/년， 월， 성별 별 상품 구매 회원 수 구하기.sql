-- 코드를 입력하세요
# SELECT * from online_sale where year(sales_date)="2022";
# select * from online_sale where month(sales_date)="1";
select year(os.sales_date) YEAR, month(os.sales_date) MONTH, ui.gender GENDER, count(distinct ui.user_id) USERS from online_sale os left join user_info ui 
on os.user_id = ui.user_id
group by year(os.sales_date), month(os.sales_date), ui.gender
having GENDER is not null
order by year(os.sales_date) asc, month(os.sales_date) asc, ui.gender asc;