package ornek2;

public class Calistir {

	public static void main(String[] args) {
		Anne anne1 = new Anne();
		anne1.adi = "Şazument";

		Anne anne2 = new Anne();
		anne2.adi = "Kamile";

		anne2.anne = anne1.anne;
		anne1.anne = anne2;
		System.out.println(anne1.anne.adi);

	}

}
