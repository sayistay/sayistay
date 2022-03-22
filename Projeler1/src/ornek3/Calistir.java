package ornek3;

public class Calistir {

	public static void main(String[] args) {
		Kitap k1 = new Kitap();
		Kitap k2 = new Kitap();
		Kitap k3 = new Kitap();
		k1.sayfaSayisi = 150;
		k2.sayfaSayisi = 180;
		k3.sayfaSayisi = 250;
		System.out.println(k1.getKitapSayisi());
		System.out.println(k2.getKitapSayisi());
		System.out.println(k3.getKitapSayisi());
		System.out.println("--------------");
		System.out.println(k1.getToplam());
		System.out.println(k2.getToplam());
		System.out.println(k3.getToplam());
	}

}
