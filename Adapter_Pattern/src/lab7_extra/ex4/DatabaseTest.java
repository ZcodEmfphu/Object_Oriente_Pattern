package lab7_extra.ex4;

import java.util.List;
import java.util.Map;

public class DatabaseTest {
	public static void main(String[] args) {
		OriginalDatabase database = new MyDatabaseAdapter(new MyDatabase());

		database.connect();
		database.insertData("users", Map.of("name", "Alice", "age", 25));
		database.insertData("users", Map.of("name", "Bob", "age", 30));
		database.updateData("users", Map.of("age", 31), "name='Bob'");
		database.deleteData("users", "age=31");
		List<Map<String, Object>> result = database.query("SELECT * FROM users");
		System.out.println("Query result: " + result);
	}
}
