package behavior.strategy;

public class SumPrinter {
	
	void print(SumStrategy sstrategy, int n) {
		System.out.printf("The Sum of 1 ~ %d : ", n);
		System.out.println(sstrategy.get(n));
		
		
	}
	
 }
