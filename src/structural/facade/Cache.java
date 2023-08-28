package structural.facade;

import java.util.HashMap;

//DBMS에서 조회하면 속도가 느리므로 Cache를 사용하여 빠른 조회 가능
public class Cache {
	
	private HashMap<String, Row> cache = new HashMap<>();
	
	public void put(Row row) {
		cache.put(row.getName(), row);
	}
	
	public Row get(String name) {
		return cache.get(name);
	}
}
