package kus.db.dao;

import kus.hibernate.classes.Courses;

public interface CoursesDAO {
	void createCourses(Courses c);
	void updateCourses(Courses c);
}
