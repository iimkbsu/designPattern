package behavior.observer;

import java.util.Iterator;
import java.util.Random;

//1~6까지 공평한 확률로 나오게 주사위게임 정의하는 클래스
public class FairDiceGame extends DiceGame {

	private Random random = new Random();
	
	@Override
	public void play() {
		int diceNumber = random.nextInt(6) + 1;
		System.out.println("주사위를 던졌다 : " + diceNumber);
		
		Iterator<Player> it = playerList.iterator();
		while(it.hasNext()) {
			it.next().update(diceNumber);
		}
	}
}
