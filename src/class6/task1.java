package class6;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean sale;
double price;
double discount;
double finalPrice;
Scanner scan=new Scanner(System.in);
System.out.println("Please tell me if sale today");
sale=scan.nextBoolean();

if(!sale) {
	System.out.println("no shopping");
}else {

    if (sale) {
        System.out.println("Please enter the price");
        price = scan.nextDouble();
        if (price >= 10 && price < 50) {
            discount = price * 0.1;
        } else if (price >= 50 && price < 100) {
            discount = price * 0.2;
        } else if (price >= 100 && price < 500) {
            discount = price * 0.4;
        } else if (price >= 500) {
            discount = price * 0.5;
        } else {
            discount = 0;
        }
        finalPrice = price - discount;
        System.out.println("Your product price is $" + price + " and you get $" + discount + " discount."
                + " and you pay only " + finalPrice);
    } else {
        System.out.println("No shopping!! ");

}
}

	}

}
