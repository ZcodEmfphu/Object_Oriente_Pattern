package lab2;

import java.util.List;

public class BusinessCustomer extends Customer {
	private String numberAccount;

	public BusinessCustomer(String id, String name, String address) {
		super(id, name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<? extends Reading> getReading() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double charge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String statement() {
		// TODO Auto-generated method stub
		return null;
	}

}
