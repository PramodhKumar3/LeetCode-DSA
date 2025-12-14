# Write your MySQL query statement below
SELECT e.name 
FROM Employee e JOIN Employee ee 
ON e.id = ee.managerId
GROUP BY ee.managerId HAVING COUNT(*) >= 5;