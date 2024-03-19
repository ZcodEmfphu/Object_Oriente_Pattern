package lab2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EVNComDivision {
	private String name;
	private Map<String, Customer> customerList = new HashMap<String, Customer>();

	public EVNComDivision(String name) {
		this.name = name;
	}

	public void register(Customer customer) {
		customerList.put(customer.getId(), customer);
	}

	public Customer getCustomer(String id) {
		return customerList.get(id);
	}

	public String invoice(String id) {
		StringBuffer res = new StringBuffer("Company " + name + "\n");
		res.append("ELECTRIC BILL OF CUSTOMER\n\n");
		res.append(getCustomer(id).statement());
		return res.toString();
	}

	public String allInvoice() {
		StringBuffer res = new StringBuffer("Company " + name + "\n");
		res.append("REPORT ELECTRIC BILL OF ALL CUSTOMER\n\n");
		for (Customer c : customerList.values()) {
			res.append(c.statement());
		}

		return res.toString();
	}

	public static void main(String[] args) {
		EVNComDivision evn = new EVNComDivision(null);
//		evn.manageElectric();
	}

}
