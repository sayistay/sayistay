package odev;

public class Calistir {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		int birOnceki = 1, ikiOnceki = 0;
		while (birOnceki + ikiOnceki < 1000) {
			int siradaki = birOnceki + ikiOnceki;
			System.out.println(siradaki);
			ikiOnceki = birOnceki;
			birOnceki = siradaki;
		}
	}
}
