package lab2;

import java.util.ArrayList;
import java.util.List;

public class BusinessCustomer extends Customer {
	private String numberAccount;
	private List<ThreeReading> readings = new ArrayList<ThreeReading>();

	public BusinessCustomer(String id, String name, String address, String numberAccount) {
		super(id, name, address);
		this.numberAccount = numberAccount;
	}

	@Override
	public List<ThreeReading> getReading() {
		return readings;
	}

	public void addReading(ThreeReading reading) {
		getReading().add(reading);
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}

	@Override
	public double charge() {

		ThreeReading oldReading = (ThreeReading) getOldReading();
		ThreeReading newReading = (ThreeReading) getNewReading();

		double resutl = getNomalUsage(oldReading, newReading) * 895 + getHightUsage(oldReading, newReading) * 1480
				+ getLowUsage(oldReading, newReading) * 550;
		return resutl;
	}

	public int getNomalUsage(ThreeReading oldReading, ThreeReading newReading) {
		return newReading.getIndex() - oldReading.getIndex();

	}

	public int getHightUsage(ThreeReading oldReading, ThreeReading newReading) {
		return newReading.getHighIndex() - oldReading.getHighIndex();
	}

	public int getLowUsage(ThreeReading oldReading, ThreeReading newReading) {
		return newReading.getLowIndex() - oldReading.getLowIndex();
	}

	@Override
	public String statement() {
		ThreeReading oldReading = (ThreeReading) getOldReading();
		ThreeReading newReading = (ThreeReading) getNewReading();
		int usage = newReading.getIndex() - oldReading.getIndex();

		return "Company ID: " + getId() + "\nNameCompany: " + getName() + "\nAccountNumber: " + getNumberAccount()
				+ "\nOldDate: " + oldReading.getDate() + "\nNewDate: " + newReading.getDate() + "\nOldReading: "
				+ oldReading.getIndex() + " kwh\nnewReading: " + newReading.getIndex() + " kwh\nUsage: " + usage
				+ "kwh\nNomal Time: " + getNomalUsage(oldReading, newReading) + "kwh\nHigh Time: "
				+ getHightUsage(oldReading, newReading) + "kwh\nLow Time: " + getLowUsage(oldReading, newReading)
				+ " kwh\nTotal: " + charge()
				+ " VND\n------------------------------------------------------------------------------------\n";
	}
	
	

	@Override
	public String toString() {
		return "\nBusinessCustomer [numberAccount=" + numberAccount + ", \nreadings=" + readings + "]";
	}

}
