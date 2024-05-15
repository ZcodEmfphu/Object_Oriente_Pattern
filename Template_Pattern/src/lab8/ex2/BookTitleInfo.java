package lab8.ex2;

class BookTitleInfo extends TitleInfo {
	private String author;

	public BookTitleInfo(String titleName, String author) {

		this.setAuthor(author);
		this.setTitleName(titleName);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitleBlurb() {
		return ("Book: " + this.getTitleName() + ", Author: " + this.getAuthor());
	}
}