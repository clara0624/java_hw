package lecture20190505;

public class Lectrue01 {
	public static int plus(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
		
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
		
	public static int multiply(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static int division (int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10; int number2 = 5;
		
		int  plus = plus(number1,number2);
		System.out.println(plus);
	
		
		int  minus = minus(number1,number2);
		System.out.println(minus);
		
		
		int multiply  = multiply(number1,number2);
		System.out.println(multiply);
		
		int division  = division(number1,number2);
		System.out.println(division);
		
		
		

	}

}
