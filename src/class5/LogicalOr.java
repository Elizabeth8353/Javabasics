package class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String day="sunday";

if(day.equals("saturday") || day.equals("sunday")) {
	System.out.println("Today I have a Java class at Synatx");
}
System.out.println("The end");


System.out.println("----------------more examples------------------");

/*if day is 1 or 5-------> I am off from Syntax
 * if day 2to 3 ------>GIT classes
 * if day is 4 ---->Review Classes 
 * if day 6 to 7 ---->java class
 * evrything else will be invalid day
 */
Scanner scan=new Scanner(System.in);
System.out.println("Please enter todays day using numbers only");

int today=scan.nextInt();

if(today==1 && today==5) {
	System.out.println("I am off from syntax");
}else if(today==2 || today==3) {
	System.out.println("today git class");
}else if(today==4) {
	System.out.println("today is review class");
}else if(today==6 || today==7) {
	System.out.println("today is java class");
}else {
	System.out.println("please enter valid number");
}



	}

}
