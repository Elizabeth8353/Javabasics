package class4;

import java.util.Scanner;

public class hw7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner scan=new Scanner(System.in);

System.out.println("Please enter your age");

int num=scan.nextInt();

if(num>=18) {
	System.out.println("You are eligible to vote");
	}else if(num<=16) {
		System.out.println("You are not eligible to vote");
	}
	
	}
}
