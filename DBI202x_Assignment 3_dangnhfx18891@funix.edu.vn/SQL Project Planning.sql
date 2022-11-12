with startdate as
    (select row_number() over (order by start_date) r, start_date from projects
     where start_date not in (select end_date from projects)),
    enddate as
    (select row_number() over (order by end_date) r, end_date from projects
    where end_date not in (select start_date from projects))
select s.start_date, e.end_date 
from startdate s, enddate e 
where s.r = e.r 
order by datediff(day, s.start_date, e.end_date), s.start_date 