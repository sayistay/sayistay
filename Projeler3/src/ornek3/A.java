package ornek3;

public class A {

	public static void a() {
		try {
			throw new ArithmeticException("4");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("5");
		}
	}

}
