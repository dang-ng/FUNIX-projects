with salaries as (select s.name, p.salary, f.friend_id
                  from students s, friends f, packages p
                  where s.id = f.id and s.id = p.id),
     friendsalaries as (select f.friend_id, p.salary friendsalary
                        from friends f, packages p
                        where f.friend_id = p.id)
select ss.name
from salaries ss
join friendsalaries ff
on ss.friend_id = ff.friend_id
where ss.salary < ff.friendsalary 
order by ff.friendsalary