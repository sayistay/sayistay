package ornek3;

public class Calistir {
	public static void main(String[] args) {
		try {
			A.a();
			System.out.println(8);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(10);
		}
		System.out.println(12);
	}
}
