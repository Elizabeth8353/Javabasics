package class1;

public class nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=65;
		boolean assignment=true;
		if (assignment) {
			if(score>90) {
				System.out.println("you did great");
			}else if(score>70) {
				System.out.println("need to study more");
			}else if(score>80) {
				System.out.println("you did good");
			}else {
				System.out.println("good job for trying");
			}
		}else {
			System.out.println("complete all assignments");
		}
	}

}
