package class7;

import java.util.Scanner;

public class hw6 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

System.out.println("Enter name of instructor");
String name=scan.nextLine();
String message;

switch(name) {

case "Asghar":
	message="Will take care of Java Assigment";
break;
case "Moazam":
message="Will take care of SDLC Assigment";
break;
case "Weqas":
	message="Will take care of Selenium Assignment";
break;
case "Asel":
	message="Will take care of every Assignment";
break;
	default:
	message="Invalid instructor selected";
	
}
System.out.println(message);
	}

}
