package odev3.business;

import java.util.List;

import odev3.core.ILogger;
import odev3.dataAccess.IDataBaseDao;
import odev3.entities.Category;

public class CategoryManager {
	private ILogger[] loggers;
	private List<Category> categories;
	private IDataBaseDao dataBaseDao;

	public CategoryManager(IDataBaseDao dataBaseDao, List<Category> categories,ILogger[] loggers) {
		this.dataBaseDao = dataBaseDao;
		this.categories = categories;
		this.loggers=loggers;

	}

	public void add(Category category) {
		for (Category cate : categories) {
			if(cate.getCategoryName().equals(category.getCategoryName())){
				System.out.println("Kategori mevcut: "+category.getCategoryName());
			}else {
				dataBaseDao.addToCategory(category);
				for (ILogger logger : loggers) {
					logger.log("Category");
				}
			}
		}
		
	}
	

}
