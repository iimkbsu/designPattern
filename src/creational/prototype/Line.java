package creational.prototype;

public class Line implements Prototype, Shape{
	
	private Point startPt;
	private Point endPt;
	
	public Line setStartPoint(Point pt) {
		this.startPt = pt;
		return this;
	}
	
	public Line setEndPoint(Point pt) {
		this.endPt = pt;
		return this;
	}
	
	public Point getStartPoint() {
		return startPt;
	}
	
	public Point getEndPoint() {
		return endPt;
	}

	@Override
	public String draw() {
		return "LINE(" + startPt.draw() +"," + endPt.draw() + ")";
	}

	@Override
	public void moveOffset(int dx, int dy) {
		startPt.moveOffset(dx, dy);
		endPt.moveOffset(dx, dy);
	}

	@Override
	public Object copy() {
		Line newLine = new Line();
		newLine.startPt = (Point)startPt.copy();
		newLine.endPt = (Point)endPt.copy();
		
		return newLine;
	}
	
	
}
