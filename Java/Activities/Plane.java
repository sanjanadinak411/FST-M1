package activitiies;

import java.util.ArrayList;
import java.util.Date;

public class Plane {
	
	private int passengernumber;
	private String passenger2;
	private String passenger_name;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	public ArrayList<String> name2=new ArrayList<>();

	public Plane(int maxPassengers) {
		
		passengernumber=maxPassengers;
	}
	
	public void onboard(String[] passname) {
		
		
		
		for(int i=0;i<passname.length;i++) {
			
			passenger_name=passname[i];
			
			name2.add(passenger_name);
		}
		
		
	}
			public void getPassengers(){
				
				 for (String item : name2) {
					System.out.println("The name of passenger is "  + item);
			        }
				
			}
		
		
	
	public Date takeOff() {
		
		this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
		
	}
	
	
	public void land() {
		
		this.lastTimeLanded = new Date();
		name2= null;
        
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
}


