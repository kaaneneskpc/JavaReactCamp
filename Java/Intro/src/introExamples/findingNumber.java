package introExamples;

public class findingNumber {

	public static void main(String[] args) {
		
		int[] number = new int[]{1,3,5,7,9,11};
		int findNumber = 3;
		boolean isThere = false;
		
		for(int num : number) {
			if(num==findNumber) {
				isThere = true;
				break;
			}
			
		}
		if(isThere) {
			System.out.println("Number is there");
		}
		else {
			System.out.println("Number isn't there");
		}

	}

}
