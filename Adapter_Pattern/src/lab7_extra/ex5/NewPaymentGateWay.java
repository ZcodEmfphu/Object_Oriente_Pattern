package lab7_extra.ex5;

public class NewPaymentGateWay {

	public void processPayment(String creditCardNumber, double amount) {
		System.out.println("Processing payment with credit card number: " + creditCardNumber + ", amount: " + amount);
	}

	public void refundTransaction(String transactionId, double amount) {
		System.out.println("Refunding transaction with ID: " + transactionId + ", amount: " + amount);
	}

	public void voidTransaction(String transactionId) {
		System.out.println("Voiding transaction with ID: " + transactionId);
	}

	public NewTransaction getTransactionDetails(String transactionId) {
		NewTransaction transaction = new NewTransaction();
		transaction.setTransactionId(transactionId);
		transaction.setAmount(100.0);
		return transaction;
	}
}
