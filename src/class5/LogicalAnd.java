package class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		/*
		 * I need to define wether number that is entered from user 
		 * small number is a number between 1 to 10
		 * medium under is a number between 11 to 100
		 * larger number from 101 to 1000
		 */
		
		Scanner input;
		int number;
		
		input=new Scanner(System.in);
		System.out.println("Please enter any number");
		number=input.nextInt();
		
		if(number>0 && number<=10 ) {
			System.out.println("You entered a small number");
		}else if (number>10 && number<=100) {
			System.out.println("You enter midum number");
		}else if(number>100 && number<=1000) {
			System.out.println("You entered a large numbe r");
		}
		
		

	}

}
