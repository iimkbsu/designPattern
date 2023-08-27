package behavior.chainofResponsiblilty;

//프로토콜://호스트(IP or 도메인명):포트/경로?매개변수#부분식별자

//URL에서 프로토콜만 찾아서 문자열로 출력하는 Handler 자식클래스
public class ProtocolHandler extends Handler {

	@Override
	public void process(String url) {
		int index = url.indexOf("://");
		if(index != -1) {
			System.out.println("PROTOCOL : " + url.substring(0, index));
		}else {
			System.out.println("NO PROTOCOL");
		}
	}
}
