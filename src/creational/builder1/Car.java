package creational.builder1;

public class Car {
	private String engine, color;
	private boolean airbag, cameraSensor, AEB;
	
	public Car(String engine, String color, boolean airbag, boolean cameraSensor, boolean AEB) {

		this.engine = engine;
		this.color = color;
		this.airbag = airbag;
		this.cameraSensor = cameraSensor;
		this.AEB = AEB;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("# CAR SPEC\n");
		sb.append(" CameraSensor " + (cameraSensor?"Y":"N") + "\n");
		sb.append("       Engine " + engine + "\n");
		sb.append("       Airbag " + (airbag?"Y":"N") + "\n");
		sb.append("        Color " + color + "\n");
		sb.append("          AEB " + (AEB?"Y":"N") + "\n");
		
		return sb.toString();
	}
	
	

	
	
}
