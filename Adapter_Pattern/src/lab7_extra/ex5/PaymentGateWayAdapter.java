package lab7_extra.ex5;

public class PaymentGateWayAdapter implements PaymentGateWay {
	private NewPaymentGateWay newPaymentGateWay;

	public PaymentGateWayAdapter(NewPaymentGateWay newPaymentGateWay) {
		super();
		this.newPaymentGateWay = newPaymentGateWay;
	}

	@Override
	public void makePayment(String creditCardNumber, double amount) {
		// TODO Auto-generated method stub
		newPaymentGateWay.processPayment(creditCardNumber, amount);

	}

	@Override
	public void refundPayment(String transactionId, double amount) {
		// TODO Auto-generated method stub
		newPaymentGateWay.refundTransaction(transactionId, amount);
	}

	@Override
	public void voidPayment(String transactionId) {
		// TODO Auto-generated method stub
		newPaymentGateWay.voidTransaction(transactionId);
	}

	@Override
	public TransactionDetails getTransactionDetails(String transactionId) {
		NewTransaction newTransaction = newPaymentGateWay.getTransactionDetails(transactionId);
		
		TransactionDetails transactionDetails = new TransactionDetails();
		transactionDetails.setTransactionId(newTransaction.getTransactionId());
		transactionDetails.setAmount(newTransaction.getAmount());
		return transactionDetails;
	}

}
