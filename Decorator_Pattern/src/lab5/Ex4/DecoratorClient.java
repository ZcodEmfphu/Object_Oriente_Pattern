package lab5.Ex4;

public class DecoratorClient {
	public static void main(String[] args) {
		LoggerFactory factory = new LoggerFactory();
		Logger logger = factory.getLogger();

		HTMLLogger hLogger = new HTMLLogger(logger);
		UpperLogger uLogger = new UpperLogger(logger);
		EncryptLogger eLogger = new EncryptLogger(logger);
		TimeStampingLogger tLogger = new TimeStampingLogger(logger);

		hLogger.log("Cô Nga Dạy Lập Trình");
		uLogger.log("Cô Nga Dạy Lập Trình");
		eLogger.log("Cô Nga Dạy Lập Trình");
		tLogger.log("Cô Nga Dạy Lập Trình");

	}
}
