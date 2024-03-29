package lab1.ex1;

public class Date {
	private int date;
	private int month;
	private int year;

	public Date(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static Date getDateBorrow(int day, int month, int year) {
		return new Date(day, month, year);
	}

	@Override
	public String toString() {
		return date + "/" + month + "/" + year;
	}

}
