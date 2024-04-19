package lab5.ex4;

public class UpperLogger extends LoggerDecorator {
	public UpperLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void log(String msg) {
		logger.log(msg.toUpperCase());
	}
}
