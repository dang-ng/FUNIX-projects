select top 1 cast(long_w as decimal(16,4)) 
from station 
where lat_n > 38.778 
order by lat_n