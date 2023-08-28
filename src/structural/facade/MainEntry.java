package structural.facade;

public class MainEntry {

	public static void main(String[] args) {
		
//		DBMS dbms = new DBMS();
//		Cache cache = new Cache();
		Facade facade = new Facade(); //위의 객체생성 대신에 facade 객체 사용
		
		
		
		String name = "Dorosh";
		
		
//		Row row = cache.get(name);
//		if(row == null) {
//			row = dbms.query(name);
//			if(row != null) {
//				cache.put(row);
//			}
//		}
//		
//		if(row != null) {
//			Message message = new Message(row);
//			
//			System.out.println(message.makeName());
//			System.out.println(message.makeBirthday());
//			System.out.println(message.makeEmail());
//		}else {
//			System.out.println(name + "is not exists.");
//		}
		
		facade.run(name);//위의 실행함수 대신에 facade의 run메소드 사용

	}

}
