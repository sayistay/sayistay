package ornek;

public class Ornek2 {
	public static void main(String[] args) {
		Anne anne = new Anne();
		anne.yas = 48;
		anne.adi = "Hamiyet";
		Anne anne2 = new Anne();
		anne2.yas = 55;
		anne2.adi = anne.adi;
		System.out.println(anne2.yas);
		System.out.println(anne2.adi);
	}
}
