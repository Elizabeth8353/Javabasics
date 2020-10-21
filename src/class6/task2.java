package class6;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your grade");
		
		char grade = scanner.next().charAt(0);
		String score;
		switch (grade) {
		    case 'A':
		        score = "A-Excellnet";
		        break;
		    case 'B':
		        score = "B-Good";
		        break;
		    case 'C':
		        score = "C-Average";
		        break;
		    case 'D':
		        score = "D-Bad";
		        break;
		    default:
		        score = "Not Acceptable";
		        break;
		        }
		        System.out.println(score);

	}

}
