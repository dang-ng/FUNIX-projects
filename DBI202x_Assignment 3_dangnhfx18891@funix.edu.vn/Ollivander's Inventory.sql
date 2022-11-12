select w.id, p.age, w.coins_needed, w.power
from wands w
join wands_property p on w.code = p.code
join (select code, min(coins_needed) mincoin, power
    from wands
    group by code, power) ww 
    on ww.code = w.code 
    and w.coins_needed = ww.mincoin 
    and w.power = ww.power
where p.is_evil = 0
order by w.power desc, p.age desc
