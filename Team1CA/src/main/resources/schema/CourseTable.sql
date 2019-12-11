CREATE TABLE Course (
    CourseId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    CourseName varchar(255) NOT NULL,
    Unit int NOT NULL
);

-- dummy data insert --
insert into Course (CourseName, Unit) values ("C# Basics", '4');
insert into Course (CourseName, Unit) values ("Machine Learning in Python", '4');
insert into Course (CourseName, Unit) values ("Web Development in Java", '4');