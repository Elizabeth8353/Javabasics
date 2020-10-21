package class1;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
/*variable for allergy -yess or no
 * if yes will check if  pet allergy
 * if pollen
 * if no alergy your lucky
 */
		
		boolean allergy=true;
		boolean petAllergy=true;
	
		if (allergy) {
			System.out.println("let do further check ");
			if(petAllergy) {
				System.out.println("no pets please");
			}else {
				System.out.println("yes to pets");
			}
			
			
		}else {
			System.out.println("you are lucky");
			
		}
		
		/*
		 * if its friday we will watch movie but would like to check the date
		 * and if it is not -->i will watch commedy,action
		 * if no friday-->i am studying
		 */
		
		boolean isFriday=false;
		int date=13;
		boolean monday=true;
		
		if(isFriday) {
			
			if(date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("Today is not friday, im studying");
			}
		}else {
			System.out.println("today is not friday");
				if(monday) {
					System.out.println();
			}
	}

}
