with sub as (select challenge_id, 
                    sum(total_submissions) total_submissions, 
                    sum(total_accepted_submissions) total_accepted_submissions 
             from submission_stats 
             group by challenge_id),
    vw as (select challenge_id, 
                  sum(total_views) total_views, 
                  sum(total_unique_views) total_unique_views 
           from view_stats 
           group by challenge_id)

select ct.contest_id, ct.hacker_id, ct.name, 
       sum(sub.total_submissions), 
       sum(sub.total_accepted_submissions), 
       sum(vw.total_views), 
       sum(vw.total_unique_views)
from contests ct
join colleges cl on ct.contest_id = cl.contest_id
join challenges ch on ch.college_id = cl.college_id
left join sub on sub.challenge_id = ch.challenge_id
left join vw on vw.challenge_id = ch.challenge_id
group by ct.contest_id, ct.hacker_id, ct.name
having sum(sub.total_submissions) + 
       sum(sub.total_accepted_submissions) + 
       sum(vw.total_views) + 
       sum(vw.total_unique_views) <> 0
order by ct.contest_id
