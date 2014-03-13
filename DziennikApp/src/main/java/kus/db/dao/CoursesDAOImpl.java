package kus.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kus.hibernate.classes.Courses;
import kus.hibernate.util.HibernateUtil;



@Repository
public class CoursesDAOImpl implements CoursesDAO	{
	
	@Autowired(required=true)
	public SessionFactory sessionFactory;
	
	//SessionFactory sF = null;
	Session session = null;
	Transaction tr = null;
	
	@Override
	public void createCourses(Courses c) {
		// TODO Auto-generated method stub
		//sF = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		tr = session.beginTransaction();
		session.save(c);
		tr.commit();
		session.close();
	}

	@Override
	public void updateCourses(Courses c) {
		// TODO Auto-generated method stub
		//sF = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		tr = session.beginTransaction();
		session.update(c);
		tr.commit();
		session.close();
	}
}
