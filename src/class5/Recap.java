package class5;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan;
	String answer;	
		double balance;
		
scan=new Scanner(System.in);
System.out.println("Please enter if you have a credit card(true/false)");

answer=scan.nextLine();

if(answer.equals("yes")) {
	System.out.println("What is the balance on your caard?");
	balance=scan.nextDouble();
	if(balance>1000) {
	}
	System.out.println("You can spend more money$$");
}else {
	System.out.println("Would you like a credit card");
}

	}

}
