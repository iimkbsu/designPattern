package behavior.state;

public class StandUpState extends State{
	
	public StandUpState(Player player) {
		super(player);
	}

	@Override
	public void standUp() {
		player.talk("언제 움질일꺼야?");
	}

	@Override
	public void sitDown() {
		player.setState(new SitDownState(player));
		player.talk("앉으니깐 편하고 좋습니다.");
	}

	@Override
	public void walk() {
		player.setSpeed(5);
		player.setState(new WalkState(player));
		player.talk("걷기는 제 2의 생각하기이다...");
	}

	@Override
	public void run() {
		player.setSpeed(10);
		player.setState(new RunState(player));
		player.talk("갑자기 뛴다!!");
	}

	@Override
	public String getDescription() {
		return "제자리에 서 있음.";
	}
	
	

}
