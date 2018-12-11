SELECT title FROM movie WHERE  director LIKE "Steven Spielberg";

SELECT DISTINCT movie.year 
FROM Movie, Rating 
WHERE movie.mID = rating.mId
AND (stars = 4 OR stars = 5) 
ORDER BY year ASC;

SELECT title 
FROM Movie 
WHERE mID NOT IN (SELECT mID FROM Rating);

SELECT name FROM reviewer, rating 
WHERE reviewer.rID = rating.rID
AND ratingDate is NULL;

SELECT name, title, stars, ratingDate 
FROM movie, reviewer, rating
WHERE movie.mID = rating.mID 
AND reviewer.rID = rating.rID
ORDER BY name, title, stars ASC;