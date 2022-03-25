package ornek5;

public class A {
	public static void a() {
		try {
			throw new ArithmeticException("4");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			try {
				throw e;
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				throw e2;
			} finally {
				System.out.println(3);
			}
		} finally {
			System.out.println("5");
		}
	}

}
