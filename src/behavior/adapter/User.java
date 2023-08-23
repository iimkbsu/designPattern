package behavior.adapter;

import java.util.ArrayList;

public class User {

	public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Dog("댕이"));
		animals.add(new Cat("때껄룩"));
		animals.add(new Cat("길냥이"));
		
		
		//animals.add(new Tiger("호돌이"));
		//어댑터를 사용하여 아래의 코드처럼 Animal객체로 호랑이를 만들 수 있게함
		animals.add(new TigerAdapter("호돌이"));
		
		
		animals.forEach(animal ->animal.sound());

	}

}
