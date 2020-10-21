package class4;

import java.util.Scanner;

public class hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Please enter the length");
int L=scan.nextInt();
System.out.println("Please enter the width");
int W=scan.nextInt();

if(L>W) {
	System.out.println("The shape of your object is a rectangle");
}else if(L==W){
	System.out.println("The shape of your object is a square");
}

}
}