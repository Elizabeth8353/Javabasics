package class7;

import java.util.Scanner;

public class AndOr {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

int quiz,mid,finalScore,avg;
 
System.out.println("Please enter your quiz score");
quiz=scan.nextInt();

System.out.println("Please enter your mid term");
mid=scan.nextInt();

System.out.println("Please enter your final score");
finalScore=scan.nextInt();
char grade;
avg=(quiz+mid+finalScore)/3;

if(avg>=90) {
	grade='A';
}else if(avg>=70 && avg<90) {
	grade='B';
}else if(avg>=50 && avg<70) {
	grade='C';
}else if(avg>=40 && avg<50) {
	grade='D';
}else {
	grade='F';
}

System.out.println("grade is ="+grade);

if(grade=='A' || grade=='B') {
	System.out.println("You are good student");
}else {
	System.out.println("Please study more");
}



	}

}
