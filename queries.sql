## Part 1: Test it with SQL
describe job

## Part 2: Test it with SQL
SELECT *
FROM employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
    select name, description
    from skill
    inner join job_skills on skill.id = job_skills.skills_id
    order by skill.name;