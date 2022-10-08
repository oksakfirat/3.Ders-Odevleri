package odev3.core;

public class FileLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("Dosyaya loglandý: " +message);
		
	}

}
