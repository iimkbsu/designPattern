package behavior.observer;


public class MainEntry {

	public static void main(String[] args) {
		
		FairDiceGame fdg = new FairDiceGame();
		
		fdg.addPlayer(new EvenBettingPlayer("player_Even1"));
		fdg.addPlayer(new OddBettingPlayer("player_Odd1"));
		fdg.addPlayer(new OddBettingPlayer("player_Odd2"));
		fdg.addPlayer(new NBettingPlayer("player_choose", 3));

		for(int i=0; i<10; i++) {
			System.out.println("====== " + (i+1) +" 회 ======");
			fdg.play();
			System.out.println();
			
		}
		
		System.out.println("===================================");
		System.out.println("↓↓↓↓ 3이 50% 확률로 나오는 조작게임 ↓↓↓↓");
		System.out.println("===================================");
		
		
		
		//3이 50%확률로 나오는 주사위게임
		UnfairDiceGame ufdg = new UnfairDiceGame();
		
		ufdg.addPlayer(new EvenBettingPlayer("player_Even1"));
		ufdg.addPlayer(new OddBettingPlayer("player_Odd1"));
		ufdg.addPlayer(new OddBettingPlayer("player_Odd2"));
		ufdg.addPlayer(new NBettingPlayer("player_choose", 3));

		for(int i=0; i<10; i++) {
			System.out.println("=== 조작 " + (i+1) +" 회 ======");
			ufdg.play();
			System.out.println();
			
		}
		
		

	}

}
