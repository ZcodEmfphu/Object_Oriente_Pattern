package lab3_Extra.excecise2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestVideoRental2 {

	@Test
	void testVideoRental() {

		Movie m1 = new Movie("Inception", "Warner Bros. Pictures", PriceStratery.REGULAR);
		Movie m2 = new Movie("The Shawshank Redemption", "Castle Rock Entertainment", PriceStratery.CHILDRENS);
		Movie m3 = new Movie("Interstellar", "Legendary Entertainment", PriceStratery.NEW_RELEASE);
		Movie m4 = new Movie("The Dark Knight", "Warner Bros. Pictures", PriceStratery.NEW_RELEASE);
		Movie m5 = new Movie("The Ligth", "Warner Bros. Pictures", PriceStratery.SERIAL);

		Customer marry = new Customer("1", "Marry", "");
		Customer jone = new Customer("2", "Jone", "");

		CustomerManagement customerManage = new CustomerManagement();
		customerManage.addCustomer(marry);

		marry.rentMovie(m1, new GregorianCalendar(2024, Calendar.MARCH, 26).getTime());
		marry.rentMovie(m2, new GregorianCalendar(2024, Calendar.MARCH, 26).getTime());
		marry.rentMovie(m3, new GregorianCalendar(2024, Calendar.MARCH, 28).getTime());
		marry.returnMovie(m2);

		jone.rentMovie(m2, new GregorianCalendar(2024, Calendar.MARCH, 25).getTime());
		jone.rentMovie(m4, new GregorianCalendar(2024, Calendar.MARCH, 25).getTime());
		jone.rentMovie(m5, new GregorianCalendar(2024, Calendar.MARCH, 25).getTime());

		System.out.println(marry.statement());
		System.out.println("------------------------------------");
		System.out.println(jone.statement());
		System.out.println("------------------------------------");

		customerManage.inputCustomerInfo();
		marry.viewRentHistory();
		System.out.println(marry.viewRentHistory());

	}

}
