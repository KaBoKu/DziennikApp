package kus.db.dao;

import kus.hibernate.classes.Schedule;

public interface ScheduleDAO {
	void createSchedule(Schedule s);
	void updateSchedule(Schedule s);
}
