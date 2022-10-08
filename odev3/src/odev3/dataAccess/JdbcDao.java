package odev3.dataAccess;

import odev3.entities.Category;
import odev3.entities.Course;
import odev3.entities.Instructor;

public class JdbcDao implements IDataBaseDao{

	@Override
	public void addToCourse(Course course) {
		System.out.println("JDBC ile Kurs Eklendi: "+course.getCourseName());
		
	}

	@Override
	public void addToCategory(Category category) {
		System.out.println("JDBC ile kategori Eklendi: "+category.getCategoryName());
		
	}

	@Override
	public void addToInstructor(Instructor instructor) {
		System.out.println("JDBC ile Eðitmen Eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

}
