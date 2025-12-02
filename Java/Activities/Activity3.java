package activitiies;

public class Activity3 {


	public static void main(String[] args) {
	
		double earth_seconds=31557600;
		double mercury_earth_years=0.2408467;
		double venus_earth_years=0.61519726;
		double mars_earth_years=1.8808158;
		double jupiter_earth_years=11.862615;
		double saturn_earth_years=29.447498;
		double uranus_earth_years=84.016846;
		double neptune_earth_years=164.79132;
		
		double seconds=1000000000;
		
		System.out.println("The age in mercury is " + (seconds/earth_seconds)*mercury_earth_years);
	}
	}