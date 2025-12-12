# Write your MySQL query statement below
-- SELECT s.score, COUNT(s2.score) AS 'rank' FROM Scores s,
-- (SELECT DISTINCT score FROM Scores) s2
-- WHERE s.score <= s2.score
-- GROUP BY s.id ORDER BY s.score DESC;

SELECT score, DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank' FROM Scores;