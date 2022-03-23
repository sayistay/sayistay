package ornek8;

public class Diziler2 {
	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3 };
		System.out.println(sayilar[2]);
		sayilar = new int[] { 3, 5 };

		int[] sayilar2 = { 1, 2, 3 };
		sayilar2 = new int[] { 3, 5 };

		String[] isimler = { "Abdulmuttalip", "Şazument" };

		String[][] isimler2;
		isimler2 = new String[2][];
		isimler2[0] = new String[2];
		isimler2[1] = new String[3];
		isimler2[0][1] = "Levent";
		isimler2[1][2] = "Şamil";
		isimler2[0] = isimler2[1];
		System.out.println(isimler2[0][2]);
		isimler2[0][0] = "Bakalim";
		System.out.println(isimler2[1][0]);

		String[][] isimler3 = { { "Ayşe", "Veli" }, { "Ali", null } };
	}
}
