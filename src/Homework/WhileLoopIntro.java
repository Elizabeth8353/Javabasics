package Homework;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=15;
		// Test comment

		if(time>12) {//condition is true code will execute 1 time
			System.out.println("good day");
		}
System.out.println("--------------------------------WhileLoop-------------------------------------------------------");
		
	//while (time>12) {
			//System.out.println("good day");//Infinite loop
			//time++;
		//}
	while (time>12) {
		System.out.println("good day");// print=3
		time--;
	}
	System.out.println("--------------------------------------------");
	//print 1 to 50
	
	int num=0;
	
	while(num<51) {
		System.out.println(num);
		num++;
	}
	
	
	}

}
