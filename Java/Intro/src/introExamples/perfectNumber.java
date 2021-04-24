package introExamples;

public class perfectNumber {

	public static void main(String[] args) {
		
		int number = 58;
		int total = 0;
		
		for(int i=1;i<number;i++) {
			if(number % i ==0) {
				total+=i;
			}
		}
		
		if(total == number) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Perfect Number is not");
		}
		
	}

}
