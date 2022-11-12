with temp as (select name, 
              occupation, 
              row_number() over (partition by occupation 
                                 order by name) nums 
              from occupations)
select (select name from temp where nums = t.nums and occupation = 'doctor'),
       (select name from temp where nums = t.nums and occupation = 'professor'),
       (select name from temp where nums = t.nums and occupation = 'singer'),
       (select name from temp where nums = t.nums and occupation = 'actor') 
from temp t 
group by nums