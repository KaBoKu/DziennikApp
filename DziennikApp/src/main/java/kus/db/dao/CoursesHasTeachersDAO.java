package kus.db.dao;

import kus.hibernate.classes.Courses;
import kus.hibernate.classes.Teachers;

public interface CoursesHasTeachersDAO {
	void addTeachersToCourses(Courses c, Teachers t);
}
