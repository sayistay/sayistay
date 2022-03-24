package ornek14;

import java.util.Arrays;

public class Siralama {
	public static void main(String[] args) {
		Bilgisayar[] liste = new Bilgisayar[5];
		liste[0] = new Bilgisayar(16, "Acer");
		liste[1] = new Bilgisayar(8, "Hp");
		liste[2] = new Bilgisayar(64, "Apple");
		liste[3] = new Bilgisayar(32, "Lenovo");
		liste[4] = new Bilgisayar(8, "Acer");
		Arrays.sort(liste);
		System.out.println("Sıralanmış dizi:");
		for (Bilgisayar i : liste) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		Masa[] masalar = new Masa[3];
		masalar[0] = new Masa(100);
		masalar[1] = new Masa(300);
		masalar[2] = new Masa(80);
		Arrays.sort(masalar);
		for (Masa m : masalar) {
			System.out.println(m);
		}
	}

}
