package creational.builder1;

public class CarBuilder {
	private String engine, color;
	private boolean airbag, cameraSensor, AEB;
	
	public CarBuilder setEngine(String engine) {
		this.engine = engine;
		return this;
	}
	
	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	
	public CarBuilder setAirbag(boolean airbag) {
		this.airbag = airbag;
		return this;
	}
	
	public CarBuilder setCameraSensor(boolean cameraSensor) {
		this.cameraSensor = cameraSensor;
		return this;
	}
	
	public CarBuilder setAEB(boolean AEB) {
		this.AEB = AEB;
		return this;
	}
	
	public Car build() {
		return new Car(engine, color, airbag, cameraSensor, AEB);
	}
	
}
