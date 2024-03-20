package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResidentalCustomer extends Customer {

	private List<OneReading> readings = new ArrayList<OneReading>();
	private List<ResidentalCustomer> customers = new ArrayList<ResidentalCustomer>();

	public ResidentalCustomer(String id, String name, String address) {
		super(id, name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<OneReading> getReading() {
		return readings;
	}

	public void addReading(OneReading reading) {
		getReading().add(reading);
	}

	@Override
	public double charge() {

		int oldIndex = getOldReading().getIndex();
		int newIndex = getNewReading().getIndex();

		int useage = newIndex - oldIndex;

		int u1 = (useage <= 100) ? useage : 100;
		int u2 = (useage <= 150) ? (useage - u1) : 50;
		int u3 = (useage <= 200) ? (useage - u1 - u2) : 50;
		int u4 = (useage <= 300) ? (useage - u1 - u2 - u3) : 100;
		int u5 = (useage - u1 - u2 - u3 - u4);

		double resutl = u1 * 550 + u2 * 900 + u3 * 1210 + u4 * 1340 + u5 * 1400;

		return resutl;
	}

	@Override
	public String statement() {
		Reading oldReading = getOldReading();
		Reading newReading = getNewReading();
		int usage = newReading.getIndex() - oldReading.getIndex();

		return "Customer ID: " + getId() + "\nName: " + getName() + "\nOldReading: " + oldReading.getIndex()
				+ " Kwh\nnewReading: " + newReading.getIndex() + " Kwh\nTotal Usage: " + usage + " kwh\nTotal: "
				+ charge() + " VND\n----------------------------------------------------------\n";
	}

	public double calculateAverageElectricityBill(Date startDate, Date endDate) {
		double totalElectricityBill = 0.0;
		int totalMonths = 0;

		for (OneReading reading : readings) {
			Date readingDate = reading.getDate();
			if (readingDate.compareTo(startDate) >= 0 && readingDate.compareTo(endDate) <= 0) {
				totalElectricityBill += charge();
				totalMonths++;
			}
		}
		if (totalMonths == 0) {
			return 0.0;
		}
		return totalElectricityBill / totalMonths;
	}

	public List<OneReading> getSelectedReadings(Date startDate, Date endDate) {
		List<OneReading> selectedReadings = new ArrayList<>();

		for (OneReading reading : readings) {
			Date readingDate = reading.getDate();
			if (readingDate.compareTo(startDate) >= 0 && readingDate.compareTo(endDate) <= 0) {
				selectedReadings.add(reading);
			}
		}

		return selectedReadings;
	}

	public String statementDate(Date startDate, Date endDate) {
		Reading oldReading = getOldReading();
		Reading newReading = getNewReading();
		int usage = newReading.getIndex() - oldReading.getIndex();

		return "CUSTOMER ID: " + getId() + "CUSTOMER NAME: " + getName() + "\nFromDate: " + startDate + "\nEndDate: "
				+ endDate + "Reading is: " + this.getSelectedReadings(startDate, endDate);
	}

	@Override
	public String toString() {
		return "\nResidentalCustomer: [readings=" + readings + ", customers: " + super.getName()
				+ "\n----------------------------------------------------------------------------------";
	}

	public static void main(String[] args) {
		ResidentalCustomer rc1 = new ResidentalCustomer("202001", "Trần Văn Quýt", null);
		System.out.println(rc1);
	}

}
