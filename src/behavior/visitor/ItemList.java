package behavior.visitor;

import java.util.ArrayList;
import java.util.Iterator;

//여러 개 데이터
public class ItemList implements Unit{
	private ArrayList<Unit> list = new ArrayList<>();
	
	public void add(Unit unit) {
		list.add(unit);
	}

	@Override
	public void accept(Visitor visitor) {
		Iterator<Unit> iter = list.iterator();
		
		while(iter.hasNext()) {
			Unit unit = iter.next();
			visitor.visit(unit);
		}
	}
	
	
}
