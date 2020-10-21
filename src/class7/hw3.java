package class7;

import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
System.out.println("Are you thristy?");
boolean thirsty=scan.nextBoolean();

System.out.println("Are you sleepy");
boolean sleepy=scan.nextBoolean();

String drink;

if(thirsty && !sleepy) {
	drink="water";
	
}else if(thirsty&&sleepy) {
	drink="coffee";
}else if(!thirsty&&sleepy) {
	drink="Tea";
}else {
	drink="Nothing";
}
System.out.println("Looks like you need to drink "+drink);

	}

}
