package behavior.memento;

import java.util.ArrayList;

public class Walker {
	
	private int currentX, currentY; //현재 위치 좌표
	private int targetX, targetY; //도달 목표 좌표
	private ArrayList<String> actionList = new ArrayList<>(); //시작좌표에서 목표 좌표로 가기위해 필요한 움직임을 배열리스트로 저장하기 위한 컨테이너
	
	//생성자
	public Walker(int currentX, int currentY, int targetX, int targetY) {
		this.currentX = currentX;
		this.currentY = currentY;
		this.targetX = targetX;
		this.targetY = targetY;
	}
	
	//메소드 (매개변수로 액션 문자열을 받고 이를 배열리스트에 추가하기)
	public double walk(String action) {
		actionList.add(action);
		
		if(action.equals("UP")) {
			currentY += 1;
		}else if(action.equals("RIGHT")) {
			currentX += 1;
		}else if(action.equals("DOWN")) {
			currentY -= 1;
		}else if(action.equals("LEFT")) {
			currentX -= 1;
		}
		
		//최종 목표 좌표에서 현재 좌표까지의 거리
		return Math.sqrt(Math.pow(currentX-targetX, 2) + Math.pow(currentY-targetY, 2));
	}
	
	//Walker 클래스에서만 생성 가능한 Memento 내부클래스
	protected class Memento {
		private int x, y;
		private ArrayList<String> actionList;
		private Memento() {}
	}
	
	//상태기억 메멘토 생성 메소드
	protected Memento createMemento() {
		Memento memento = new Memento();
		
		memento.x = this.currentX;
		memento.y = this.currentY;
		memento.actionList = (ArrayList<String>)(this.actionList.clone());
		
		return memento;
	}
	
	//필요할 때 메멘토 리턴해주는 메소드
	protected void restoreMemnto(Memento memento) {
		this.currentX = memento.x;
		this.currentY = memento.y;
		this.actionList = (ArrayList<String>)memento.actionList.clone();
	}
	
	//Walker 객체를 문자열로 변환해서 리턴하는 toString 메소드 재정의
	@Override
	public String toString() {
		return actionList.toString();
	}

}
