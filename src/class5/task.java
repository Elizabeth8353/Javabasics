package class5;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter number of years");

int years=scan.nextInt();

if(years>=5) {
	System.out.println("You are elible for bonus");
	System.out.println("What is you annual salary?");
	int salary=scan.nextInt();
	if(salary>=50000) {
		System.out.println("Your bonus=5000");
	}else {
		System.out.println("Your bonus=3000");
	}
}else {
	System.out.println("Your not elible");
}
	}

}
