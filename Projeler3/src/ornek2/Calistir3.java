package ornek2;

public class Calistir3 {
	public static void main(String[] args) throws Hata {
		System.out.println("Program başladı");
		try {
			int sonuc = hesapla(4, 2);
			System.out.println(sonuc);

			sonuc = hesapla(6, 10);
			System.out.println(sonuc);

			sonuc = hesapla(3, 6);
			System.out.println(sonuc);
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Program sonu");

	}

	public static int hesapla(int sayi1, int sayi2) throws Hata {
		try {
			if (sayi2 > sayi1) {
				// hata
				throw new Hata();
			}
			return sayi1 / sayi2;
		} finally {
			System.out.println("hesapla finally");
		}
	}
}
