with t as (select row_number() 
           over (order by x) num, x, y 
           from functions)

select distinct a.x, a.y 
from t a, t b 
where a.x = b.y 
and b.x = a.y 
and a.num <> b.num 
and a.x <= a.y 
order by a.x