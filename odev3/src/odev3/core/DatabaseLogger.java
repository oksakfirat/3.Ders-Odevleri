package odev3.core;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String message) {
		System.out.println("Veritaban�na logland�: " +message);
		
	}

}
