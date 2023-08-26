package structural.decorator;

public class MainEntry {

	public static void main(String[] args) {
		
		Strings strings = new Strings();
		
		strings.add("Hello~");
		strings.add("My Name is Kim Bum-Soo.");
		strings.add("I am a BE Developer.");
		strings.add("Design-Pattern is powerful tool.");

		
		strings.print();
		System.out.println();
		
		//장식 추가하기
		Item decorator = new SideDecorator(strings, '\"');
		decorator.print();
		System.out.println();
		
		decorator = new LineNumberDecorator(decorator);
		decorator.print();
		System.out.println();
		
		
		decorator = new BoxDecorator(decorator);
		decorator.print();
		System.out.println();
		
	}
	
	

}
