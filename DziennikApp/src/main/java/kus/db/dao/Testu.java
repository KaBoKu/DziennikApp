package kus.db.dao;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.generic.NEW;

import kus.hash.SHAHashing;
import kus.hibernate.classes.Courses;
import kus.hibernate.classes.Parents;
import kus.hibernate.classes.Students;
import kus.hibernate.classes.Teachers;
import kus.hibernate.classes.Userroles;
import kus.hibernate.classes.Users;
import kus.hibernate.util.HibernateUtil;

public class Testu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*UserDAO uDao = new UserDAOImpl();
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
		sF.close();*/
		/*RegisterUserDAO rDao = new RegisterUserDAOImpl();
		String pass = SHAHashing.hashing("mamamama");
		Users u = new Users("Lewki", pass, (byte)1);
		Userroles uroles = new Userroles(u, "ROLE_STUDENT");
		Students s = new Students();
		s.setAdress("S³omianki 37/4");
		Date date = new GregorianCalendar().getTime();
		s.setDateOfCome(date);
		s.setEmail("mail@op.pl");
		s.setPhone("787863290");
		s.setName("Adam");
		s.setSurname("¯urek");
		rDao.addUser(u, uroles, s);
		*/
		/*
		RegisterUserDAO rDAO = new RegisterUserDAOImpl();
		Users users = new Users("RodzicA",SHAHashing.hashing("olo"),(byte)1);
		Userroles  uroles = new Userroles(users, "ROLE_PARENT");
		Parents t = new Parents();
		t.setAdress("Komorua 21");
		t.setEmail("rodzicA@mail.com.pl");
		t.setName("Miku");
		t.setSurname("Tarasiwicz");
		t.setPhone("77215215");
		t.setDateOfCome(new GregorianCalendar().getTime());
		t.setUsers(users);
		
		rDAO.addUser(users, uroles, t);
		
		Users users1 = new Users("RodzicB", SHAHashing.hashing("olo"),(byte)1);
		Userroles  uroles2 = new Userroles(users, "ROLE_PARENT");
		Parents t2 = new Parents();
		t2.setAdress("Komorua 21");
		t2.setEmail("rodzicA@mail.com.pl");
		t2.setName("Miku");
		t2.setSurname("Tarasiwicz");
		t2.setPhone("77215215");
		t2.setDateOfCome(new GregorianCalendar().getTime());
		t2.setUsers(users);
		
		rDAO.addUser(users1, uroles2, t2);
		
		Users users3 = new Users("Uczen", SHAHashing.hashing("olo"), (byte)1);
		Userroles uroles3 = new Userroles(users3, "ROLE_STUDENT");
		Students st = new Students();
		st.setAdress("Komorua 21");
		st.setName("Janek");
		st.setSurname("Kowalski");
		st.setPhone("1423543643");
		st.setDateOfCome(new GregorianCalendar().getTime());
		
		Set parentSet = new HashSet<>(); 
		parentSet.add(t);
		parentSet.add(t2);
		rDAO.addUser(users3, uroles3, st, parentSet);
	*/
	//	ApplicationContext appContext = 
	//	    	  new ClassPathXmlApplicationContext("WEB-INF/app-dziennik-servlet.xml");
		
		SessionFactory sF = HibernateUtil.getSessionFactory();
		Session s = sF.openSession();
		Transaction tr = s.beginTransaction();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "01-08-2014";
		String dateEndString = "29-06-2015";
		
		Courses c = new Courses("Historia1", new GregorianCalendar(2014,8,1).getTime(), new GregorianCalendar(2015,6,29).getTime(), true);
		CoursesDAO cDAO = new CoursesDAOImpl();
		//cDAO.createCourses(c);
		
		UserDAO uDAO = new UserDAOImpl();
		Users users = new Users();
		
		users.setEnabled((byte)1);
		users.setLogin("Rara");
		users.setPassword(SHAHashing.hashing("olo"));
		uDAO.addUser(users);
	}

}
