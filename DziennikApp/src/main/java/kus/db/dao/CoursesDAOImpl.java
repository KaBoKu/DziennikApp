package kus.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import kus.hibernate.classes.Courses;
import kus.hibernate.util.HibernateUtil;

public class CoursesDAOImpl implements CoursesDAO	{
	SessionFactory sF = null;
	Session session = null;
	Transaction tr = null;
	
	@Override
	public void createCourses(Courses c) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.save(c);
		tr.commit();
		session.close();
	}

	@Override
	public void updateCourses(Courses c) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.update(c);
		tr.commit();
		session.close();
	}

}
