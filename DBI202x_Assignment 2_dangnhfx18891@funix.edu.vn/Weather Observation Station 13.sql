select cast(round(sum(lat_n),4,1) as decimal(16,4))
from station
where lat_n> 38.788 and lat_n < 137.2345;