package lab1_1_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyITCenter {

	private List<Book> bookList = new ArrayList<Book>();
	private List<MemberLibrary> memberList = new ArrayList<MemberLibrary>();

	public MyITCenter() {
		init();
	}

	public void init() {

		Author a1 = new Author("Joanne Rowling", "England", 1965);
		Author a2 = new Author("George Orwell", "England", 1903);
		Author a3 = new Author("Agatha Christie", "England", 1890);
		Author a4 = new Author("Tolkien", "England", 1892);
		Author a5 = new Author("Harper Lee", "England", 1926);

//		Harry Potter and the Philosopher's Stone Nineteen Eighty-Four
		Book b1 = new Book("1", "978-0-7475-3269-0", 1997, a1, "Availuable");
		Book b2 = new Book("2", "978-0-452-28423-4", 1949, a2, "Borrow");
		Book b3 = new Book("Murder on the Orient Express", "978-0-00-711931-8", 1934, a3, "Availuable");
		Book b4 = new Book("The Lord of the Rings", "978-0-544-27250-9", 1955, a4, "Availuable");
		Book b5 = new Book("To Kill a Mockingbird", "978-0-06-112008-4", 1960, a5, "Availuable");

		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);

		MemberLibrary ml1 = new MemberLibrary("1", "20130365", "DH20DTC");
		MemberLibrary ml2 = new MemberLibrary("Lê Khánh Văn", "20130462", "DH20DTA");

		memberList.add(ml1);
		memberList.add(ml2);

		ml1.register(b1, null, null);
		ml1.register(b2, null, null);
		ml1.register(b3, null, null);
		ml1.register(b4, null, null);

	}

	public MemberLibrary checkMember(String nameOrID) {
		for (MemberLibrary m : memberList) {
			if (m.getName().equals(nameOrID) || m.getMemberId().equals(nameOrID)) {
				return m;
			}
		}
		return null;
	}

	public Book checkBook(String titleOrISBN) {
		for (Book b : bookList) {
			if (b.getTitle().equals(titleOrISBN) || b.getISBN().equals(titleOrISBN)) {
				return b;
			}
		}
		return null;
	}

	public void systemLibrary() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Library !");

		String option = scanner.nextLine();

		switch (option) {
		case "1": {
			System.out.println("Borrow book: ");
			System.out.println("Please enter member name or member ID of you: ");
			String nameOrID = scanner.nextLine();
			MemberLibrary m = checkMember(nameOrID);
			if (m != null) {
				System.out.println("Welcome " + m.getName());
				System.out.println("Please enter title book or ISBN of you: ");
				String titleOrISBN = scanner.nextLine();
				Book b = checkBook(titleOrISBN);
				if (b != null) {
					System.out.println("Infor book: ");
					System.out.println(b);
					if (b.getStatus().equalsIgnoreCase("Availuable")) {
						Scanner scanner2 = new Scanner(System.in);
						System.out.println("Please enter day borrow: ");
						int date = scanner2.nextInt();
						System.out.println("Please enter month borrow: ");
						int month = scanner2.nextInt();
						System.out.println("Please enter year borrow: ");
						int year = scanner2.nextInt();
						Date db = new Date(date, month, year);

						System.out.println("Please enter date return: ");
						int date2 = scanner2.nextInt();
						System.out.println("Please enter month return: ");
						int month2 = scanner2.nextInt();
						Date dr = new Date(date2, month2, year);
						m.register(b, db, dr);
						m.updateStatusBook(b);
						System.out.println("You borrowe Success!");
						System.out.println(m.getMemberRegister());
					} else {
						System.out.println("Book is borrowed!");
					}
				} else {
					System.out.println("Title book or ISBN is not found");
				}
			} else {
				System.out.println("Member name or member ID is not found!");
			}
			break;
		}
		case "2": {
			System.out.println("Return book: ");
			System.out.println("Please enter title book or ISBN of you: ");
			String titleOrISBN = scanner.nextLine();
			Book b = checkBook(titleOrISBN);
			if (b != null) {
				if (b.getStatus().equalsIgnoreCase("Borrow")) {
					MemberLibrary m;
					b.setStatus("Availuable");
					System.out.println("You are return success!");
					System.out.println(b);
				} else {
					System.out.println("Book dont have Borrow");
				}

			} else {
				System.out.println("Dont found book!");
			}
			break;

		}

		case "3": {
			System.out.println("Member's Borrow book: ");
			System.out.println("Please enter member name or member ID of you: ");
			String nameOrID = scanner.nextLine();
			MemberLibrary m = checkMember(nameOrID);
			if (m != null) {
				System.out.println(m);
			} else {
				System.out.println("1");
			}
			break;
		}
		case "4": {
			System.out.println("Member's Borrow book: ");
			System.out.println("Please enter member name or member ID of you: ");
			String nameOrID = scanner.nextLine();
			Book b = checkBook(nameOrID);
			if (b != null) {
				System.out.println(b);
			} else {
				System.out.println("1");
			}
			break;
		}
		case "5": {

			break;
		}
		default:
			System.out.println("Khoong co");
		}

	}

	public static void main(String[] args) {
		MyITCenter myITCenter = new MyITCenter();
		myITCenter.systemLibrary();

	}
}
