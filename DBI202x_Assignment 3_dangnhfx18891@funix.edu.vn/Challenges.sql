with a as (select h.hacker_id , count(c.challenge_id) counts
           from hackers h, challenges c where h.hacker_id = c.hacker_id
          group by h.hacker_id)

select h.hacker_id, h.name, a.counts
from hackers h 
join a a on h.hacker_id = a.hacker_id
where
    a.counts = (select max(counts) from a)
    or
    a.counts not in (select counts from a where hacker_id <> h.hacker_id)
order by a.counts desc, h.hacker_id
    