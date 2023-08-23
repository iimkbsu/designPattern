package behavior.adapter;

//고양이나 개 클래스와는 다른 형식을 갖고 있는 호랑이 클래스.
//호랑이 클래스 형태를 변경할 수 없을 때 어댑터를 사용하여 같은 animal 추상클래스로 처리할 수 있게 함

public class Tiger {
	
	private String name;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}

	void roar() {
		System.out.println("Growl");
	}
}
