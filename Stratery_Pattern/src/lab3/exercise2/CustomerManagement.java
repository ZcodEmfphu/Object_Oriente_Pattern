package lab3.exercise2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement {

	private List<Customer> listCustomer = new ArrayList<Customer>();

	public CustomerManagement() {
		super();

	}

	public void addCustomer(Customer customer) {
		listCustomer.add(customer);
	}

	public boolean checkID(String id) {
		for (Customer item : listCustomer) {
			if (item.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public void updateCustomer(String name, String address) {

		for (Customer customer : listCustomer) {
			customer.setName(name);
			customer.setAddress(address);
			System.out.println("Thông tin khách hàng đã được cập nhật thành công.");
		}

	}

	public void inputCustomerInfo() {
		Scanner in = new Scanner(System.in);

		System.out.println("Nhập ID của khách hàng:");
		String id = in.nextLine();

		if (checkID(id) == true) {
			System.out.println("Nhập tên của khách hàng:");
			String name = in.nextLine();

			System.out.println("Nhập địa chỉ của khách hàng:");
			String address = in.nextLine();

			updateCustomer(name, address);
		} else {
			System.out.println("ID do not exits !");
		}

		in.close();

	}

	@Override
	public String toString() {
		return "CustomerManagement []";
	}

	public static void main(String[] args) {

		CustomerManagement c = new CustomerManagement();
		Customer marry = new Customer("1", "Marry", "ABC");
		List<Customer> listCustomer1 = new ArrayList<Customer>();

		listCustomer1.add(marry);
		System.out.println(marry);
		c.inputCustomerInfo();
		System.out.println(marry);

	}
}
