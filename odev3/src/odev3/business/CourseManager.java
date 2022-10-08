package odev3.business;

import java.util.List;

import odev3.core.ILogger;
import odev3.dataAccess.IDataBaseDao;
import odev3.entities.Course;

public class CourseManager {
	private List<Course> courses;
	private ILogger[] loggers;
	private IDataBaseDao dataBaseDao;

	public CourseManager(IDataBaseDao dataBaseDao, ILogger[] loggers,List<Course> courses) {
		this.dataBaseDao = dataBaseDao;
		this.loggers = loggers;
		this.courses=courses;
	}

	public void add(Course course) {
		courses.add(new Course(1,"C#",20,"Programlama"));
		
		for (Course cour : courses) {
			if(course.getCoursePrice()>0) {
				if (course.getCourseName().equals(cour.getCourseName())) {
					System.out.println("Kurs Eklenemedi: "+course.getCourseName());
				}else {
					dataBaseDao.addToCourse(course);
				}
			}else {
				System.out.println("kurs fiyatý 0 dan küçük olamaz");
			}
			
		}
		for (ILogger logger : loggers) {
			logger.log("Log");
		}

	}

}
