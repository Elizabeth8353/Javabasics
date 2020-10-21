package class4;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
boolean rain=scan.nextBoolean();
if(rain) {
	System.out.println("take an umbrella");
}else {
	System.out.println("enjoy your day");
}


System.out.println("enter your name");
String name=scan.nextLine();
System.out.println("my name is="+name);



	}

}
