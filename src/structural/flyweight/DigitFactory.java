package structural.flyweight;

public class DigitFactory {

	private Digit[] pool = new Digit[10];
	
	public Digit getDigit(int n) {
		if(pool[n] != null) {
			return pool[n];
		}else {
			String fileName = String.format("C:\\Dev\\Workspace\\design_pattern\\src\\structural\\flyweight\\data\\%d.txt", n);
			Digit digit = new Digit(fileName);
			pool[n] = digit;
			return digit;
		}
	}
}


//{
//	null, null, null, null, null, null, null, null, null, null
//};