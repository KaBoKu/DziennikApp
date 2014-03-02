package kus.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import kus.hibernate.classes.Schedule;
import kus.hibernate.util.HibernateUtil;

public class ScheduleDAOImpl implements ScheduleDAO{
	
	SessionFactory sF = null;
	Session session = null;
	Transaction tr = null;
	
	@Override
	public void createSchedule(Schedule s) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
	}

	@Override
	public void updateSchedule(Schedule s) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.update(s);
		tr.commit();
		session.close();
	}

}
