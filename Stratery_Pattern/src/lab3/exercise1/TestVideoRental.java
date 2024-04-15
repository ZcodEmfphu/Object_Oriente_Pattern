package lab3.exercise1;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

class TestVideoRental {

	@Test
	void testVideoRental() {

		Movie m1 = new Movie("Inception", "Warner Bros. Pictures", PriceStratery.REGULAR);
		Movie m2 = new Movie("The Shawshank Redemption", "Castle Rock Entertainment", PriceStratery.CHILDRENS);
		Movie m3 = new Movie("Interstellar", "Legendary Entertainment", PriceStratery.NEW_RELEASE);
		Movie m4 = new Movie("The Dark Knight", "Warner Bros. Pictures", PriceStratery.NEW_RELEASE);
		Movie m5 = new Movie("The Ligth", "Warner Bros. Pictures", PriceStratery.SERIAL);

		Movie[] movieList = { m1, m2, m3, m4, m5 };

		Customer marry = new Customer("Marry");
		Customer jone = new Customer("Jone");

		marry.rentMovie(m1, new GregorianCalendar(2024, Calendar.MARCH, 26).getTime());
		marry.rentMovie(m2, new GregorianCalendar(2024, Calendar.MARCH, 26).getTime());
		marry.rentMovie(m3, new GregorianCalendar(2024, Calendar.MARCH, 28).getTime());
		marry.returnMovie(m2);

		jone.rentMovie(m2, new GregorianCalendar(2024, Calendar.MARCH, 25).getTime());
		jone.rentMovie(m4, new GregorianCalendar(2024, Calendar.MARCH, 25).getTime());
		jone.rentMovie(m5, new GregorianCalendar(2024, Calendar.MARCH, 25).getTime());

//		System.out.println(Arrays.toString(movieList));
		System.out.println(marry.statement());
		System.out.println("------------------------------------");
		System.out.println(jone.statement());
		System.out.println("------------------------------------");

	}

}
