package activitiies;
public class Activity1{
	
	public static void main(String[] args){
		
		Car benz = new Car("black","manual",2014,4,4);
		benz.make=2014;
		benz.color ="Black";
		benz.transmission="Manual";
		
		benz.displayCharacteristics();
		benz.accelarate();
		benz.brake();
				
	}
}