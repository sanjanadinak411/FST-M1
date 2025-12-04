package activitiies;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String > colours  = new HashMap<>();
		
		colours.put(1, "black");
		colours.put(2, "white");
		colours.put(5, "red");
		colours.put(7, "yellow");
		colours.put(8, "pink");
		
		colours.remove(8,"pink");
		
		System.out.println("the color green is present " + colours.containsValue("green"));
		
		System.out.println("the size of the map is "  + colours.size());
		
	}

}
