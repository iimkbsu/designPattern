package creational.builder2;

public class PlainTextBuilder extends Builder {
	
	public PlainTextBuilder(Data data) {
		super(data);
	}

	@Override
	public String head() {

		return "";
	}

	@Override
	public String body() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name : ").append(data.getName()).append(", Age: ").append(data.getAge());
		
		return sb.toString();
	}

	@Override
	public String foot() {

		return "";
	}
}
