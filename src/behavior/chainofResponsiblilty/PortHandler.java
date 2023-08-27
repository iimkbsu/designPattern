package behavior.chainofResponsiblilty;

//프로토콜://호스트(IP or 도메인명):포트/경로?매개변수#부분식별자

//URL에서 포트만 찾아서 문자열로 출력하는 Handler 자식클래스
public class PortHandler extends Handler{

	@Override
	protected void process(String url) {

		int index = url.lastIndexOf(":");
		if(index != -1) {
			String strPort = url.substring(index+1);
			
			try {
				int port = Integer.parseInt(strPort);
				System.out.println("PORT : " + port);
				return;
			}catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("NO PORT");
	}

	
}
