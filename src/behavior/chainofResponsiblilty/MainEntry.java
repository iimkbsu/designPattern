package behavior.chainofResponsiblilty;

public class MainEntry {

	public static void main(String[] args) {
		
		Handler handler1 = new ProtocolHandler();
		Handler handler2 = new PortHandler();
		Handler handler3 = new DomainHandler();
		
		//책임연쇄
		handler1.setNext(handler2).setNext(handler3);
		
		String url = "https://myWeb.or.kr:80";
		System.out.println("INPUT : " + url);
		
		handler1.run(url);

	}

}
