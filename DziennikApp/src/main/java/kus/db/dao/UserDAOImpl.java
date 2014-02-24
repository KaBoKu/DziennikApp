package kus.db.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kus.hibernate.classes.Users;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired(required=true)
	public SessionFactory sessionFactory;
	
	@Override
	public void addUser(Users u) {
		// TODO Auto-generated method stub
		this.sessionFactory
		.getCurrentSession()
		.save(u);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createQuery("from users").list();
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		Users user = (Users) this.sessionFactory.getCurrentSession().load(Users.class, id);
		if(user!=null){
			this.sessionFactory.getCurrentSession().delete(user);
		}
	}

	@Override
	public void updatePassword(String hashPassword) {
		// TODO Auto-generated method stub
		
	}

}
