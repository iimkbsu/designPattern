package creational.builder1;

import java.util.Random;

public class MainEntry {

	public static void main(String[] args) {
		
		//차 객체
		Car car1 = new Car("V8", "Black", true, true, false);
		
		//빌더로 만든 차 객체
		Car car2 = new CarBuilder().setAEB(false).setAirbag(false).setCameraSensor(true)
				.setColor("White").setEngine("V6").build();

		
		System.out.println(car1.toString());
		System.out.println();
		System.out.println(car2.toString());
		System.out.println();
		
		
		// 빌더로 조립하기
		CarBuilder builder = new CarBuilder().setCameraSensor(false)
				.setColor("Red").setEngine("I6");
		
		//위에서 조립된 빌더에 50% 확률로 에어백 장착하고 차 객체로 만들기
		Random random = new Random();
		Car car3 = builder.setAirbag(random.nextInt(2)==0).build();
		
		System.out.println(car3.toString());
	}

}
