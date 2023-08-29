package creational.abstractFactory;

public class MainEntry {

	public static void main(String[] args) {
		
		ComponentFactory wFactory = new WindowsFactory();
		
		Button wButton = wFactory.createButton("확인");
		CheckBox wCheckBox = wFactory.createCheckBox(false);
		TextEdit wTextEdit = wFactory.createTextEdit("디자인패턴");
		
		wButton.render();
		wCheckBox.render();
		wTextEdit.render();
		
		
		ComponentFactory lFactory = new LinuxFactory();
		
		Button lButton = lFactory.createButton("확인");
		CheckBox lCheckBox = lFactory.createCheckBox(false);
		TextEdit lTextEdit = lFactory.createTextEdit("디자인패턴");
		
		lButton.render();
		lCheckBox.render();
		lTextEdit.render();
		
		lButton.clickEvent();
		lCheckBox.setChecked(true);
		lTextEdit.setValue("GoF의 디자인패턴!!!");

	}

}
