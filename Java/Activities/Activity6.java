package activitiies;

import java.util.ArrayList;

public class Activity6 {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Plane plane=new Plane(10);
		String[] name1={"sama","ana","kria","ansh","mery","berry","uni","appi","cle"};
		plane.onboard(name1);
		plane.getPassengers();
		System.out.println("the plane took off at " +plane.takeOff());
		Thread.sleep(5000);
		plane.land();
		System.out.println("the plane landed at " +plane.getLastTimeLanded());
		
	}

}
