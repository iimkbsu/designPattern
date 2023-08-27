package creational.prototype;

public class Point implements Prototype, Shape{

	private int x;
	private int y;
	
	public Point setX(int x) {
		this.x = x;
		return this;
	}
	
	public Point setY(int y) {
		this.y = y;
		return this;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public String draw() {
		return "(" + x + " " + y +")";
	}

	@Override
	public void moveOffset(int dx, int dy) {
		this.x += dx;
		this.y += dy;
		
	}

	@Override
	public Object copy() {
		Point newPoint = new Point();
		
		newPoint.x = this.x;
		newPoint.y = this.y;
		
		return newPoint;
	}
	
}
