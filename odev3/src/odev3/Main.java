package odev3;

import java.util.ArrayList;
import java.util.List;

import odev3.business.CategoryManager;
import odev3.business.CourseManager;
import odev3.business.InsturctorManager;
import odev3.core.DatabaseLogger;
import odev3.core.EmailLogger;
import odev3.core.FileLogger;
import odev3.core.ILogger;
import odev3.core.SmsLogger;
import odev3.dataAccess.HibernateDao;
import odev3.dataAccess.JdbcDao;
import odev3.entities.Category;
import odev3.entities.Course;
import odev3.entities.Instructor;

public class Main {

	public static void main(String[] args){
		Course course=new Course();
		course.setId(1);
		course.setCategory("Java");
		course.setCourseName("Java 2022");
		course.setCoursePrice(20);
		
		ILogger[] loggers= {new DatabaseLogger(),new SmsLogger(),new FileLogger(),new EmailLogger()};
		
		Category category=new Category();
		category.setId(1);
		category.setCategoryName("Java");
		
		Category category2=new Category();
		category.setId(2);
		category2.setCategoryName("C#");
		
		List<Category> categories=new ArrayList<Category>();
		categories.add(category);
		
		CategoryManager categoryManager=new CategoryManager(new HibernateDao(), categories,loggers);
		categoryManager.add(category2);
		
		System.out.println("-------------------------------------");
		
		List<Course> courses=new ArrayList<Course>();
		CourseManager courseManager=new CourseManager(new JdbcDao(), loggers,courses);
		courseManager.add(course);
		
		System.out.println("-------------------");
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Fýrat");
		instructor.setLastName("okþak");
		instructor.setEmail("firat@gmail.com");
		
		InsturctorManager insturctorManager= new InsturctorManager(new JdbcDao(),loggers);
		insturctorManager.add(instructor);

	}

}
