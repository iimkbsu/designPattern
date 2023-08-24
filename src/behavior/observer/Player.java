package behavior.observer;

//다양한 배팅을 하는 플레이어를 상속시키기위한 추상클래스
public abstract class Player {

	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void update(int diceNumber);
}
