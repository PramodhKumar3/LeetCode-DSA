# Write your MySQL query statement below
-- SELECT d.name Department, e.name Employee, e.salary Salary 
-- FROM Employee e 
-- JOIN Department d 
-- ON e.departmentId = d.id 
-- WHERE e.salary = (
--     SELECT MAX(salary) 
--     FROM Employee 
--     WHERE departmentId = e.departmentId
--     );

SELECT d.Name AS Department,
       e.Name AS Employee,
       e.Salary
FROM Employee e
JOIN Department d 
  ON e.DepartmentId = d.Id
WHERE (e.Salary, e.DepartmentId) IN (
    SELECT MAX(Salary), DepartmentId
    FROM Employee
    GROUP BY DepartmentId
);