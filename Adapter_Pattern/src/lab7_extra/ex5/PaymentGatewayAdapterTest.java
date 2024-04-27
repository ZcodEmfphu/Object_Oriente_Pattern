package lab7_extra.ex5;

public class PaymentGatewayAdapterTest {
	public static void main(String[] args) {

		PaymentGateWay paymentGateway = new PaymentGateWayAdapter(new NewPaymentGateWay());

		paymentGateway.makePayment("MS01", 100.0);
		paymentGateway.refundPayment("MS02", 50.0);
		paymentGateway.voidPayment("MS03");
		
		TransactionDetails transactionDetails = paymentGateway.getTransactionDetails("MS04");
		System.out.println("Transaction details: " + transactionDetails);
	}
}
