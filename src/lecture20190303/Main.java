package lecture20190303;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		boolean run1, run2 = false;
		
		if(num1 == num2){
			run1 = true;
			run2 = false;
			System.out.println(run1);
			System.out.println(run2);
			
		}else if(num1 != num2){
			run1 = false;
			run2 = true;
			System.out.println(run1);
			System.out.println(run2);
		}		
		
		scanner.close();
	}

}


