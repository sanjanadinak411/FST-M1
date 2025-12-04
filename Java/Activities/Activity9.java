package activitiies;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Chaya");
		myList.add("Chavi");
		myList.add("Charlie");
		myList.add("Ciya");
		myList.add("Chari");
		
		for(String item:myList) {
			
			System.out.println(item);
		}
		
		System.out.println("the retrieved name is "+myList.get(2));
		
		System.out.println("It contains the name " + myList.contains("Chavi")); 
		
		System.out.println("the size of the array is " + myList.size());
		
		myList.remove(2);
		
		System.out.println("the size of the array is " + myList.size());
		
	}

}
