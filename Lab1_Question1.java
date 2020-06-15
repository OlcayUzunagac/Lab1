package day14_methodsPart2;

public class Lab1_Question1 {

	public static void main(String[] args) {
		// olcay // Jun 15, 2020
		
		//Question-1

//Write a method that accepts a string and a non-negative number,
//		and prints a larger string that is number copies of the original String

				//stringTimes("Hi", 2); = > HiHi
				//stringTimes("Hi", 3); = > HiHiHi
				//stringTimes("Hi", 1); = > Hi
		
		
		stringTimes("Hi", 1);
		stringTimes1("Hi", 5);
		
	}

	private static void stringTimes(String string, int i) {
		
		int number=0;
		while(number<i) {
			
			System.out.print(string);
			
			number++;
		}
		
		System.out.println();
	}
	
	
	private static void stringTimes1(String string, int number) {
		
		String str = "";
		
		for(int i=0; i<number; i++) {
			str = str+string;
		}
		
		System.out.println(str);
		
	}
	
}
