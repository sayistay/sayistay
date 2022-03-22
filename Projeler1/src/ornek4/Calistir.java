package ornek4;

public class Calistir {

	public static void main(String[] args) {
		Bilgisayar bilgisayar = new Bilgisayar();
		Bilgisayar bilgisayar2 = new Bilgisayar();
		bilgisayar.model = "MacBook Air";
		Bilgisayar.marka = "Acer";
		bilgisayar2.model = "MacBook Pro";
		Bilgisayar.marka = "Apple";

		System.out.println(bilgisayar.model);
		System.out.println(Bilgisayar.marka);
		System.out.println(bilgisayar2.model);
		System.out.println(Bilgisayar.marka);

		Bilgisayar.getMarka();
	}

}
