## Part 1: Test it with SQL
describe job

id - int(11)
employer - varchar(255)
name - varchar(255)
skills - varchar(255)

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT distinct name, description
FROM skill
INNER JOIN job_skill ON skill.id=job_skill.skill_id
WHERE job_skill.jobs_id IS NOT NULL
ORDER BY skill.name;