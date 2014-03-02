package kus.db.dao;

import kus.hibernate.classes.Parents;
import kus.hibernate.classes.Students;
import kus.hibernate.classes.Teachers;

public interface DeleteUserDAO {
	void removeTeacher(Teachers t);
	void removeStudent(Students s);
	void removeParent(Parents p);
	
	void disableTeacher(Teachers t);
	void disableStudent(Students s);
	void disableParent(Parents p);

	void enableTeacher(Teachers t);
	void enableStudent(Students s);
	void enableParent(Parents p);
}
