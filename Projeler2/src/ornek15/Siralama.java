package ornek15;

import java.util.Arrays;
import java.util.Comparator;

public class Siralama {
	public static void main(String[] args) {
		Bilgisayar[] liste = new Bilgisayar[5];
		liste[0] = new Bilgisayar(16, "Acer");
		liste[1] = new Bilgisayar(8, "Hp");
		liste[2] = new Bilgisayar(64, "Apple");
		liste[3] = new Bilgisayar(32, "Lenovo");
		liste[4] = new Bilgisayar(8, "Acer");
		Arrays.sort(liste, new BilgisayarKiyaslayici());
		System.out.println("Sıralanmış dizi:");
		for (Bilgisayar i : liste) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		Masa[] masalar = new Masa[3];
		masalar[0] = new Masa(100);
		masalar[1] = new Masa(300);
		masalar[2] = new Masa(80);
		Arrays.sort(masalar, new MasaKiyaslayici());
		for (Masa m : masalar) {
			System.out.println(m);
		}
		System.out.println("--------------------");
		Arrays.sort(liste, new Comparator<Bilgisayar>() {
			@Override
			public int compare(Bilgisayar o1, Bilgisayar o2) {
				return o1.getMarka().compareTo(o2.getMarka());
				// return Integer.valueOf(o1.getRam()).compareTo(o2.getRam()) * -1;
			}
		});
		System.out.println("Sıralanmış dizi:");
		for (Bilgisayar i : liste) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		Arrays.sort(liste, (o1, o2) -> o1.getMarka().compareTo(o2.getMarka()) * -1);
		System.out.println("Sıralanmış dizi:");
		for (Bilgisayar i : liste) {
			System.out.println(i);
		}
		System.out.println("****************");
		Arrays.stream(liste).forEach(System.out::println);
	}

}
