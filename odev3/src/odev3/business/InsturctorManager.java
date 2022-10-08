package odev3.business;

import odev3.core.ILogger;
import odev3.dataAccess.IDataBaseDao;
import odev3.entities.Instructor;

public class InsturctorManager {

	private ILogger[] loggers;
	private IDataBaseDao dataBaseDao;
	
	public InsturctorManager(IDataBaseDao dataBaseDao,ILogger[] loggers) {
		this.dataBaseDao=dataBaseDao;
		this.loggers=loggers;
	}
	public void add(Instructor instructor) {
		dataBaseDao.addToInstructor(instructor);
		for (ILogger logger : loggers) {
			logger.log("Insturctor");
		}
	}


}
