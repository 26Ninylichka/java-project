CREATE TABLE Students
(
    first_name TEXT NOT NULL,
    last_name  TEXT NOT NULL,
    faculty    TEXT NOT NULL
);


INSERT INTO Students(first_name, last_name, faculty, year)
VALUES ('Nina', 'V oronetska', 'Java', 27),
       ('Al', 'Kab', 'Java', 28),
       ('Eugen', 'Holodiuc', 'Java', 29),
       ('Anton', 'Lappa', 'Java', 30),
       ('Nika', 'Askerova', 'Java', 28);

SELECT *
FROM Students;


UPDATE Students
SET faculty = 'Java'
WHERE last_name = 'Nina';


DELETE
FROM Students
WHERE first_name = 'Nina'
  AND last_name = 'Voronetska'
;

ALTER TABLE Students
    ADD COLUMN year INT NOT NULL;


ALTER TABLE Students
    DROP COLUMN year;


ALTER TABLE Students
    ADD COLUMN year DATE;

SELECT *
FROM Students;

ALTER TABLE Students
    ALTER COLUMN year TYPE INT USING year::INT;


DROP TABLE IF EXISTS car;

SELECT DISTINCT *
FROM Students;

SELECT COUNT(*)
FROM Students;


SELECT *
FROM Students
ORDER BY year;


SELECT *
FROM Students
ORDER BY year DESC;


SELECT *
FROM Students
WHERE year IS NOT NULL
ORDER BY year;


SELECT MIN(year) FROM Students;


SELECT MAX(year) FROM Students;


SELECT AVG(year) FROM Students;

SELECT AVG(year) FROM Students WHERE year <0;

SELECT SUM(year) FROM Students;