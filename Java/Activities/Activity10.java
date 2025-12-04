package activitiies;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashSet<String> hs = new HashSet<>();
		 
		 hs.add("sandy");
		 hs.add("maddy");
		 hs.add("Braddy");
		 hs.add("leano");
		 hs.add("Peri");
		 hs.add("Nadal");
		 
		 System.out.println("the size of the Hashset is " + hs.size());
			
		 System.out.println("the element is removed " + hs.remove("leano")); 
		 
		 System.out.println("check that the element is removed " + hs.remove("Nadi"));
		 
		 System.out.println("check if the element is present " + hs.contains("Nadi"));
		 
		 for(String item: hs) {
			 
			 System.out.println(item);  
		 }
		 
	}

}
