-- 코드를 입력하세요
# select outs.animal_id ,outs.name
# from animal_outs as outs
# left join animal_ins as ins
# on outs.animal_id = ins.animal_id
# where ins.animal_id IS NULL;

select outs.animal_id, outs.name
from animal_outs as outs
where outs.animal_id not in (select ins.animal_id from animal_ins as ins);
