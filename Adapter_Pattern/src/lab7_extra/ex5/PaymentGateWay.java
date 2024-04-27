package lab7_extra.ex5;

public interface PaymentGateWay {
	
	void makePayment(String creditCardNumber, double amount);

	void refundPayment(String transactionId, double amount);

	void voidPayment(String transactionId);

	TransactionDetails getTransactionDetails(String transactionId);
}
