declare @subdate date = '2016-03-01';
declare @remainingdate date = '2016-03-01';
declare @consistent_hackers table
(hacker_id int, submission_date date);
declare @count_hackers table 
(hacker_id int, submission_date date);

insert into @consistent_hackers
select hacker_id, submission_date
from submissions
where submission_date like '2016-03-01';

while @subdate < '2016-03-15'
begin
set @subdate = dateadd(day,1,@subdate);
insert into @consistent_hackers
select s.hacker_id, s.submission_date
from submissions s
join @consistent_hackers ch 
    on ch.hacker_id = s.hacker_id 
    and ch.submission_date like @remainingdate
where s.submission_date like @subdate;
set @remainingdate = dateadd(day,1,@remainingdate);
end

insert into @count_hackers
select count(distinct hacker_id),
submission_date
from @consistent_hackers
group by submission_date;

with max_hacker as (
    select row_number() over(
            partition by submission_date 
            order by count(s.hacker_id) desc, s.hacker_id asc) as row#,
           s.hacker_id,
           submission_date,
           name
    from submissions s
    join hackers h on h.hacker_id = s.hacker_id
    group by submission_date, s.hacker_id, name)

select s.submission_date,
       ch.hacker_id,
       mh.hacker_id,
       mh.name
from submissions s
join max_hacker mh on mh.submission_date = s.submission_date and row# =1
join @count_hackers ch on ch.submission_date = s.submission_date
group by s.submission_date, mh.hacker_id, mh.name, ch.hacker_id
order by s.submission_date