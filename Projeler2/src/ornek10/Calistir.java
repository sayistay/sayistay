package ornek10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calistir {
	public static void main(String[] args) {
		List<Integer> sayilar = new ArrayList<Integer>();
		try (Scanner scanner = new Scanner(System.in)) {
			int sayi;
			do {
				System.out.println("Bir sayı giriniz(Çıkış için 0):");
				sayi = scanner.nextInt();
				if (sayi != 0) {
					sayilar.add(Integer.valueOf(sayi));
				}
			} while (sayi != 0);
			System.out.println("Tersten:");
			for (int i = sayilar.size() - 1; i >= 0; i--) {
				System.out.println((i + 1) + ". siradaki " + sayilar.get(i));
			}
			System.out.println("Düzden");
			for (int s : sayilar) {
				System.out.println(s);
			}
		}
	}
}
