package ornek8;

public class Motosiklet {
	int fiyat;
	String renk;

	public Motosiklet(int fiyat, String renk) {
		this.fiyat = fiyat;
		this.renk = renk;
	}

	Motosiklet(String renk) {
		this(100);
		this.renk = renk;
	}

	Motosiklet(int fiyat) {
		this.fiyat = fiyat;
	}

	Motosiklet() {
		this("Mavi");
	}
}
