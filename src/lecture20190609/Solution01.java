package lecture20190609;

import java.util.Scanner;
public class Solution01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num = 0; // �ʱⰪ�� 0���� ���� (������ �ڸ� ����)
		 int sum = 0; // �ʱⰪ�� 0���� ���� (������ �ڸ� ����)
		 
		 System.out.println("���ڸ� �Է����ּ���");
		 Scanner scanner = new Scanner(System.in);
		 String temp = scanner.nextLine();
		 //�Է¹��� ���ڸ� temp�� ����
		 num = Integer.parseInt(temp);
		 //�Է¹��� ���ڿ��� ���ڷ� ��ȯ�Ͽ� num�� ����
		 
		 //num�� 0�� �ƴҶ����� �ݺ�
		 while(num != 0) {
			 sum += num % 10; // sum = sum + num %10
			 //num�� 10���� ���� �������� sum�� ����
			 System.out.println("sum="+sum+","+"num"+num);
			 num /= 10; // num = num/10
			 //num�� 10���� ���� �������� num�� ����
		 }
		 
		 
		 System.out.println("���ڸ����� �� :"+sum);
		 
		 //�ݺ��� ������ ���ڸ� ���� �հ� ���

	}
}


	


