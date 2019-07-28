package lecture20190413;

public class Lecture34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		a += b += 3;
		System.out.printf("%d %d \n",  a,b);
		a *= a++ - (a++) * b;
		System.out.println(a + b);

	}

}
