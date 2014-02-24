package kus.db.dao;

import kus.hibernate.classes.Users;
import java.util.List;

public interface UserDAO {
	public void addUser(Users u);
	public List<Users> getAllUsers();
	public void deleteUser(Integer id);
	public void updatePassword(String hashPassword);
}
