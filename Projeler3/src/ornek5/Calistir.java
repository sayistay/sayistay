package ornek5;

public class Calistir {
	public static void main(String[] args) {
		try {
			try {
				A.a();
			} finally {
				System.out.println(23);
			}
		} catch (ArithmeticException e) {
			System.out.println(11);
		}
		System.out.println(12);
	}
}
