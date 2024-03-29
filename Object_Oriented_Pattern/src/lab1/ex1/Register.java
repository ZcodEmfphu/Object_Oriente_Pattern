package lab1.ex1;


public class Register {

	private Book book;
	private Date borrowDay;
	private Date returnDay;

	public Register(Book book, Date borrowDay, Date returnDay) {
		super();
		this.book = book;
		this.borrowDay = borrowDay;
		this.returnDay = returnDay;
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
		return "Register [book=" + book + ", borrowDay=" + borrowDay + ", returnDay=" + returnDay + "]\n";
	}

}
