package lab1.ex1;
public class Book {
	private String title;
	private String ISBN;
	private int publicationYear;
	private Author authour;
	private String status;

	public Book(String title, String iSBN, int publicationYear, Author authour, String status) {
		super();
		this.title = title;
		this.ISBN = iSBN;
		this.publicationYear = publicationYear;
		this.authour = authour;
		this.status = status;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public Author getAuthour() {
		return authour;
	}

	public void setAuthour(Author authour) {
		this.authour = authour;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Book: [title:" + title + ", ISBN:" + ISBN + ", publicationYear:" + publicationYear + ", authour:"
				+ authour + ", status:" + status + "]\n";
	}

}
