package lab5.ex4;

public class EncryptLogger extends LoggerDecorator {

	public EncryptLogger(Logger logger) {
		super(logger);
		// TODO Auto-generated constructor stub
	}

	public void log(String msg) {
		// Added functionality
		msg = encrypt(msg);
		// Now forward the encrypted text to the FileLogger for storage
		logger.log(msg);
	}

	public String encrypt(String msg) {
		msg = msg.substring(msg.length() - 1) + msg.substring(0, msg.length() - 1);
		return msg;
	}
}
