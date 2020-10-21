package class1;

public class relasionalOpperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;

		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true

		int x=100;
		int y=90;
		boolean result=x>y;
		System.out.println(x>y);

		result=x==y;
		System.out.println(result);

		System.out.println(x==y);//compare (false)
		System.out.println(x=y);// reassining value of y to variable x
		System.out.println(x);// 90

		boolean result1=x==y;// on line 24 we reasinged the value of x
		System.out.println(result1);//true
	}

}
