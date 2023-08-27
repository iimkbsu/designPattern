package creational.prototype;

public class MainEntry {

	public static void main(String[] args) {
		
		//0,0 점 생성
		Point pt1 = new Point();
		pt1.setX(0).setY(0);
		//System.out.println(pt1.draw());
		
		// 100,0 점 생성
		Point pt2 = new Point();
		pt2.setX(100).setY(0);
		//System.out.println(pt2.draw());

		// 위의 두 점으로 선 생성
		Line line1 = new Line();
		line1.setStartPoint(pt1).setEndPoint(pt2);
		//System.out.println(line1.draw());
		
		
		// 위의 선 카피하기
		Line line1Copy = (Line)line1.copy();
		
		
		//추가 점 생성하여 선 생성하고 직사각형 만들기
		Point pt3 = new Point();
		pt3.setX(100).setY(100);
		
		Point pt4 = new Point();
		pt4.setX(0).setY(100);
		
		Line line2 = new Line();
		line2.setStartPoint(pt2).setEndPoint(pt3);
		
		Line line3 = new Line();
		line3.setStartPoint(pt3).setEndPoint(pt4);
		
		Line line4 = new Line();
		line4.setStartPoint(pt4).setEndPoint(pt1);
		
		Group rectangular = new Group("RECTANGULAR");
		rectangular.addShape(line1).addShape(line2).addShape(line3).addShape(line4);
		//System.out.println(rectangular.draw());
		
		//위의 사각형 복사하고 이동시키기 (깊은복사)
		Group cloneRect = (Group)rectangular.copy();
		cloneRect.moveOffset(100, 100);
		
		System.out.println("복사한 후 이동한 사각형 : \n" + cloneRect.draw());
		System.out.println("원본 사각형 : \n" + rectangular.draw());
		
	}

}
