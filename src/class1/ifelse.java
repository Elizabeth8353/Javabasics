package class1;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 * we need to compare 2 numbers:
			 * bigger,smalled or equal
			 */
					int num1=99;
					int num2=9;
					
					if(num1>num2) {//wat if this condition is true
						System.out.println(num1+"is bigger than"+num2);
					}else if(num1<num2) {//or wat if this condition is true
						System.out.println(num1+"is smaller than"+num2);
					}else {
						System.out.println(num1+"is equal to"+num2);
						
					}
					
					/*Based on the day of the week will will print class schedule
					 * 
					 */
				int day=7;
				if(day==1) {
					System.out.println("Today is monday we have no class");
				}else if(day==2) {
					System.out.println("today is tuesday we have manual class");
				}else if(day==3) {
					System.out.println("today is wednesday and we have manual class again");
				}else if (day==4) {
					System.out.println("today is thursday and we have review class");
				}else {
					System.out.println("Im tired");
				}
	}

}
