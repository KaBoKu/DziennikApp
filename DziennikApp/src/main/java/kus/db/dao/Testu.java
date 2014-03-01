package kus.db.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import kus.hash.SHAHashing;
import kus.hibernate.classes.Userroles;
import kus.hibernate.classes.Users;
import kus.hibernate.util.HibernateUtil;

public class Testu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO uDao = new UserDAOImpl();
		String pass = SHAHashing.hashing("mamamama");
		Users u = new Users("Kulfonik", pass, (byte)1);
		
		SessionFactory sF = HibernateUtil.getSessionFactory();
		Session s = sF.openSession();
		Transaction tr = s.beginTransaction();
		s.save(u);
		System.out.println(u.getUserId());
		s.flush();
		System.out.println(u.getUserId());
		Userroles uroles = new Userroles(u, "ROLE_STUDENT");
		s.save(uroles);
		s.flush();
		System.out.println(uroles.getUserRolesId());
		
		tr.commit();
		sF.close();
	}

}
