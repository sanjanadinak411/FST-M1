package activitiies;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color, String transmission, int make, int tyres, int doors) {
		this.tyres=tyres;
		this.doors=doors;
		this.make=make;
		this.color=color;
		this.transmission=transmission;
	}
	
	public void displayCharacteristics() {
	System.out.println("Number of tyres on the car: " + tyres);
	System.out.println("Number of doors on the car: " + doors);	
	System.out.println("Make of the Car: " + make);	
	System.out.println("Color of the Car: "+ color);	
	System.out.println("Transmission of the Car: " + transmission);	
	}
	
	public void accelarate() {
	System.out.println("Car is moving forward.");
	}
	
	public void brake() {
	System.out.println("Car has stopped.");
	}
}
