package behavior.visitor;

//데이터 합 기능 제공
public class SumVisitor implements Visitor{
	
	private int sum = 0;
	
	public int getValue() {
		return sum;
	}

	@Override
	public void visit(Unit unit) {
		if(unit instanceof Item) {
			sum += ((Item)unit).getValue();
		}else {
			unit.accept(this);
		}
	}
	
	
}
