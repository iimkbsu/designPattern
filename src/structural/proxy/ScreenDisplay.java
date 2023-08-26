package structural.proxy;

public class ScreenDisplay implements Display{

	@Override
	public void print(String content) {
		
		try {
			//출력물의 용량이 커서 0.5초 정도 출력 준비 시간이 필요하다고 가정
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(content);
	}
}
