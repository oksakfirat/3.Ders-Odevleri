package odev3.entities;

public class Category extends Entiti {

	private String categoryName;

	public Category() {
		
	}

	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;

	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
