package ornek14;

public class Sayac implements Runnable {
	private static int deger = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			arttir();
		}
	}

	private static void arttir() {
		synchronized ("") {
			int x = deger;
			bekle(10);
			deger = x + 1;
		}
		System.out.println(deger);
	}

	public static void bekle(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
