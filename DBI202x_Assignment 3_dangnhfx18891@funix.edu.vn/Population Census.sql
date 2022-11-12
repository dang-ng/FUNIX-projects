select sum(ci.population) 
from city as ci 
join country as co 
on ci.countrycode = co.code 
where co.continent = 'asia' 
group by co.continent