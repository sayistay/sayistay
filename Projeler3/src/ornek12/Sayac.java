package ornek12;

public class Sayac implements Runnable {
	private static int deger = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int x = deger;
			bekle(1);
			deger = x + 1;
			System.out.println(deger);
		}
	}

	private void bekle(int ns) {
		for (long i = 0; i < 1000 * ns; i++) {

		}
	}

}
