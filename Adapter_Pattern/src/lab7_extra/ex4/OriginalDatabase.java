package lab7_extra.ex4;

import java.util.List;
import java.util.Map;

public interface OriginalDatabase {

	public void connect();

	public void insertData(String tableName, Map<String, Object> data);

	public void updateData(String tableName, Map<String, Object> data, String whereClause);

	public void deleteData(String tableName, String whereClause);

	public List<Map<String, Object>> query(String query);

}
