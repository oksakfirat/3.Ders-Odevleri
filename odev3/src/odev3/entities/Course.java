package odev3.entities;

public class Course extends Entiti {

	
	private String courseName;
	private int coursePrice;
	private String category;
	
	public Course() {
		
	}
	public Course(int id, String courseName, int coursePrice, String category) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.category = category;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
