package lecture20190609;

import java.util.Scanner;
public class Solution01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num = 0; // 초기값을 0으로 설정 (나머지 자리 숫자)
		 int sum = 0; // 초기값을 0으로 설정 (마지막 자리 숫자)
		 
		 System.out.println("숫자를 입력해주세요");
		 Scanner scanner = new Scanner(System.in);
		 String temp = scanner.nextLine();
		 //입력받은 숫자를 temp에 저장
		 num = Integer.parseInt(temp);
		 //입력받은 문자열을 숫자로 변환하여 num에 저장
		 
		 //num이 0이 아닐때까지 반복
		 while(num != 0) {
			 sum += num % 10; // sum = sum + num %10
			 //num을 10으로 나눈 나머지를 sum에 저장
			 System.out.println("sum="+sum+","+"num"+num);
			 num /= 10; // num = num/10
			 //num을 10으로 나눈 나머지를 num에 저장
		 }
		 
		 
		 System.out.println("각자리수의 합 :"+sum);
		 
		 //반복문 종료후 각자리 수의 합계 출력

	}
}


	


