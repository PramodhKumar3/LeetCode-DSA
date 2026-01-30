# Write your MySQL query statement below
select 
case
    when mod(id, 2) = 0 then id - 1
    when id = count(*) over () then id
    else id + 1
end as id, student
from Seat
order by id