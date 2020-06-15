package day14_methodsPart2;

public class Lab1_Question2 {

	public static void main(String[] args) {
		// olcay // Jun 15, 2020
		
		//Question-2

				//The number 6 is a truly great number. Write a method that accepts num1 and num2, 
				//-prints true if either one is 6. Or if their sum or difference is 6.

				//love6(6, 4) → true
				//love6(4, 5) → false
				//love6(1, 5) → true
				//love6(12, 6); ->true
		
		
		
		love66(6,4);
		love66(4,5);
		love66(1,5);
		love66(6,12);
		
	}

	public static void love6(int i, int j) {
		
		
		if(i==6 || j ==6) {
			System.out.println(true);
		}else if(i-j==6 || i+j==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}


	}
	
	public static void love66(int num1, int num2) {
		
		if(num1==6 || num2==6 || num1+num2==6 || num1-num2==6) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		
		
		
		
		
	}
	
}
