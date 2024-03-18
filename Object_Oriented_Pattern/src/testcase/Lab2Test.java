package testcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import lab2.BusinessCustomer;
import lab2.OneReading;
import lab2.ResidentalCustomer;

class Lab2Test {

	@Test
	void test() {

		BusinessCustomer bc1 = new BusinessCustomer("201001", "CoCa Cola", null);
		BusinessCustomer bc2 = new BusinessCustomer("201002", "Pepsi", null);

		ResidentalCustomer rc1 = new ResidentalCustomer("202001", "Trần Văn Quýt", null);
		ResidentalCustomer rc2 = new ResidentalCustomer("202002", "Trần Văn Thơm", null);
		ResidentalCustomer rc3 = new ResidentalCustomer("202003", "Trần Văn Táo", null);

		ResidentalCustomer rc4 = new ResidentalCustomer("202004", "Nguyễn Thị Dâu", null);
		ResidentalCustomer rc5 = new ResidentalCustomer("202005", "Nguyễn Thị Đào", null);

		OneReading oneReading = new OneReading(new GregorianCalendar(2024, Calendar.JANUARY, 18).getTime(), 1350);

		OneReading oneReading1 = new OneReading(new GregorianCalendar(2024, Calendar.FEBRUARY, 18).getTime(), 1353);
		OneReading oneReading2 = new OneReading(new GregorianCalendar(2024, Calendar.FEBRUARY, 18).getTime(), 1490);
		OneReading oneReading3 = new OneReading(new GregorianCalendar(2024, Calendar.FEBRUARY, 18).getTime(), 1540);
		OneReading oneReading4 = new OneReading(new GregorianCalendar(2024, Calendar.FEBRUARY, 18).getTime(), 1640);
		OneReading oneReading5 = new OneReading(new GregorianCalendar(2024, Calendar.JANUARY, 18).getTime(), 1800);

		rc1.addReading(oneReading);
		rc1.addReading(oneReading1);

		rc2.addReading(oneReading);
		rc2.addReading(oneReading2);

		rc3.addReading(oneReading);
		rc3.addReading(oneReading3);

		rc4.addReading(oneReading);
		rc4.addReading(oneReading4);

		rc5.addReading(oneReading);
		rc5.addReading(oneReading5);

		assertEquals(1650.0, rc1.charge());
		assertEquals(91000.0, rc2.charge());
		assertEquals(148400.0, rc3.charge());
		assertEquals(281100.0, rc4.charge());
		assertEquals(504500.0, rc5.charge());
	}

}
