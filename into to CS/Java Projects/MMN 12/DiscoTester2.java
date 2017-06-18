public class DiscoTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	LightBulb b1=new LightBulb(0,100,0);
	        LightBulb b2= new LightBulb(new RGBColor(100,2,15));
	        LightBulb b3=new LightBulb(b2);
	        LightBulb b4=new LightBulb(500,100,20);
	        
	        Disco d1 = new Disco(b1,b2,b3,b4);
			Disco d2 = new Disco(new LightBulb(400,200,20),b2,b3,b4);
			Disco d3 = new Disco(b4,b4,b4,b4);
			
			System.out.println("Testing get functions. ---------------------");
			if(d1.getFirstBulb().toString().equals(d2.getFirstBulb().toString())){
				System.out.println("[X]");
			}else{
				System.out.println("[V]");
			}
			if(d1.getSecondBulb().toString().equals(d2.getSecondBulb().toString()) ){

				System.out.println("[V]");
			}else{

				System.out.println("[X]");
			}
			if(d1.getThirdBulb().toString().equals(d2.getThirdBulb().toString())){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			if(d1.getFourthBulb().toString().equals(d2.getFourthBulb().toString())){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}

			System.out.println("Testing switchBulb ---------------------");
			boolean bol;
			
			
			
			bol = d1.getFirstBulb().isSwitchedOn();
			d1.switchBulb(1);
			if(d1.getFirstBulb().isSwitchedOn() == bol ){
				System.out.println("[X]");
			}else{
				System.out.println("[V]");
			}
			
			bol = d1.getSecondBulb().isSwitchedOn();
			d1.switchBulb(2);
			if(d1.getSecondBulb().isSwitchedOn() == bol ){
				System.out.println("[X]");
			}else{
				System.out.println("[V]");
			}
			
			bol = d1.getThirdBulb().isSwitchedOn();
			d1.switchBulb(3);
			if(d1.getThirdBulb().isSwitchedOn() == bol ){
				System.out.println("[X]");
			}else{
				System.out.println("[V]");
			}
			
			bol = d1.getFourthBulb().isSwitchedOn();
			d1.switchBulb(4);
			if(d1.getFirstBulb().isSwitchedOn() == bol ){
				System.out.println("[X]");
			}else{
				System.out.println("[V]");
			}
			
			System.out.println("Testing turnAllOn ---------------------");
			d1.turnAllOn();
			
			if(d1.getFirstBulb().isSwitchedOn() == true ){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			if(d1.getSecondBulb().isSwitchedOn() == true ){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			if(d1.getThirdBulb().isSwitchedOn() == true ){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			if(d1.getFourthBulb().isSwitchedOn() == true ){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			
			System.out.println("Testing turnAllOff ---------------------");
			d1.turnAllOff();
			
			if(d1.getFirstBulb().isSwitchedOn() == false ){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			if(d1.getSecondBulb().isSwitchedOn() == false ){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			if(d1.getThirdBulb().isSwitchedOn() == false ){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			if(d1.getFourthBulb().isSwitchedOn() == false ){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
		
			System.out.println("Testing areAllOff --------------------- This test only works if turnAllOff test passed!");
			d1.turnAllOff();
			if(d1.areAllOff() == true){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			
			System.out.println("Testing areAllOn --------------------- This test only works if turnAllOn test passed!");
			d1.turnAllOn();
			if(d1.areAllOn() == true){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
			
			System.out.println("Testing allSameColor ---------------------");
			if(d1.allSameColor() == true){
				System.out.println("[X]");
			}else{
				System.out.println("[V]");
			}
			if(d3.allSameColor() == true){
				System.out.println("[V]");
			}else{
				System.out.println("[X]");
			}
	}

}