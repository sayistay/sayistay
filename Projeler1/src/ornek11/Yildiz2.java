package ornek11;

public class Yildiz2 {
	public static void main(String[] args) {
		for (int satir = 1; satir <= 5; satir++) {
			for (int bosluk = 0; bosluk < 5 - satir; bosluk++) {
				System.out.print(' ');
			}
			for (int yildiz = 0; yildiz < satir; yildiz++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
