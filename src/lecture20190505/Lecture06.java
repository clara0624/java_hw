package lecture20190505;

public class Lecture06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) { //i�� 0�̰ų� 10���� �۰ų� ������ 1�� �����ִ� ���� �ݓ��Ѵ�
			for (int j = 0; j <= 10; j++) {//j�� 0�̰ų� 10���� �۰ų� ������ 1�� �����ִ� ���� �ݺ��Ѵ�

				if (((2 * i) + (4 * j)) == 10) {// ���� 2*i + 4*j�� 10�̶��
					System.out.print("x  : " + i + "\t"); // x : i (���⼭ i�� ����) �� ���
					System.out.println("y  : " + j); // y:j(���⼭ j�� ����)�� ���
				}

			}
		}
	}
}
