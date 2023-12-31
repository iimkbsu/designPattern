package creational.abstractFactory;

public abstract class TextEdit {

	protected String value;
	
	public TextEdit(String value) {
		this.value = value;
	}
	
	public void setValue(String value) {
		this.value = value;
		render();
	}
	
	abstract void render();
}
