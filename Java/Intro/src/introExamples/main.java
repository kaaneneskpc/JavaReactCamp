package introExamples;

public class main {

	public static void main(String[] args) {
	
          int number = 25;
          int remain = number % 2;
          boolean isPrime = true;
          
          for(int i=2;i<number;i++) {
        	  if(number%i==0) {
        		  isPrime = false; 
        	  }
          }
          
          if(isPrime==true) {
        	  System.out.println("Number is prime");
          }
          else {
        	  System.out.println("Number isn't prime");
          }
          
	}

}
