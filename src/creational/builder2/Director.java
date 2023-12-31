package creational.builder2;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public String build() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(builder.head()).append(builder.body()).append(builder.foot());
		
		return sb.toString();
	}
}
