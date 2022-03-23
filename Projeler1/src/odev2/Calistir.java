package odev2;

import java.util.Scanner;

public class Calistir {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int sayi = scanner.nextInt();
		scanner.close();
		for (int i = 2; i <= sayi; i++) {
			if (asalMi(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean asalMi(int sayi) {
		if (sayi < 2) {
			return false;
		}
		for (int kontrol = 2; kontrol < sayi; kontrol++) {
			if (sayi % kontrol == 0) {
				return false;
			}
		}
		return true;
	}
}
