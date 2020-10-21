package class7;

import java.util.Scanner;

public class HW11 {
	public static void main(String[] args) {
	System.out.println("Enter any number from 1-7");
	Scanner scan=new Scanner(System.in);
	int day;
	day=scan.nextInt();
    String today;
	        switch (day) {
	        case 1:
	            today = "Monday";
	            break;
	        case 2:
	            today = "Tuesday";
	            break;
	        case 3:
	            today = "Wednesday";
	            break;
	        case 4:
	            today = "Thursday";
	            break;
	        case 5:
	            today = "Friday";
	            break;
	        case 6:
	            today = "Saturday";
	            break;
	        case 7:
	            today = "Sunday";
	            break;
	        default:
	            today = "Invalid";
	            break;
	        }
	        
	        System.out.println(today);
		
		
	}

}
