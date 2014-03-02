package kus.db.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import kus.hibernate.classes.Parents;
import kus.hibernate.classes.ParentsHasStudents;
import kus.hibernate.classes.Students;
import kus.hibernate.classes.Teachers;
import kus.hibernate.classes.Userroles;
import kus.hibernate.classes.Users;
import kus.hibernate.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.security.core.userdetails.User;

public class RegisterUserDAOImpl implements RegisterUserDAO{
	
	SessionFactory sF = null;
	Session session = null;
	Transaction tr = null;
	
	
	@Override
	public void addUser(Users u, Userroles uroles, Students s, Set<Parents> p) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.save(u);
		uroles.setUsers(u);
		s.setUsers(u);
		Set<ParentsHasStudents> pHSset = new HashSet<>();
		
		for(Parents pa: p){
			ParentsHasStudents pHS = new ParentsHasStudents(s, pa);
			session.save(pHS);
			pHSset.add(pHS);
		}
		s.setParentsHasStudentses(pHSset);
		session.save(p);
	}

	@Override
	public void addUser(Users u, Userroles uroles, Students s) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.save(u);
		uroles.setUsers(u);
		session.save(uroles);
		s.setUsers(u);
		session.save(s);
		tr.commit();
		sF.close();
	}

	@Override
	public void addUser(Users u, Userroles uroles, Teachers t) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.save(u);
		uroles.setUsers(u);
		session.save(uroles);
		t.setUsers(u);
		session.save(t);
		tr.commit();
		sF.close();
	}

	@Override
	public void addUser(Users u, Userroles uroles, Parents p) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		session.save(u);
		uroles.setUsers(u);
		session.save(uroles);
		p.setUsers(u);
		session.save(p);
		tr.commit();
		sF.close();
	}

	@Override
	public void setParent(Students s, Parents p) {
		// TODO Auto-generated method stub
		sF = HibernateUtil.getSessionFactory();
		session = sF.openSession();
		tr = session.beginTransaction();
		ParentsHasStudents pHS = new ParentsHasStudents(s, p);
		session.save(pHS);
		tr.commit();
		sF.close();
	}

}
