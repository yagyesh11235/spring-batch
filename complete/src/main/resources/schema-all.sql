DROP TABLE student IF EXISTS;

CREATE TABLE student  (
    student_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    grade VARCHAR(20)
);
