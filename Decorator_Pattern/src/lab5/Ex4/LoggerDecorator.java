package lab5.Ex4;

public class LoggerDecorator implements Logger {

	public Logger logger;

	public LoggerDecorator(Logger logger) {
		super();
		this.logger = logger;
	}

	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		logger.log(msg);
	}

}
