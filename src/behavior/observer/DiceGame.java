package behavior.observer;

import java.util.LinkedList;

//여러 주사위게임을 상속시키기위한 추상클래스
public abstract class DiceGame {

	//본인 또는 상속시킨 자식클래스에서만 접근할 수 있도록 protected 접근자로 생성
	protected LinkedList<Player> playerList = new LinkedList<>();
	
	public void addPlayer(Player player) {
		playerList.add(player);
	}
	
	public abstract void play();
}
