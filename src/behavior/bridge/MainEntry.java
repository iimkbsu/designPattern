package behavior.bridge;

public class MainEntry {

	public static void main(String[] args) {
		
		String title = "복원된 지구";
		var author = "김형준";
		String[] content = {
				"플라스틱 사용의 감소와",
				"바다 생물 어획량 감소로 인하여",
				"지구는 복원되었다."
				};

		Draft draft = new Draft(title, author, content);
		
		SimpleDisplay sd = new SimpleDisplay();
		draft.print(sd);
		System.out.println("================");
		CaptionDisplay cd = new CaptionDisplay();
		draft.print(cd);
		System.out.println("================");
		
		//추가된 구문
		var publisher = "북악출판";
		var price = 20000;
		
		Publication publication = new Publication(title, author, content, publisher, price);
		
		publication.print(sd);
		System.out.println("================");
		publication.print(cd);
		
	}
	
}
