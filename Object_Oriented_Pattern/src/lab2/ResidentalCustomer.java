package lab2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class ResidentalCustomer extends Customer {

	public ResidentalCustomer(String id, String name, String address) {
		super(id, name, address);
		// TODO Auto-generated constructor stub
	}

	private List<OneReading> readings = new ArrayList<OneReading>();

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
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {

	}

}
