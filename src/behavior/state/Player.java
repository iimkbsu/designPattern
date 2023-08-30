package behavior.state;

public class Player {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	private State state = new StandUpState(this);
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public void talk(String msg) {
		System.out.println("플레이어의 말: \"" + msg + "\"");
	}
}
