package ornek9;

public class Calistir {
	public static void main(String[] args) {
		int a = 0;
		while (a < 10) {
			a++;
			System.out.println(a);
		}
		System.out.println("----------");
		a = 0;
		do {
			a++;
			System.out.println(a);
		} while (a < 10);
		System.out.println("----------");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println(i * j);
		}
	}
}
