package lecture20190505;

public class Lecture06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) { //i가 0이거나 10보다 작거나 같으면 1을 더해주는 것을 반볷한다
			for (int j = 0; j <= 10; j++) {//j가 0이거나 10보다 작거나 같으면 1을 더해주는 것을 반복한다

				if (((2 * i) + (4 * j)) == 10) {// 만약 2*i + 4*j가 10이라면
					System.out.print("x  : " + i + "\t"); // x : i (여기서 i는 숫자) 를 출력
					System.out.println("y  : " + j); // y:j(여기서 j는 숫자)를 출력
				}

			}
		}
	}
}
