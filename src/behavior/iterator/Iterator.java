package behavior.iterator;

//반복자 인터페이스(인터페이스는 추상메소드와 상수만 선언 가능)
//인터페이스의 메소드는 전부 추상메소드이므로
//상속받은 클래스에서는 인터페이스의 메소드를 모두 오버라이딩하여 사용해야 함

public interface Iterator {
	
	//다음 데이터 존재 여부 확인 메소드
	boolean next();
	
	//구성 데이터의 현재 위치의 데이터 반환 메소드
	Object current();
}
