package lab3.exercise1;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

	private String name;
	private List<RentItem> listRent = new ArrayList<RentItem>();

	public Customer(String name) {
		super();
		this.name = name;
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
				item.getMovie().setAvailable(false);
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

	@Override
	public String toString() {
		return "Customer [name=" + name + ", listMovie=" + listRent + "]";
	}

}
