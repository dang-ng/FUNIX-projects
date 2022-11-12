select n, case when n in (select n from bst where p is null)
            then 'Root'
            when n not in (select p from bst where p is not null) 
            then 'Leaf' 
            else 'Inner' end 
from bst order by n