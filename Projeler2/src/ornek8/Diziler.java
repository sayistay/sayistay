package ornek8;

public class Diziler {
	public static void main(String[] args) {
		int[] sayilar = new int[3];
		sayilar[1] = 3;
		System.out.println(sayilar.length);
		System.out.println(sayilar[0]);
		System.out.println(sayilar[1]);

		String[] isimler = new String[3];
		isimler[0] = "Murteza";
		isimler[1] = "Hamiyet";

		System.out.println(isimler[1]);
		System.out.println(isimler.length);
		System.out.println(isimler[0].length());
		System.out.println(isimler[2].length());
	}
}
