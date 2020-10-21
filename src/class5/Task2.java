package class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program that will read three input of scores (quiz,midterm,and final scores)
 * and determine that grade based on the fallowing rules: if the average score >=90->grade=A
 * if average score >=70 and <90->grade=B if the average score>=50 and 70->grade=c if the 
 * average score<50->grade = F
 */
		
		Scanner scan;
		int quiz,midTerm,finalScore, avg;
		
		scan=new Scanner(System.in);
		
		System.out.println("pleases enter your score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter your mid term score");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter your final score");
		finalScore=scan.nextInt();
		
		avg=(quiz+midTerm+finalScore)/3;
		System.out.println(avg);
		
		if(avg>90) {
			System.out.println("Grade A");
			System.out.println("great job");
		}else if(avg>=70 && avg<90) {
			System.out.println("Grade B");
			System.out.println("great job");
		}else if(avg>=50 && avg<70) {
			System.out.println("Grade C");
		}else if(avg>=40 && avg<50) {
			System.out.println("Grade D");
		}else {
			System.out.println("Grade F");
		}
		
		// if grade is A or B your great student 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("--------------------task 2--------------------------");
		
		/*write a program for uesr to enter his/her birth month, based on the month
		 * define the season. Example
		 */
	}

}
