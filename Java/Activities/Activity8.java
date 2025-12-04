package activitiies;

public class Activity8{
	
	static void exceptionTest(String input) throws CustomException{
		if(input==null) {
			throw new CustomException("input is null");
		}
		else {
			System.out.println(input);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Activity8.exceptionTest("london bridge");
			Activity8.exceptionTest(null);
		}
		
		catch(CustomException message){
			
			System.out.println("catch block is executed " + message.getMessage());
		}
		
		finally {
			
		}
	}
	

}
