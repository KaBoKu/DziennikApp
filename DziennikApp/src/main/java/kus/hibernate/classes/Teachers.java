package kus.hibernate.classes;


// default package
// Generated 2013-11-16 20:27:54 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Teachers generated by hbm2java
 */
public class Teachers implements java.io.Serializable {

	private Integer idTeacher;
	private Users users;
	private Classes classes;
	private String name;
	private String surname;
	private String phone;
	private String email;
	private String adress;
	private Date dateOfCome;
	private Set<Classes> classeses = new HashSet<Classes>(0);
	private Set<CoursesHasTeachers> coursesHasTeacherses = new HashSet<CoursesHasTeachers>(
			0);
	private Set<Listofpresent> listofpresents = new HashSet<Listofpresent>(0);
	private Set<Schedule> schedules = new HashSet<Schedule>(0);
	private Set<Marks> markses = new HashSet<Marks>(0);

	public Teachers() {
	}

	public Teachers(Users users, String name, String surname, String adress,
			Date dateOfCome) {
		this.users = users;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.dateOfCome = dateOfCome;
	}

	public Teachers(Users users, Classes classes, String name, String surname,
			String phone, String email, String adress, Date dateOfCome,
			Set<Classes> classeses,
			Set<CoursesHasTeachers> coursesHasTeacherses,
			Set<Listofpresent> listofpresents, Set<Schedule> schedules,
			Set<Marks> markses) {
		this.users = users;
		this.classes = classes;
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
		this.adress = adress;
		this.dateOfCome = dateOfCome;
		this.classeses = classeses;
		this.coursesHasTeacherses = coursesHasTeacherses;
		this.listofpresents = listofpresents;
		this.schedules = schedules;
		this.markses = markses;
	}

	public Integer getIdTeacher() {
		return this.idTeacher;
	}

	public void setIdTeacher(Integer idTeacher) {
		this.idTeacher = idTeacher;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Date getDateOfCome() {
		return this.dateOfCome;
	}

	public void setDateOfCome(Date dateOfCome) {
		this.dateOfCome = dateOfCome;
	}

	public Set<Classes> getClasseses() {
		return this.classeses;
	}

	public void setClasseses(Set<Classes> classeses) {
		this.classeses = classeses;
	}

	public Set<CoursesHasTeachers> getCoursesHasTeacherses() {
		return this.coursesHasTeacherses;
	}

	public void setCoursesHasTeacherses(
			Set<CoursesHasTeachers> coursesHasTeacherses) {
		this.coursesHasTeacherses = coursesHasTeacherses;
	}

	public Set<Listofpresent> getListofpresents() {
		return this.listofpresents;
	}

	public void setListofpresents(Set<Listofpresent> listofpresents) {
		this.listofpresents = listofpresents;
	}

	public Set<Schedule> getSchedules() {
		return this.schedules;
	}

	public void setSchedules(Set<Schedule> schedules) {
		this.schedules = schedules;
	}

	public Set<Marks> getMarkses() {
		return this.markses;
	}

	public void setMarkses(Set<Marks> markses) {
		this.markses = markses;
	}

}
