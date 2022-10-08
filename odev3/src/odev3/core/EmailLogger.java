package odev3.core;

public class EmailLogger implements ILogger {


	@Override
	public void log(String message) {
		System.out.println("Emaile loglandý: " +message);
		
	}

}
