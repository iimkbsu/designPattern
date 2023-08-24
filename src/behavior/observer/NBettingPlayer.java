package behavior.observer;

//홀짝이 아닌 특정한 수에 배팅할 수 있는 플레이어
public class NBettingPlayer extends Player{

	private int chooseNum;
	
	public NBettingPlayer(String name, int chooseNum) {
		super(name);
		this.chooseNum = chooseNum;
	}

	@Override
	public void update(int diceNumber) {
		if(diceNumber == chooseNum) {
			System.out.println(getName() + "는 " + chooseNum + "을 골랐으므로 두 배 당첨!!");
		}
		
	}
	
	
}
