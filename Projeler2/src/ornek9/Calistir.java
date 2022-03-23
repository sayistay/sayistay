package ornek9;

public class Calistir {
	public static void main(String[] args) {
		int x = 3;
		String s = "ali";
		test(x);
		test2(s);
		System.out.println(x);
		System.out.println(s);

		Araba a = new Araba();
		a.setHiz(100);
		test3(a);
		System.out.println(a.getHiz());
	}

	private static void test3(Araba a) {
		// a = new Araba();
		a.setHiz(70);
	}

	private static void test(int x) {
		x = 4;
	}

	private static void test2(String s) {
		s = "Veli";
	}

}
