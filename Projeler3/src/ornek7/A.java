package ornek7;

public class A {
	static {
		if (Math.random() < 1)
			throw new RuntimeException("3");
	}

	public static void a() {
		throw new RuntimeException("4");
	}

}
