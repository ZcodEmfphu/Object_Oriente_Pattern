package lab3_Extra.excecise1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

	private String name;
	private List<RentItem> listMovie = new ArrayList<RentItem>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<RentItem> getListMovie() {
		return listMovie;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setListMovie(List<RentItem> listMovie) {
		this.listMovie = listMovie;
	}

	public boolean rent(Movie movie, Date startDate) {
		RentItem rental = new RentItem(movie, startDate);

		if (listMovie.size() < 5) {
			listMovie.add(rental);
			rental.getMovie().setAvailable(false);
			return true;
		}

		return true;
	}

}
