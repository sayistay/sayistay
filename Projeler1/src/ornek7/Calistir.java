package ornek7;

public class Calistir {
	public static void main(String[] args) {
		Motosiklet motosiklet = new Motosiklet(125);
		System.out.println(motosiklet.fiyat);
		Motosiklet motosiklet2 = new Motosiklet(225);
		System.out.println(motosiklet2.fiyat);

		Motosiklet motosiklet3 = new Motosiklet();
		System.out.println(motosiklet3.fiyat);
	}
}
