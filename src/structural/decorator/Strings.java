package structural.decorator;

import java.util.ArrayList;
import java.util.Iterator;

public class Strings extends Item {
	
	private ArrayList<String> strings = new ArrayList<>();
	
	public void add(String item) {
		strings.add(item);
	}

	@Override
	public int getLinesCount() {
		return strings.size();
	}

	@Override
	public int getMaxLength() {
		Iterator<String> it = strings.iterator();
		int maxWidth = 0;
		
		while(it.hasNext()) {
			String string = it.next();
			int width = string.length();
			
			if(width > maxWidth) maxWidth = width;
		}
		return maxWidth;
	}

	@Override
	public int getLength(int index) {
		String string = strings.get(index);
		return string.length();
	}

	@Override
	public String getString(int index) {
		String string = strings.get(index);
		return string;
	}
	
	

}
