package behavior.memento;

import java.util.Random;

public class MainEntry {

	public static void main(String[] args) {

		Walker walker = new Walker(0,0, 10,10);
		
		String[] actions = {"UP", "RIGHT", "DOWN", "LEFT"};
		
		//Walker 객체가 무작위로 움직이게 하기위한 랜덤객체 생성
		Random random = new Random();
		
		double minDistance = Double.MAX_VALUE;
		Walker.Memento memento = null;
		
		//Walker 객체 움직이기
		while(true) {
			String action = actions[random.nextInt(4)];
			double distance = walker.walk(action);
			System.out.println(action + " " + distance);
			
			if(distance == 0.0) {
				break;
			}
			
			if(minDistance > distance) {
				minDistance = distance;
				memento = walker.createMemento();
			}else {
				if(memento != null) {
					walker.restoreMemnto(memento);
				}
			}
		}
		
		System.out.println("Walker's path : " + walker);

	}

}
