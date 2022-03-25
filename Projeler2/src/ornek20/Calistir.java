package ornek20;

public class Calistir {
	public static void main(String[] args) {
		Gezegen g = Gezegen.MARS;
		System.out.println(g.getSicaklik());
		Gezegen g2 = Gezegen.valueOf("DUNYA");
		System.out.println(g2);
	}
}
