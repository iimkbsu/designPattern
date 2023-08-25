package behavior.mediator;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		SmartHome sh = new SmartHome();
		
		try(Scanner scanner = new Scanner(System.in);) {
			
			do {
				sh.report();
				System.out.println();
				System.out.println("[1] 문 열기");
				System.out.println("[2] 문 닫기");
				System.out.println("[3] 창문 열기");
				System.out.println("[4] 창문 닫기");
				System.out.println("[5] 에어컨 켜기");
				System.out.println("[6] 에어컨 끄기");
				System.out.println("[7] 보일러 켜기");
				System.out.println("[8] 보일러 끄기");
				
				System.out.print("선택 : ");
				int i = scanner.nextInt();
				System.out.println();
				
				switch(i) {
				case 1 : sh.door.open(); break;
				case 2 : sh.door.close(); break;
				case 3 : sh.window.open(); break;
				case 4 : sh.window.close(); break;
				case 5 : sh.aircon.on(); break;
				case 6 : sh.aircon.off(); break;
				case 7 : sh.boiler.on(); break;
				case 8 : sh.boiler.off(); break;
				}
				
			}while(true);
		}
		

	}

}
