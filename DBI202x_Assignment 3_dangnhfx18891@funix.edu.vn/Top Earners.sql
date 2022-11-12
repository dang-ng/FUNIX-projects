with T (earn, id) as (select salary*months as earn, employee_id as id  from employee )
select top 1 earn, count(id) 
from T 
group by earn 
order by earn desc