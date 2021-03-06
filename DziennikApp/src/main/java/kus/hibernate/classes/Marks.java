package kus.hibernate.classes;


// default package
// Generated 2013-11-16 20:27:54 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Marks generated by hbm2java
 */
public class Marks implements java.io.Serializable {

	private Integer idMark;
	private Teachers teachers;
	private Students students;
	private Courses courses;
	private String mark;
	private String about;
	private Date date;

	public Marks() {
	}

	public Marks(Teachers teachers, Students students, Courses courses,
			String mark, Date date) {
		this.teachers = teachers;
		this.students = students;
		this.courses = courses;
		this.mark = mark;
		this.date = date;
	}

	public Marks(Teachers teachers, Students students, Courses courses,
			String mark, String about, Date date) {
		this.teachers = teachers;
		this.students = students;
		this.courses = courses;
		this.mark = mark;
		this.about = about;
		this.date = date;
	}

	public Integer getIdMark() {
		return this.idMark;
	}

	public void setIdMark(Integer idMark) {
		this.idMark = idMark;
	}

	public Teachers getTeachers() {
		return this.teachers;
	}

	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}

	public Students getStudents() {
		return this.students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public Courses getCourses() {
		return this.courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getAbout() {
		return this.about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
