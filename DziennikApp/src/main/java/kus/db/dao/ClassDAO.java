package kus.db.dao;

import java.util.Date;
import java.util.Set;

import kus.hibernate.classes.Classes;
import kus.hibernate.classes.Teachers;

public interface ClassDAO {
	void createClass(Classes c);
	void updateClass(Classes c);
}
