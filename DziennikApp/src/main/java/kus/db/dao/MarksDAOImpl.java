package kus.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import kus.hibernate.classes.Marks;
import kus.hibernate.util.HibernateUtil;
@Repository
public class MarksDAOImpl implements MarksDAO {

	SessionFactory sF = null;
	Session session = null;
	Transaction tr = null;
	
	@Override
	public void addMark(Marks m) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.save(m);
		tr.commit();
		session.close();
	}

}
