package behavior.observer;

import java.util.Iterator;
import java.util.Random;

//특정한 수가 더 잘 나오도록 확률 조작한 게임 (3을 50%로 나오게 하자)
public class UnfairDiceGame extends DiceGame{
	
	Random random = new Random();
	
	@Override
	public void play() {
		int diceNumber = 0;
		int rand = random.nextInt(2); //0 or 1 나옴
		if(rand == 1) {
			diceNumber = 3;
		}else {
			do{
				diceNumber = random.nextInt(6) + 1;
			}while(diceNumber == 3);
		}
		System.out.println("주사위를 던졌다 : " + diceNumber);
		
		Iterator<Player> it = playerList.iterator();
		while(it.hasNext()) {
			it.next().update(diceNumber);
		}
	}
}
