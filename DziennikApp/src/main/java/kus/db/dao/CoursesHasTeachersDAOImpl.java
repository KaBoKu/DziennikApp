package kus.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import kus.hibernate.classes.Courses;
import kus.hibernate.classes.CoursesHasTeachers;
import kus.hibernate.classes.Parents;
import kus.hibernate.classes.ParentsHasStudents;
import kus.hibernate.classes.Students;
import kus.hibernate.classes.Teachers;
import kus.hibernate.util.HibernateUtil;

public class CoursesHasTeachersDAOImpl implements CoursesHasTeachersDAO{
	

	SessionFactory sF = null;
	Session session = null;
	Transaction tr = null;
	
	@Override
	public void addTeachersToCourses(Courses c, Teachers t) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		CoursesHasTeachers cHT = new CoursesHasTeachers(t, c);
		session.save(cHT);
		tr.commit();
		sF.close();
	}

}
