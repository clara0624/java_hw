package lecture20190505;

public class Lectrue02 {
	
	public static int calculator(int num1 , int num2, char type) {
		int result = 0;
		
		if(type == 'p')  {
			result =  num1 + num2 ;
		}else if(type == 'm') {
			result = num1 - num2;
		}else if(type == 'd')  {
			result = num1 / num2 ;
		}else if(type == 't') {
			result = num1 * num2;
		}
		return result;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int plus = calculator(10,20, 'p');
		System.out.println(plus);
		
		int minus = calculator(10,20, 'm');
		System.out.println(minus);
		
		int multiply = calculator(10,20, 'd');
		System.out.println(multiply);
		
		int division = calculator(10,20, 't');
		System.out.println(division);
		
	}

}
