package ornek18;

public class Calistir {
	public static void main(String[] args) {
		test(1, new int[] { 1, 2, 3, 4 });
		test(3, 5, 8);
		test(7);
		test(0, new int[0]);
	}

	private static void test(int b, int... a) {
		System.out.println(a.length);
		System.out.println(a[0]);
	}
}
