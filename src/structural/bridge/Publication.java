package structural.bridge;

public class Publication extends Draft{
	
	private String publisher;
	private int price;

	public Publication(String title, String author, String[] content, String publisher, int price) {
		super(title, author, content);
		this.publisher = publisher;
		this.price = price;
		
	}
	
	private void printPublisherPriceInfo() {
		System.out.println("#" + publisher + " " + price + "원");
	}
	
	public void print(Display display) {
		super.print(display);
		printPublisherPriceInfo();
	}
	

}
