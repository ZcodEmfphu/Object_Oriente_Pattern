package lab3_Extra.excecise1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RentItem {

	private Movie movie;
	private Date startDate;

	public RentItem(Movie movie, Date startDate) {
		super();
		this.movie = movie;
		this.startDate = startDate;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getRentedDay() {
		Date nowDate = new Date();
		long duration = nowDate.getTime() - startDate.getTime();
		long rentedDays = (duration / (24 * 60 * 60 * 1000));
		if (duration % (24 * 3600000) > 2 * 3600000) {
			rentedDays++;
		}
		return (int) rentedDays;
	}

	public double getCharge() {
		return movie.getCharge(getRentedDay());
	}

	public int getFrequentRenterPoint() {
		return movie.getFrequentRenterPoint(getRentedDay());
	}

	@Override
	public String toString() {
		return "RentItem [movie=" + movie + ", startDate=" + startDate + "]";
	}

	public static void main(String[] args) {
		RentItem rentItem = new RentItem(new Movie("One Piece", "Japanese", new NewReleasePrice()),
				new GregorianCalendar(2024, Calendar.APRIL, 1).getTime());
		System.out.println(rentItem.getRentedDay());

	}

}
