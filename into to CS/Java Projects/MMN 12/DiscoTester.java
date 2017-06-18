/**
 * User: EA
 * Date: 13/09/12
 * Time: 19:07
 */
public class DiscoTester {
    public static void main(String[] args) {
        LightBulb lightBulb1 = new LightBulb(new RGBColor());
        LightBulb lightBulb2 = new LightBulb(new RGBColor(255, 255, 255));
        LightBulb lightBulb3 = new LightBulb(127, 127, 0);
        LightBulb lightBulb4 = new LightBulb(lightBulb3.getColor());

        Disco disco = new Disco(lightBulb1, lightBulb2, lightBulb3, lightBulb4);
        
        LightBulb l1 = disco.getFirstBulb();
        LightBulb l2 = disco.getSecondBulb();
        LightBulb l3 = disco.getThirdBulb();
        LightBulb l4 = disco.getFourthBulb();
        
        System.out.println(disco.areAllOn());
        System.out.println(disco.areAllOff());

        disco.turnAllOn();
        System.out.println(disco.areAllOn());
        System.out.println(disco.areAllOff());
        disco.switchBulb(0);
        System.out.println(disco.areAllOn());
        System.out.println(disco.areAllOff());
        disco.turnAllOff();

        System.out.println(disco.allSameColor());

    }
}
