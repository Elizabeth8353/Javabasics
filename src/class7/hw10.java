package class7;

import java.util.Scanner;

public class hw10 {

	public static void main(String[] args) {

		Scanner scan;
		String model;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter favorite car make");
		model=scan.nextLine();
		String carOrigin;
		
		switch(model.toUpperCase()){
		case "BMW":
			carOrigin="german car";
			break;
			
			case "TOYOTA":
				carOrigin="japanese car";
				break;
				
			case "MASERATI":
				carOrigin="italian car";
				break;	
				
				default:
					carOrigin="unknown";
					break;
						
					}
		System.out.println("Your favorite car is "+carOrigin);
		
		
		
		
	}

}
