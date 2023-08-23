package structural.bridge;

//원고에대한 저자, 내용등을 담는 클래스
//이런 내용을 화면에 표시하기위해 Display 인터페이스를 사용하도록

public class Draft {

	private String title;
	private String author;
	private String[] content;
	
	public Draft(String title, String author, String[] content) {
		this.title = title;
		this.author = author;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String[] getContent() {
		return content;
	}
	
	
	public void print(Display display) {
		display.title(this);
		display.author(this);
		display.content(this);
	}
	
}
