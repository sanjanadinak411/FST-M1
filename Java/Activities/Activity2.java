package activitiies;

public class Activity2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=0;
		
		int res=30;
		
		int[] numbers= {10, 77, 10, 54, -11, 10};
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==10) {
				value=value+numbers[i];
			}
		}
		
		if(value==res){
			System.out.println("The value is equal to 30");
		}
		else {
			
			System.out.println("The value is not equal to 30");
		}
	}

}
