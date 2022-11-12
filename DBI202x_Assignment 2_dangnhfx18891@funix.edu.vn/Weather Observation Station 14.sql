select cast(max(lat_n) as decimal(16,4))
from station
where lat_n < 137.2345