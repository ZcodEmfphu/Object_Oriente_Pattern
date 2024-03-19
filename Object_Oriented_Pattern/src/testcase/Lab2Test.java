package testcase;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.jupiter.api.Test;

import lab2.BusinessCustomer;
import lab2.Customer;
import lab2.EVNComDivision;
import lab2.OneReading;
import lab2.ResidentalCustomer;
import lab2.ThreeReading;

class Lab2Test {

	@Test
	void test() {
		EVNComDivision evn = new EVNComDivision("Fruit");

		BusinessCustomer bc1 = new BusinessCustomer("201001", "CoCa Cola", "0397524732", "0397524732");
		BusinessCustomer bc2 = new BusinessCustomer("201002", "Pepsi", "0397524733", "0397524732");

		ResidentalCustomer rc1 = new ResidentalCustomer("202001", "Trần Văn Quýt", null);
		ResidentalCustomer rc2 = new ResidentalCustomer("202002", "Trần Văn Thơm", null);
		ResidentalCustomer rc3 = new ResidentalCustomer("202003", "Trần Văn Táo", null);

		ResidentalCustomer rc4 = new ResidentalCustomer("202004", "Nguyễn Thị Dâu", null);
		ResidentalCustomer rc5 = new ResidentalCustomer("202005", "Nguyễn Thị Đào", null);

		OneReading oneReading = new OneReading(new GregorianCalendar(2024, Calendar.JANUARY, 18).getTime(), 1350);

		OneReading oneReading1 = new OneReading(new GregorianCalendar(2024, Calendar.FEBRUARY, 18).getTime(), 1353);
		OneReading oneReading2 = new OneReading(new GregorianCalendar(2024, Calendar.FEBRUARY, 18).getTime(), 1490);
		OneReading oneReading3 = new OneReading(new GregorianCalendar(2024, Calendar.FEBRUARY, 18).getTime(), 1540);
		OneReading oneReading4 = new OneReading(new GregorianCalendar(2024, Calendar.MARCH, 18).getTime(), 1640);
		OneReading oneReading5 = new OneReading(new GregorianCalendar(2024, Calendar.MARCH, 18).getTime(), 1800);

		ThreeReading threeReading = new ThreeReading(new GregorianCalendar(2024, Calendar.JANUARY, 18).getTime(), 1350,
				2102, 2310);
		ThreeReading threeReading1 = new ThreeReading(new GregorianCalendar(2024, Calendar.FEBRUARY, 18).getTime(),
				1500, 2202, 2510);
		ThreeReading threeReading2 = new ThreeReading(new GregorianCalendar(2024, Calendar.FEBRUARY, 18).getTime(),
				1600, 2302, 2410);

		rc1.addReading(oneReading);
		rc1.addReading(oneReading1);
		rc1.addReading(oneReading2);
		rc1.addReading(oneReading3);
		rc1.addReading(oneReading4);

		rc2.addReading(oneReading);
		rc2.addReading(oneReading2);

		rc3.addReading(oneReading);
		rc3.addReading(oneReading3);

		rc4.addReading(oneReading);
		rc4.addReading(oneReading4);

		rc5.addReading(oneReading);
		rc5.addReading(oneReading5);

		bc1.addReading(threeReading);
		bc1.addReading(threeReading1);

		bc2.addReading(threeReading);
		bc2.addReading(threeReading2);

		evn.register(rc1);
		evn.register(rc1);
		evn.register(rc1);
		evn.register(rc2);
		evn.register(rc3);
		evn.register(rc4);
		evn.register(rc5);

		evn.register(bc1);
		evn.register(bc2);

		Date startDate = new GregorianCalendar(2024, Calendar.JANUARY, 18).getTime();
		Date endDate = new GregorianCalendar(2024, Calendar.MARCH, 18).getTime();

		List<Customer> listCustomner1 = evn.getReadingsByName("Trần Văn Quýt");
//		List<Customer> listCustomerDate1 = evn.getCustomersInDate(startDate, endDate);

//		assertEquals(1650.0, rc1.charge());
//		assertEquals(91000.0, rc2.charge());
//		assertEquals(148400.0, rc3.charge());
//		assertEquals(281100.0, rc4.charge());
//		assertEquals(504500.0, rc5.charge());
//
//		assertEquals(392250.0, bc1.charge());
//		assertEquals(574750.0, bc2.charge());

//		System.out.println(evn.invoice("201001"));
//		System.out.println(evn.allInvoice());
		System.out.println(evn.calculateAverageElectricityBill(startDate, endDate));
//		System.out.println(listCustomerDate1);
//		System.out.println(listCustomerDate1);
	}

}
