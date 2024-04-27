package lab7_extra.ex4;

import java.util.List;
import java.util.Map;

public class MyDatabase {

	public void connect() {
		System.out.println("Connected to the database using the original schema");

	}

	public void insertData(String tableName, Map<String, Object> data) {
		System.out.println("Inserting data into table '" + tableName + "' using the original schema");

	}

	public void updateData(String tableName, Map<String, Object> data, String whereClause) {
		System.out.println("Updating data in table '" + tableName + "' using the original schema");
	}

	public void deleteData(String tableName, String whereClause) {
		System.out.println("Deleting data from table '" + tableName + "' using the original schema");
	}

	public List<Map<String, Object>> query(String query) {
		System.out.println("Executing query: " + query + " using the original schema");
		return null;
	}

	private String mapTableName(String tableName) {
		return tableName;
	}

	private Map<String, Object> mapData(Map<String, Object> data) {
		return data;
	}

	private String mapWhereClause(String whereClause) {
		return whereClause;
	}

	private String buildQuery(String tableName, Map<String, Object> data, String whereClause) {
		return "";
	}

}
