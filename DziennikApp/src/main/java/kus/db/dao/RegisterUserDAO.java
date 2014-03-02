package kus.db.dao;

import java.util.Set;

import kus.hibernate.classes.Parents;
import kus.hibernate.classes.Students;
import kus.hibernate.classes.Teachers;
import kus.hibernate.classes.Userroles;
import kus.hibernate.classes.Users;

public interface RegisterUserDAO {
	void addUser(Users u, Userroles uroles,Students s, Set<Parents> p);
	void addUser(Users u, Userroles uroles,Students s);
	void addUser(Users u,Userroles uroles,Teachers t);
	void addUser(Users u,Userroles uroles,Parents p);
	void setParent(Students s,Parents p);
}
