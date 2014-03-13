package kus.db.dao;

import java.util.Date;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import kus.hibernate.classes.Classes;
import kus.hibernate.classes.Teachers;
import kus.hibernate.util.HibernateUtil;

@Repository
public class ClassDAOImpl implements ClassDAO{
	SessionFactory sF = null;
	Session session = null;
	Transaction tr = null;
	@Override
	public void createClass(Classes c) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.save(c);		
		tr.commit();
		session.close();
	}
	@Override
	public void updateClass(Classes c) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.update(c);		
		tr.commit();
		session.close();
		
	}
}