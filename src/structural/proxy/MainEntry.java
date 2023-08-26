package structural.proxy;

public class MainEntry {

	public static void main(String[] args) {
	
		Display display = new ScreenDisplay();
		
		display.print("피고인의 자백이 고문·폭행·협박·구속의 부당한 장기화 또는 기망 기타의 방법에 의하여");
		display.print("자의로 진술된 것이 아니라고 인정될 때 또는 정식재판에 있어서 피고인의 자백이");
		display.print("그에게 불리한 유일한 증거일 때에는 이를 유죄의 증거로 삼거나 이를 이유로 처벌할 수 없다.");
		display.print("의무교육은 무상으로 한다.");
		display.print("대통령후보자가 1인일 때에는 그 득표수가 선거권자 총수의 3분의 1 이상이 아니면 대통령으로 당선될 수 없다.");
		display.print("이 헌법중 공무원의 임기 또는 중임제한에 관한 규정은 이 헌법에 의하여 그 공무원이 최초로 선출 또는 임명된 때로부터 적용한다.");
	
		System.out.println();
		System.out.println("=======================================");
		System.out.println("=========== 버퍼를 사용한 출력 ============");
		System.out.println("=======================================");
		System.out.println();
		
		Display bDisplay = new BufferDisplay(4); //4줄을 한 번에 버퍼 처리 함
		
		bDisplay.print("피고인의 자백이 고문·폭행·협박·구속의 부당한 장기화 또는 기망 기타의 방법에 의하여");
		bDisplay.print("자의로 진술된 것이 아니라고 인정될 때 또는 정식재판에 있어서 피고인의 자백이");
		bDisplay.print("그에게 불리한 유일한 증거일 때에는 이를 유죄의 증거로 삼거나 이를 이유로 처벌할 수 없다.");
		bDisplay.print("의무교육은 무상으로 한다.");
		bDisplay.print("대통령후보자가 1인일 때에는 그 득표수가 선거권자 총수의 3분의 1 이상이 아니면 대통령으로 당선될 수 없다.");
		bDisplay.print("이 헌법중 공무원의 임기 또는 중임제한에 관한 규정은 이 헌법에 의하여 그 공무원이 최초로 선출 또는 임명된 때로부터 적용한다.");
	
		((BufferDisplay)bDisplay).flush(); // 이 구문이 없으면 총 6줄의 문장인데 버퍼크기인 4줄만 출력 되고 끝남.
		
	}

}
