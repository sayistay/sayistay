package ornek13;

public class Calistir {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = (a < b) ? a + b : a * b;
		System.out.println(c);

		c = (b < c) ? b : (a < b) ? b : (a < c) ? c : a;

		c = ((a < b) ? ((c < b) ? a : b) : ((b == a) ? b : c)) * 2;
		if (a < b) {
			if (c < b) {
				c = a * 2;
			} else {
				c = b * 2;
			}
		} else {
			if (b == a) {
				c = b * 2;
			} else {
				c = c * 2;
			}
		}

		a = 2;
		b = 3;
		c = a * (a < 5 ? a + b : b / 2) - (a == 2 ? b : 5) * (b > a ? 4 : 3);
	}
}
