package behavior.mediator;

//중재자 인터페이스를 구현한 스마트홈 클래스를 사용하여
//여러 객체(에어컨,보일러,창문,문)의 상태를 전달받아 이에 맞는 처리를 한 번에 할 수 있게 구현
public class SmartHome implements Mediator {
	
	public Door door = new Door(this);
	public Window window = new Window(this);
	public HeatBoiler boiler = new HeatBoiler(this);
	public CoolAircon aircon = new CoolAircon(this);
	
	@Override
	public void participantChanged(Participant participant) {
		if(participant == door && !(door.isClosed())) {
			aircon.off();
			boiler.off();
		}
		
		if(participant == window && !(window.isClosed())) {
			aircon.off();
			boiler.off();
		}
		
		if(participant == aircon && aircon.isRunning()) {
			window.close();
			door.close();
			boiler.off();
		}
		
		if(participant == boiler && boiler.isRunning()) {
			window.close();
			door.close();
			aircon.off();
		}
			
	}
	public void report() {
		System.out.println("[집 안 상태]");
		System.out.println(door);
		System.out.println(window);
		System.out.println(aircon);
		System.out.println(boiler);
		System.out.println();
	}
}
