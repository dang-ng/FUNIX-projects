select hacker_id, name
from (select hackers.hacker_id, hackers.name, count(hackers.hacker_id) as c
    from hackers, submissions, challenges, difficulty 
    where hackers.hacker_id = submissions.hacker_id 
    and submissions.challenge_id = challenges.challenge_id 
    and challenges.difficulty_level = difficulty.difficulty_level 
    and submissions.score = difficulty.score 
    group by hackers.name, hackers.hacker_id) as a 
where c > 1 
order by c desc, hacker_id