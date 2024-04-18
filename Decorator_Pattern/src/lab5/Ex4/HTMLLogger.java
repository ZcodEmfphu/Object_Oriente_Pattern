package lab5.Ex4;

public class HTMLLogger extends LoggerDecorator {
	public HTMLLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void log(String msg) {
		msg = makeHTML(msg);
		logger.log(msg);
	}

	private String makeHTML(String msg) {
		return "<HTML><BODY><b>" + msg + "</b></BODY></HTML>";
	}
}
