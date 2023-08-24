package creational.singleton;

public class MainEntry {

	public static void main(String[] args) {
		
		//싱글톤 패턴. 다른 클래스에서 King객체 생성할 수 없음
		//King myKing = new King();
		
		
		//getInstance() 메소드로 King 클래스 내부에서 객체생성하여 참조함
		King myKing = King.getInstance();
		myKing.say();
		
		King king2 = King.getInstance();
		
		if(myKing == king2) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}

	}

}
