package lecture20190303;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        int[] numbers = new int[3];
	        
	        for(int i=0; i<numbers.length; i++){
	            numbers[i] = scanner.nextInt();
	        }
	        
	        if(numbers[0] > numbers[1] && numbers[0] > numbers[2]){
	            System.out.print("true");
	        }else{
	            System.out.print("false");
	        }
	        
	        if(numbers[0]==numbers[1] && numbers[0]==numbers[2]){
	            System.out.println(" " + "true");
	        }else{
	            System.out.println(" " + "false");
	        }
	 
	        scanner.close();
	    }
	 
	

	}


