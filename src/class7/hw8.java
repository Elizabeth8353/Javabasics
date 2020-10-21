package class7;

import java.util.Scanner;

public class hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the roll number of the child");
		int num;
		String message;
		num=scan.nextInt();

		switch(num) {
		case 101:
			message="Student name: Ramesh";
			break;
		case 102:
			message="Student name: Mahesh";
			break;
		case 103:
			message="Student name: Mukesh";
			break;
		default:
			message="Not found Student name: in Class";
			
		}
		System.out.println(message);
	}

}
