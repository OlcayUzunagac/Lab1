package day14_methodsPart2;

public class Lab1_Question4 {

	public static void main(String[] args) {
		// olcay // Jun 15, 2020
		
		//Question-4

/*The deers in VA spend most of the day playing. In particular, they play if the temperature is between 60 and 90.
 *  Unless it is summer, 
 * then the upper limit is 100 instead of 90.
 * Write a method that accepts temperature and a boolean isSummer, prints true if the deers play and false otherwise.*/

		playOrNot(70, false); 
		playOrNot(95, false); 
		playOrNot(95, true);
	}

	private static void playOrNot(double temperature, boolean isSummer) {
	
		if(isSummer) {
			if(temperature>60 && temperature<100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(temperature>60 && temperature<90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		


}