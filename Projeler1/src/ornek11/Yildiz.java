package ornek11;

public class Yildiz {
	public static void main(String[] args) {
		for (int satir = 1; satir <= 5; satir++) {
			for (int yildiz = 0; yildiz < satir; yildiz++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
