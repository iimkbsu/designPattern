package structural.decorator;

/*
00: Strings 첫째 줄
01: Strings 둘째 줄
02: Strings 셋째 줄
03: Strings 넷째 줄
*/


public class LineNumberDecorator extends Decorator {

	public LineNumberDecorator(Item item) {
		super(item);
	}

	@Override
	public int getLinesCount() {
		return item.getLinesCount();
	}

	@Override
	public int getMaxLength() {
		return item.getMaxLength() + 4;
	}

	@Override
	public int getLength(int index) {
		return item.getLength(index) + 4;
	}

	@Override
	public String getString(int index) {
		return String.format("%02d", index) + ": " + item.getString(index);
	}

	
}
