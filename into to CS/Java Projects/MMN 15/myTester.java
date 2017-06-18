/*
 * Made by Dan Seggev.
 * שימו לב!!! התשובות מבוססות על הממ"ן שלי ויתכן שלא יהיו בסדר הנכון או בכלל שאינן נכונות, השימוש בטסטר באחריותכם בלבד.
 */
import java.util.Scanner;
public class myTester
{
    public static void main(String[] args)
    {      
        Scanner scanner = new Scanner(System.in);

        Point A = new Point(1,1);
        Point B = new Point(2,6);
        Point C = new Point(6,6);
        Point D = new Point(8,4);
        Point E = new Point(6,2);

        PointNode fifth = new PointNode(E);
        PointNode fourth = new PointNode(D, fifth);
        PointNode third = new PointNode(C,fourth );
        PointNode second = new PointNode(B, third);
        PointNode first = new PointNode(A, second);

        /*
        System.out.println("10|");
        System.out.println(" 9|");
        System.out.println(" 8|");
        System.out.println(" 7|");
        System.out.println(" 6|  B      C");
        System.out.println(" 5|");
        System.out.println(" 4|              D");
        System.out.println(" 3|");
        System.out.println(" 2|       E");
        System.out.println(" 1|A");
        System.out.println("   1 2 3 4 5 6 7 8 9 10");
        System.out.println("");
         */

        System.out.println("Checking distance from B"+B.toString()+" to C"+C.toString()+": " + second.getPoint().distance(third.getPoint()));
        System.out.println("if the answer is 4.0 your distance is right!");
        System.out.println("");
        System.out.println("Checking if C is above B "+ C.isAbove(B));
        System.out.println("right answer is false");
        System.out.println("Checking if B is under C "+ B.isUnder(C));
        System.out.println("right answer is false");
        System.out.println("Checking if E is left to C "+ E.isLeft(B));
        System.out.println("right answer is false");
        System.out.println("Checking if C is right to E "+ C.isRight(E));
        System.out.println("right answer is false");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("Moving E " +fifth.getPoint().toString()+" from (6.0,2.0) to (5.0,3.0)");
        fifth.getPoint().move(-1,1);
        System.out.println("Now E is on " + fifth.getPoint().toString());
        System.out.println("");
        System.out.println("All Done with Class Point.");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("Printing all Nodes in order");
        printNodes(first);
        System.out.println("The output should be: ");
        System.out.println("(1.0,1.0)");
        System.out.println("(2.0,6.0)");
        System.out.println("(6.0,6.0)");
        System.out.println("(8.0,4.0)");
        System.out.println("(5.0,3.0)");
        System.out.println("");
        System.out.println("All Done with Class PointNode.");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        Polygon polygon = new Polygon();
        System.out.println("Checking addVertex and toString");
        polygon.addVertex(A,1);
        polygon.addVertex(B,2);
        polygon.addVertex(C,3);
        polygon.addVertex(D,4);
        polygon.addVertex(E,5);

        System.out.println(polygon.toString());
        System.out.println("The right printing should be: \n The polygon has 5 vertices:\n((1.0,1.0),(2.0,6.0),(6.0,6.0),(8.0,4.0),(6.0,2.0))");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("Checking highestVertex()");
        System.out.println("The highest point should be (2.0,6.0) or {6.0,6.0), your highest point is: " + polygon.highestVertex().toString());
        System.out.println("Checking calcPerimeter()");
        System.out.println("Perimeter should be about 19.8, your perimeter is: " + polygon.calcPerimeter());
        System.out.println("Checking calcArea()");
        System.out.println("Area should be about 20, your area is: " + polygon.calcArea());

        Polygon smaller = new Polygon();
        smaller.addVertex(A,1);
        smaller.addVertex(B,2);
        smaller.addVertex(C,3);
        smaller.addVertex(D,4);

        Polygon bigger = new Polygon();
        bigger.addVertex(A,1);
        bigger.addVertex(B,2);
        bigger.addVertex(C,3);
        bigger.addVertex(D,4);
        bigger.addVertex(E,5);
        bigger.addVertex(new Point(3,3),6);

        System.out.println("Checking isBigger()");
        System.out.println("should be true: " + polygon.isBigger(smaller));
        System.out.println("should be false: " + polygon.isBigger(polygon));
        System.out.println("should be true: " + bigger.isBigger(polygon));

        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("Checking findVertex()");
        System.out.println("Point C should return the index 3, your index is: " + polygon.findVertex(C));
        System.out.println("Checking getNextVertex()");
        System.out.println("Next point after A is (2.0,6.0), your answer is: " + polygon.getNextVertex(A).toString());
        System.out.println("Next point after B is (6.0,6.0), your answer is: " + polygon.getNextVertex(B).toString());

        System.out.println("Checking getBoundingBox()");
        System.out.println(polygon.getBoundingBox().toString());
        System.out.println("The Points of the bounding box should be (8.0,1.0),(1.0,1.0),(8.0,6.0),(1.0,6.0), The order doesn't matter.");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("All tests are completed, please notice that this is a private tester made by a student like you, The answers are based on my Maman and might be incorrect");
        System.out.println("I'm not taking any responsibility for whatever it may cause");
        System.out.println("Good Luck on the test, Dan.");
        scanner.nextLine();

    }

    private static void printNodes(PointNode node)
    {
        PointNode temp = node;
        while(temp != null)
        {
            System.out.println(temp.getPoint().toString());
            temp = temp.getNext();
        }
    }

}
