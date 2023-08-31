package behavior.visitor;

//단일 데이터
public class Item implements Unit {
	private int value;
	
	public Item(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
