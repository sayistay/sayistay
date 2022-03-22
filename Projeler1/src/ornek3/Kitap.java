package ornek3;

public class Kitap {
	int sayfaSayisi = 50;

	int getKitapSayisi() {
		return sayfaSayisi;
	}

	int getToplam() {
		return 2 * getKitapSayisi() + 100;
	}
}
