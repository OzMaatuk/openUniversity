/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JFrame;

/**
 *
 * @author Shay
 */
public class DiscoFrame {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Disco");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // define the light bulbs - you can change the colors here
        // --
        LightBulb b1 = new LightBulb(0, 77, 260);
        LightBulb b2 = new LightBulb(50, 100, 0);
        LightBulb b3 = new LightBulb(77, 50, 250);
        LightBulb b4 = new LightBulb(-5, 230, 100);
        // --
        
        Disco disc = new Disco(b1, b2, b3, b4);
        DiscoPanel p = new DiscoPanel(disc);
        frame.add(p);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
