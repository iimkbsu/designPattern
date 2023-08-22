package behavior.iterator;

//아이템은 이름과 가격 데이터로 구성됨
//아이템 객체생성시 이름과 가격 파라미터를 받음
public class Item {
	
	private String name;
	private int cost;
	
	public Item(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "(" + name + ", " + cost + ")";
	}
}
