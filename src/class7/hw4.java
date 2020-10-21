package class7;

import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		 System.out.println("Is it the weekend?");
		boolean weekend=scan.nextBoolean();
		String subject;
		
		if(!weekend) {
			subject="Manual Testing";
		}else {
			subject="Java";
		}
		
		System.out.println("Today you will be learning "+subject);
		
	}

}
