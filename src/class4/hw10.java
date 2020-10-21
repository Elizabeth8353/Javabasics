package class4;

import java.util.Scanner;

public class hw10 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=scan.nextInt();
		System.out.println("Enter your second number");
		int secnum=scan.nextInt();
		
		if(num*secnum>1) {
		System.out.println("True");
		
	}else {
             System.out.println("False");
}
	}
}