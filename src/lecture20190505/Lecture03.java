package lecture20190505;

public class Lecture03 {
	
	public static int pay(int num1,int num2,double num3) {
		
		int result = (int) (num1 + num2 - num3);
		return result;
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 1500000;
		int number2 = 55000;
		
		int pay;
		
		double number3 = number1 * 0.1;
	    pay = pay(number1,number2,number3);
		System.out.println(pay);
		
		
		

	}

}
