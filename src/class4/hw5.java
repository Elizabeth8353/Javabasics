package class4;

import java.util.Scanner;

public class hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 	Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	 if(num>0) {
	  		System.out.println(num+" "+ "is possitive"); 
	  	 }else if(num<0) {
	  		 System.out.println(num + "is negative");
	  	 }else {
	  		 System.out.println("Entered number is equal to 0");
	  	 }
	  		 
	}
}
