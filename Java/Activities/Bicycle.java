package activitiies;

public class Bicycle implements BicycleParts, BicycleOperations{
	 public int gears;
	 public int currentSpeed;
	    
	public Bicycle(int gears,int currentSpeed){
		this.gears=2;
		this.currentSpeed=4;
		
	}

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		System.out.println("applybrake");
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		System.out.println("speedup");
	}

	@Override
	public int tyres() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maxSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
