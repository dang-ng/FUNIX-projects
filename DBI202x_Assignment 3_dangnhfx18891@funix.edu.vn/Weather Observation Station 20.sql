select cast(
    (
(
    select min(lat_n)
    from (select top 50 percent lat_n from station order by lat_n desc) as tophalf
) +
(
    select max(lat_n)
    from (select top 50 percent lat_n from station order by lat_n) as bottomhalf
)
    )/2 as decimal(16,4))