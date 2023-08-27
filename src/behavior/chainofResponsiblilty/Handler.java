package behavior.chainofResponsiblilty;


// URL 구성 
// https://myWeb.or.kr:80/myWebPack/run?k=v#section1
// 프로토콜://호스트(IP or 도메인명):포트/경로?매개변수#부분식별자

//책임 기능 부모 클래스 (URL 처리 클래스)
public abstract class Handler {

	protected Handler nextHandler = null;
	
	public Handler setNext(Handler handler) {
		this.nextHandler = handler;
		return handler;
	}
	
	protected abstract void process(String url);
	
	//재귀반복
	public void run(String url) {
		process(url);
		if(nextHandler != null) nextHandler.run(url);
	}
}
