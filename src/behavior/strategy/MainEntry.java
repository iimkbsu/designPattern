package behavior.strategy;

public class MainEntry {

	public static void main(String[] args) {
		
		SumPrinter mysp = new SumPrinter();
		
		mysp.print(new SimpleSumStrategy(), 10);
		
		mysp.print(new GaussSumStrategy(), 10);

	}

}
