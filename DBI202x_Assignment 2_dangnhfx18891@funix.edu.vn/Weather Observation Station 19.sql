declare @p1 as decimal(16,4) = square((select min(lat_n) from station) - (select max(lat_n) from station))
declare @p2 as decimal(16,4) = square((select min(long_w) from station) - (select max(long_w) from station))
select cast(sqrt(@p1+@p2) as decimal(16,4));