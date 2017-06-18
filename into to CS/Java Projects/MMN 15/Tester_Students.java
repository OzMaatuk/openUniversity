
public class Tester_Students {
	public static void main(String[] args) {
		
		Point fX = new Point(0, 0);
		Point sX = new Point(fX);
		sX.move(1, 1);
		Point tX = new Point(fX.getX(), sX.getY());
		
		PointNode pS = new PointNode(sX);
		PointNode pF = new PointNode(fX, pS);
		
		if (Math.abs(pF.getPoint().distance(pF.getNext().getPoint())) - Math.sqrt(2) > 0.1)
			System.out.println("Distance Calculation is wrong");
		
		Polygon myPolygon = new Polygon();
		myPolygon.addVertex(fX, 1);
		myPolygon.addVertex(sX, 2);
		myPolygon.addVertex(tX, 3);
	
		if (!myPolygon.toString().equals("The polygon has 3 vertices:\n((0.0,0.0),(1.0,1.0),(0.0,1.0))")){
			System.out.println("Work on your String representation");
			System.out.println("Currect answer:\nThe polygon has 3 vertices:\n((0.0,0.0),(1.0,1.0),(0.0,1.0))");
			System.out.println(myPolygon.toString());
		} else 
			if (Math.abs(myPolygon.calcPerimeter() - 3.414) > 0.1) 
				System.out.println("Work on your perimeter calculation, Your result: " + myPolygon.calcPerimeter());
			else 
				if (Math.abs(myPolygon.calcArea() - 0.5) > 1) 
					System.out.println("Work on your area calculation, Your result: " + myPolygon.calcArea());
				else
					System.out.println("Good start...");
	
	
	}
}
