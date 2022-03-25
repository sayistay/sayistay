package ornek4;

public class A {
	static {
		System.out.println(13);
	}

	public A() {
		System.out.println(12);
	}

	public static void a() {
		try {
			System.out.println(7);
			if (Math.random() < 1) {
				throw new ArithmeticException("4");
			}

			System.out.println(18);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			System.out.println("5");
		}
	}

}
