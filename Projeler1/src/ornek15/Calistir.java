package ornek15;

import java.util.Scanner;

public class Calistir {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int toplam = 0, adet = 0, sayi;
		do {
			System.out.println("Bir sayı giriniz(çıkış için 0):");
			sayi = scn.nextInt();
			if (sayi != 0) {
				adet++;
				toplam += sayi;
			}
		} while (sayi != 0);
		System.out.println("Ortalama = " + (toplam / (double) adet));
		scn.close();
	}
}
