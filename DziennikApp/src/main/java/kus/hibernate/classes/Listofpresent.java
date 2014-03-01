package kus.hibernate.classes;


// default package
// Generated 2013-11-16 20:27:54 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Listofpresent generated by hbm2java
 */
public class Listofpresent implements java.io.Serializable {

	private Integer idListOfPresent;
	private Teachers teachers;
	private Students students;
	private Date startLesson;
	private Date endLesson;
	private boolean present;
	private Integer idCourse;
	private Date checkTime;

	public Listofpresent() {
	}

	public Listofpresent(Students students, boolean present) {
		this.students = students;
		this.present = present;
	}

	public Listofpresent(Teachers teachers, Students students,
			Date startLesson, Date endLesson, boolean present,
			Integer idCourse, Date checkTime) {
		this.teachers = teachers;
		this.students = students;
		this.startLesson = startLesson;
		this.endLesson = endLesson;
		this.present = present;
		this.idCourse = idCourse;
		this.checkTime = checkTime;
	}

	public Integer getIdListOfPresent() {
		return this.idListOfPresent;
	}

	public void setIdListOfPresent(Integer idListOfPresent) {
		this.idListOfPresent = idListOfPresent;
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

	public Date getStartLesson() {
		return this.startLesson;
	}

	public void setStartLesson(Date startLesson) {
		this.startLesson = startLesson;
	}

	public Date getEndLesson() {
		return this.endLesson;
	}

	public void setEndLesson(Date endLesson) {
		this.endLesson = endLesson;
	}

	public boolean isPresent() {
		return this.present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

	public Integer getIdCourse() {
		return this.idCourse;
	}

	public void setIdCourse(Integer idCourse) {
		this.idCourse = idCourse;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

}