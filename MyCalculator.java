package week1.day2.assignments;

public class MyCalculator {
	public static void main(String[]args)
	{
		Calculator cal=new Calculator();
		int add = cal.add(3, 4, 12);
		int sub = cal.sub(25, 10);
		double mul = cal.mul(35.5, 10.34);
		float divide = cal.divide(45, 2);
		
		System.out.println("Addition"+ add);
		System.out.println("Subtraction"+ sub);
		System.out.println("Multiplication"+mul);
		System.out.println("Division"+divide);
	}
	
	

}
