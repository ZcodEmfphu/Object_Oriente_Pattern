package lab5.ex4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoggerFactory {
	Properties p = new Properties();

	public boolean isFileLoggingEnabled() {

		InputStream inputStream = null;
		try {

			inputStream = LoggerFactory.class.getResourceAsStream("Logger.properties");
			if (inputStream != null) {
				p.load(inputStream);
				String fileLoggingValue = p.getProperty("FileLogging");
				return fileLoggingValue != null && fileLoggingValue.equalsIgnoreCase("ON");
			} else {
				System.err.println("Logger.properties not found!");
				return false;
			}
		} catch (IOException e) {
			System.err.println("Error loading Logger.properties: " + e.getMessage());
			return false;
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					System.err.println("Error closing InputStream: " + e.getMessage());
				}
			}
		}
	}

	public Logger getLogger() {
		if (isFileLoggingEnabled()) {
			return new FileLogger(p.getProperty("LogFile"));
		} else {
			return new ConsoleLogger();
		}
	}
}