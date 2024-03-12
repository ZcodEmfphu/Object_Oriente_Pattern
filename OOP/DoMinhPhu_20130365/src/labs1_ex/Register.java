package labs1_ex;

import java.util.Date;

public class Register {

	private Book book;
	private Date borrowDay;
	private Date returnDay;

	public Register(Book book) {
		super();
		this.book = book;
		this.borrowDay = new Date();
		this.returnDay = new Date(this.borrowDay.getTime() * 24 * 60 * 60 * 1000);
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getBorrowDay() {
		return borrowDay;
	}

	public void setBorrowDay(Date borrowDay) {
		this.borrowDay = borrowDay;
	}

	public Date getReturnDay() {
		return returnDay;
	}

	public void setReturnDay(Date returnDay) {
		this.returnDay = returnDay;
	}

	@Override
	public String toString() {
		return "Register [book=" + book + ", borrowDay=" + borrowDay + ", returnDay=" + returnDay + "]";
	}

}
