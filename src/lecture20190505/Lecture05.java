package lecture20190505;

import java.util.Scanner;

public class Lecture05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = 0; // ���� menu�� 0���� �ʱ�ȭ
		int num = 0; //���� num�� 0���� �ʱ�ȭ
		Scanner scanner = new Scanner(System.in); // scanner���� �Է�
		outer: while (true) { // 
			System.out.println("(1) sqare"); //(1)sqare�� ���
			System.out.println("(2) sqare root"); //(2) sqare root�� ���
			System.out.println("(3)log"); //(3)log�� ���
			System.out.print("���ϴ� �޴� ����(1~3)�� �����ϼ��� (���� :0)");//���ϴ� �޴� ����(1~3)�� �����ϼ��� (���� :0)�� ���
			
			String tmp = scanner.nextLine(); 
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) { //���� menu�� 0�̶��
				System.out.println("���α׷��� �����մϴ�"); //���α׷��� �����մϴٸ� ���
				break; //����
			} else if (!(1 <= menu && menu <= 3)) { // ���� menu�� 1�̳� 3�� �ƴ϶��
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�(����� 0)"); //�޴��� �߸� �����ϼ̽��ϴ�(����� 0)�� ���
				continue; //����
			}
			for(;;) { //�ݺ�
				System.out.print("����� ���� �Է��ϼ���(��� ����:0,��ü����:99)"); //����� ���� �Է��ϼ���(��� ����:0,��ü����:99)�� ���
				
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if (num == 0) //���� num�� 0�̶��
					break; //����
				if (num == 99) //���� num�� 99���
					break outer;//����

				switch (menu) { 
				case 1: //���̽� 1
					System.out.println("result" + num * num); //���� ������ ���
					break;//����
				case 2: //���̽�2
					System.out.println("result" + Math.sqrt(num)); //���� �������� ���
					break;//����
				case 3: //���̽�3
					System.out.println("result" + Math.log(num)); //���� �α׸� ���
					break;//����
				}
			}
		}
	}
}
		

	


