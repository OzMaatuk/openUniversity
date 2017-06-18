/**
 * Tester for The Open university assignment 15
 * 
 * @author Ophir Haramaty
 * 
 * @version 19.1.15
 */
public class Tester
{
    
    /**
     * The main method for testing the project
     */
    
    public static void test(){
        
        System.out.println("Tests All simple method for Point:");
        
        Point a = new Point(3,4);
        
        Point b = new Point(4,2);
        
        Point c = new Point(a);
        
        System.out.println("Point a: "+a+"\nPoint b: "+b+"\nPoint c: "+c);
        
        a.setX(6);
        
        System.out.println("After setting x of a as 6 \nPoint a: "+a+"\nPoint b: "+b+"\nPoint c: "+c);
        
        if(a.equals(c)){
            
            System.out.println("You have an aliasing problem!");
            
        }else{
            
            System.out.println("Aliiasing issues have been taken care! Good!");
            
            System.out.println("a is above b. Your program said:  "+a.isAbove(b));
            
            System.out.println("a is right to b. your program said: "+a.isRight(b));
        
        }
        
        System.out.println("Creating an empty Polygon: ");
        
        Polygon poly = new Polygon();
        
        System.out.println(poly);
        
        final int size = 10;
        
        for(int i = 1; i <= size;i++){
            
            Point p = new Point(i,i);
            
            int pos = (int)(Math.random()* i + 1);
            
            System.out.println("inserting "+p+" to pos: "+pos);
            
            poly.addVertex(p,pos);
            
            System.out.println("Now: "+poly);
            
        }
            
            System.out.println("Is it make sense?");
            
            poly = new Polygon();
            
            poly.addVertex(new Point(-2,0),1);
            
            poly.addVertex(new Point(2,0),2);
            
            poly.addVertex(new Point(2,2),3);
                        
            poly.addVertex(new Point(-2,2),4);
            
            System.out.println("Checking calculation on this polygon:\n***********************"+poly+"************************");
            
            double area = poly.calcArea();
            
            double perimeter = poly.calcPerimeter();
            
            boolean vA = Math.abs(8-area)<0.1;
            
            boolean vP = Math.abs(12-perimeter)<0.1;
            
            System.out.println("Your calculation:\nArea: "+area+"."+vA+"!\nPerimeter: "+perimeter+"."+vP+"!");
            
            System.out.println("Same rectangle but may in fifferent order"+" is this: \n"+poly.getBoundingBox());
            
            System.out.println("Highest point: "+poly.highestVertex());
            
            System.out.println("index of The highest is: "+poly.findVertex(poly.highestVertex())+" and the point after it in the order is: "+poly.getNextVertex(poly.highestVertex()));
            
            System.out.print("After the last point you supposed to get the first one. ");
            
            Point first = poly.getNextVertex(new Point(-2,2));
            
                        System.out.println("The first by that logic is: "+first);
                        
                        if(first.equals(new Point(-2,0))){
                            
                            System.out.println("You have Passed the test!");
                            
                        }else{
                            
                            System.out.println("You Have failed!");
                            
                        }
          
         
            
           System.out.println("\n\n\n\n\t\t Did you pass all the tests ? ? ?"); 
           
            
    }
    
    
    
    
    
}