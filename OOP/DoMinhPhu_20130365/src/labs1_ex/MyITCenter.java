package labs1_ex;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyITCenter {

	private List<Book> bookList = new ArrayList<Book>();
	private List<MemberLibrary> memberList = new ArrayList<MemberLibrary>();
	private LocalDateTime now = LocalDateTime.now();

	public MyITCenter() {
		init();
	}

	public void init() {

		Author a1 = new Author("Joanne Rowling", "England", 1965);
		Author a2 = new Author("George Orwell", "England", 1903);
		Author a3 = new Author("Agatha Christie", "England", 1890);
		Author a4 = new Author("Tolkien", "England", 1892);
		Author a5 = new Author("Harper Lee", "England", 1926);
//		Harry Potter and the Philosopher's Stone
		Book b1 = new Book("1", "978-0-7475-3269-0", 1997, a1, null);
		Book b2 = new Book("Nineteen Eighty-Four", "978-0-452-28423-4", 1949, a2, null);
		Book b3 = new Book("Murder on the Orient Express", "978-0-00-711931-8", 1934, a3, null);
		Book b4 = new Book("The Lord of the Rings", "978-0-544-27250-9", 1955, a4, null);
		Book b5 = new Book("To Kill a Mockingbird", "978-0-06-112008-4", 1960, a5, null);

		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);

		MemberLibrary ml1 = new MemberLibrary("1", "20130365", "DH20DTC");
		MemberLibrary ml2 = new MemberLibrary("Lê Khánh Văn", "20130462", "DH20DTA");

		memberList.add(ml1);
		memberList.add(ml2);

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
		System.out.println("Welcome to Library");
		System.out.println("What do you want to Borrow Book or Return Book ?");
		System.out.println(
				"1. To Borrow Book => Please Enter 1\n2. To Return Book => Please Enter 2\nEnter your chossen: ");
		int option = scanner.nextInt();
		Scanner scanner2 = new Scanner(System.in);

		switch (option) {
		case 1: {
			System.out.println("================Borrow Book=======================\nEnter your name or ID Member:");
			String nameOrID = scanner2.nextLine();
			MemberLibrary m = checkMember(nameOrID);

			if (m != null) {
				System.out.println("Hello " + m.getName());
				System.out.println("Enter your title or ISBN: ");
				String titleOrISBN = scanner2.nextLine();

				Book b = checkBook(titleOrISBN);
				if (b != null) {
					if (b.getStatus().equals("Availuable")) {
						System.out.println("You can borrow 30day ");
						m.register(b);
						m.updateStatusBook(b);
					} else {
						System.out.println("Sách Đã mượn");
					}
				} else {
					System.out.println("your title or ISBN not exits");
				}
			} else {
				System.out.println("your name or ID Member not exits!");
			}

			break;
		}
		case 2: {
			System.out.println(2);
			break;
		}
		case 5: {
			System.out.println("Exiting....");
			System.exit(0);
			break;
		}
		default:
			System.out.println("Failed");
		}

	}

	public static void main(String[] args) {
		MyITCenter myITCenter = new MyITCenter();
		myITCenter.systemLibrary();

	}
}
