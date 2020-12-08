SELECT S1.score, ( SELECT COUNT(DISTINCT Score) FROM Scores WHERE Score >= S1.Score ) as 'Rank'
FROM Scores S1
ORDER BY S1.Score DESC;