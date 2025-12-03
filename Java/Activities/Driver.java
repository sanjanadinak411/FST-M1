package activitiies;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb=new MountainBike(0, 3, 30);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(20);
	    mb.applyBrake(5);
	    System.out.println(mb.gears);
	    System.out.println(mb.currentSpeed);
	}

}
