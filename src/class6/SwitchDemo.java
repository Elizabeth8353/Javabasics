package class6;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * lets ask out tester on which browser they want to use
		 * 
		 */
	Scanner scan;
	String browser;
	String message;
	scan=new Scanner(System.in);
	System.out.println("Please enter a browser");
	browser=scan.nextLine();
	
	switch(browser.toLowerCase()){
	case "safari":
		message="you code will be executed on safari browser";
		break;
		case "chrome":
			message="you code will be executed on chrome";
			break;
		case "firefox":
			message="you code will be executed on firefox";
			break;
			default:
				message="entered browser is not supported";
				
					
				}
	System.out.println(message);
	}
	
	}


