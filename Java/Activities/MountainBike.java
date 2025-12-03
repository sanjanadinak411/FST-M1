package activitiies;

public class MountainBike extends Bicycle{
	
	int seatHeight;
	
	public MountainBike(int gears,int currentSpeed, int startHeight) {
		super(gears,currentSpeed);
			
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public boolean bicycleDesc() {
		return false;
		
	}
}
