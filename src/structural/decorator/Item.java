package structural.decorator;

public abstract class Item {
	
	public abstract int getLinesCount(); //문자열 줄 수 반환
	public abstract int getMaxLength(); //문자열 중 가장 긴 문자열 길이 반환
	public abstract int getLength(int index); //지정한 인덱스의 문자열 길이 반환
	public abstract String getString(int index); //지정한 인덱스의 문자열 반환
	
	public void print() {
		int cntLines = getLinesCount();
		for(int i=0; i<cntLines; i++) {
			String string = getString(i);
			System.out.println(string);
		}
	}
}
