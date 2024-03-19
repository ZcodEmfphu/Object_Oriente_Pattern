package lab2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public List<Customer> getReadingsByName(String name) {
		List<Customer> listName = new ArrayList<Customer>();
		for (Customer c : customerList.values()) {
			if (c.getName().equals(name)) {
				listName.add(c);
			}
		}
		return listName;
	}

	public double calculateAverageElectricityBill(Date startDate, Date endDate) {
//		List<Customer> listCustomers = new ArrayList<>();
		double totalElectricityBill = 0.0;
		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(startDate);
		int startYear = startCalendar.get(Calendar.YEAR);
		int startMonth = startCalendar.get(Calendar.MONTH);

		Calendar endCalendar = Calendar.getInstance();
		endCalendar.setTime(endDate);
		int endYear = endCalendar.get(Calendar.YEAR);
		int endMonth = endCalendar.get(Calendar.MONTH);

		int totalMonths = (endYear - startYear) * 12 + (endMonth - startMonth) + 1;

		for (Customer c : customerList.values()) {
//			boolean hasReadingInDateRange = false;
			for (Reading r : c.getReading()) {
				Date readingDate = r.getDate();
				if (readingDate.compareTo(startDate) >= 0 && readingDate.compareTo(endDate) <= 0) {
//					hasReadingInDateRange = true;
					totalElectricityBill += c.charge();

					break;
				}
			}
//			if (hasReadingInDateRange) {
//				listCustomers.add(c);
//			}
		}
		if (totalMonths == 0) {
			return 0.0;
		}
		return totalElectricityBill / totalMonths;
	}

	@Override
	public String toString() {
		return "EVNComDivision [name=" + name + ", customerList=" + customerList + "]";
	}
}
