package class4;

import java.util.Scanner;

public class hw12 {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in)	;
System.out.println("Please enter your gender:M or F");
char gender=scan.next().charAt(0);

System.out.println("Please enter your age");
int age=scan.nextInt();

if(gender=='M') {
	if(age>25) {
		System.out.println("Man");
	}else {
		System.out.println("Boy");
	}
}else {
	if(age>25) {
		System.out.println("Woman");
	}else {
		System.out.println("Girl");
	}
}


	}
	}


