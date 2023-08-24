package creational.singleton;

public class King {
	
	//셀프 필드
	private static King self = null;
	
	//싱글톤 패턴. 오로지 자신 클래스에서만 객체 생성 (private 설정)
	private King() {
		
	}
	
	//동기화메소드(멀티스레드 환경에서 한번에 하나만 접근가능)를 사용하여 King 객체를 참조할 수 있는 getInstance()메소드 선언
	public synchronized static King getInstance() {
		
		if(self == null) {
			self = new King();
		}
		return self;
	}
	
	public void say() {
		System.out.println("I am only one");
	}

}
