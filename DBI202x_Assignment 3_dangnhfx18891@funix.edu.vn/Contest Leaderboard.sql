with a as (select h.hacker_id, s.challenge_id, max(s.score) maxscore
           from hackers h, submissions s
           where h.hacker_id = s.hacker_id
           group by h.hacker_id, s.challenge_id)

select h.hacker_id, h.name, sum(a.maxscore) sm
from hackers h, a
where h.hacker_id = a.hacker_id 
group by h.hacker_id, h.name
having sum(a.maxscore) <> 0
order by sm desc, h.hacker_id