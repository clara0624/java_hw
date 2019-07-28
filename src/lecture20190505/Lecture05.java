package lecture20190505;

import java.util.Scanner;

public class Lecture05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu = 0; // 변수 menu를 0으로 초기화
		int num = 0; //변수 num을 0으로 초기화
		Scanner scanner = new Scanner(System.in); // scanner변수 입력
		outer: while (true) { // 
			System.out.println("(1) sqare"); //(1)sqare를 출력
			System.out.println("(2) sqare root"); //(2) sqare root를 출력
			System.out.println("(3)log"); //(3)log를 출력
			System.out.print("원하는 메뉴 선택(1~3)를 선택하세요 (종료 :0)");//원하는 메뉴 선택(1~3)를 선택하세요 (종료 :0)를 출력
			
			String tmp = scanner.nextLine(); 
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) { //만약 menu가 0이라면
				System.out.println("프로그램을 종료합니다"); //프로그램을 종료합니다를 출력
				break; //멈춤
			} else if (!(1 <= menu && menu <= 3)) { // 만약 menu가 1이나 3이 아니라면
				System.out.println("메뉴를 잘못 선택하셨습니다(종료는 0)"); //메뉴를 잘못 선택하셨습니다(종료는 0)를 출력
				continue; //진행
			}
			for(;;) { //반복
				System.out.print("계산할 값을 입력하세요(계산 종료:0,전체종료:99)"); //계산할 값을 입력하세요(계산 종료:0,전체종료:99)를 출력
				
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if (num == 0) //만약 num이 0이라면
					break; //멈춤
				if (num == 99) //만앿 num이 99라면
					break outer;//멈춤

				switch (menu) { 
				case 1: //케이스 1
					System.out.println("result" + num * num); //수의 제곱을 출력
					break;//멈춤
				case 2: //케이스2
					System.out.println("result" + Math.sqrt(num)); //수의 제곱근을 출력
					break;//멈춤
				case 3: //케이스3
					System.out.println("result" + Math.log(num)); //수의 로그를 출력
					break;//멈춤
				}
			}
		}
	}
}
		

	


