package lab2;

import java.util.ArrayList;
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
				+ charge() + " VND\n\n\n\n";
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
