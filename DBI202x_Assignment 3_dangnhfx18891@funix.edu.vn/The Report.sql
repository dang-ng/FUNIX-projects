with a as (select students.name, grades.grade, students.marks 
           from students, grades 
           where students.marks <=grades.max_mark 
           and students.marks >= grades.min_mark)
select case when name in (select name from a where grade>=8) 
            then name end, grade, marks 
from a 
order by grade desc, name, marks desc