package behavior.chainofResponsiblilty;

//프로토콜://호스트(IP or 도메인명):포트/경로?매개변수#부분식별자

//URL에서 도메인만 찾아서 문자열로 출력하는 Handler 자식클래스
public class DomainHandler extends Handler {
	@Override
	public void process(String url) {
		int startIndex = url.indexOf("://");
		int lastIndex = url.lastIndexOf(":");
		
		System.out.print("DOMAIN : ");
		if(startIndex == -1) {
			if(lastIndex == -1) {
				System.out.println(url);
			}else {
				System.out.println(url.substring(0, lastIndex));
			}
		}else if(startIndex != lastIndex) {
			System.out.println(url.substring(startIndex+3, lastIndex));
		}else if(startIndex == lastIndex) {
			System.out.println(url.substring(startIndex+3));
		}else {
			System.out.println("NONE");
		}
	}
}
