package structural.composite;

public abstract class Unit {
	
	private String name;

	public Unit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + "(" + getSize() + ")";
	}
	
	//파일과 폴더의 용량을 얻는 방법이 다르므로 추상메소드로 선언 후 Unit 추상 클래스를 상속받아 각각 유형에 맞게 재정의 후 사용
	public abstract int getSize();
	
}
