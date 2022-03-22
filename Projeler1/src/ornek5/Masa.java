package ornek5;

public class Masa {
	static {
		System.out.println("Masa sinifi yukleniyor");
	}
	int fiyat;

	static String model() {
		return "Yemek masası";
	}

	int getFiyat() {
		System.out.println("Fiyat:");
		return fiyat;
	}
}
