package lecture20190413;

public class Lecture30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = 3;
		a += b++ + c;
		b += ++b + c;
		c += c++ + ++c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
