package lab7_extra.ex4;

import java.util.List;
import java.util.Map;

public class MyDatabaseAdapter implements OriginalDatabase {
	private MyDatabase myDatabase;

	public MyDatabaseAdapter(MyDatabase myDatabase) {
		this.myDatabase = myDatabase;
	}

	@Override
	public void connect() {
		myDatabase.connect();
		System.out.println("Connected to the new database using MyDatabaseAdapter");
	}

	@Override
	public void insertData(String tableName, Map<String, Object> data) {
		String mappedTableName = mapTableName(tableName);
		Map<String, Object> mappedData = mapData(data);

		myDatabase.insertData(mappedTableName, mappedData);
		System.out.println("Inserted data into table '" + tableName + "' using MyDatabaseAdapter");
	}

	@Override
	public void updateData(String tableName, Map<String, Object> data, String whereClause) {
		String mappedTableName = mapTableName(tableName);
		Map<String, Object> mappedData = mapData(data);
		String mappedWhereClause = mapWhereClause(whereClause);

		myDatabase.updateData(mappedTableName, mappedData, mappedWhereClause);
		System.out.println("Updated data in table '" + tableName + "' using MyDatabaseAdapter");
	}

	@Override
	public void deleteData(String tableName, String whereClause) {
		String mappedTableName = mapTableName(tableName);
		String mappedWhereClause = mapWhereClause(whereClause);

		myDatabase.deleteData(mappedTableName, mappedWhereClause);
		System.out.println("Deleted data from table '" + tableName + "' using MyDatabaseAdapter");
	}

	@Override
	public List<Map<String, Object>> query(String query) {
		String mappedQuery = buildQuery(query);

		List<Map<String, Object>> result = myDatabase.query(mappedQuery);
		System.out.println("Executed query using MyDatabaseAdapter");
		return result;
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

	private String buildQuery(String query) {
		return query;
	}
}