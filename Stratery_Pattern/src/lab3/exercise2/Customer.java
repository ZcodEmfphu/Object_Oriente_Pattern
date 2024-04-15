package lab3.exercise2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

	private String id;
	private String name;
	private String address;

	private List<RentItem> listRent = new ArrayList<RentItem>();

	public Customer(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public List<RentItem> getListMovie() {
		return listRent;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setListMovie(List<RentItem> listMovie) {
		this.listRent = listMovie;
	}

	public boolean rentMovie(Movie movie, Date startDate) {
		RentItem rental = new RentItem(movie, startDate);

		if (listRent.size() < 5) {
			listRent.add(rental);
			rental.getMovie().setAvailable(false);
			return true;
		}
		return true;
	}

	public boolean returnMovie(Movie movie) {
		for (RentItem item : listRent) {
			if (item.getMovie().getTitle().equals(movie.getTitle())) {
				listRent.remove(item);
				item.getMovie().setAvailable(true);
				return true;

			}
		}
		return false;
	}

	public double totalCharge() {
		double res = 0.0;
		for (RentItem item : listRent) {
			res += item.getCharge();
		}
		return res;
	}

	public int totalPoint() {
		int res = 0;
		for (RentItem item : listRent) {
			res += item.getFrequentRenterPoint();
		}
		return res;
	}

	public String statement() {
		StringBuffer res = new StringBuffer();
		res.append("BILL OF " + getName() + "\n");
		for (RentItem item : listRent) {
			res.append("\tMovie Name: " + item.getMovie().getTitle() + ",\tPrice: " + item.getCharge() + "\n");
		}
		res.append("Charge Total: " + totalCharge());
		res.append("\nPoint: " + totalPoint());
		return res.toString();
	}

	public String viewRentHistory() {
		StringBuffer res = new StringBuffer();
		res.append("HISTORY RENT OF " + getName() + "\n");
		for (RentItem item : listRent) {
			res.append("\tMovie Name: " + item.getMovie().getTitle() + ",\tPrice: " + item.getCharge()
					+ ",\tStart Rent: " + item.getStartDate() + "\n");
		}
		res.append("\nPoint: " + totalPoint());
		return res.toString();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", listRent=" + listRent + "]";
	}

}
