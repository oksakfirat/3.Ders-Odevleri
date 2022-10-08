package odev3.dataAccess;

import odev3.entities.Category;
import odev3.entities.Course;
import odev3.entities.Instructor;

public interface IDataBaseDao {

	void addToCourse(Course course);
	void addToCategory(Category category);
	void addToInstructor(Instructor instructor);
}
