package structural.composite;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit{

	private LinkedList<Unit> unitList = new LinkedList<>();

	
	public Folder(String name) {
		super(name);
	}
	
	@Override
	public int getSize() {
		int size = 0;
		Iterator<Unit> it = unitList.iterator();
		
		while(it.hasNext()) {
			Unit unit = it.next();
			size += unit.getSize();
		}
		return size;
	}
	
	//폴더에 unit 객체를 추가할 수 있는 메소드
	public boolean add(Unit unit) {
		unitList.add(unit);
		return true;
	}
	
	//LinkedList에 들어있는 unit을 하나씩 출력하는 메소드
	private void list(String indent, Unit unit) {
		if(unit instanceof File) {
			System.out.println(indent + unit);
		}else {
			Folder dir = (Folder)unit;
			Iterator<Unit> it = dir.unitList.iterator();
			System.out.println(indent + "+ " + unit);
			
			while(it.hasNext()) {
				list(indent + "    ", it.next());
			}
		}
	}
	
	//재귀구문
	public void list() {
		list("",this);
	}
	
	
}
