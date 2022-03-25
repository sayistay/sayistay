package ornek13;

public class Calistir {
	public static void main(String[] args) {
		Sayac sayac = new Sayac();
		Sayac sayac2 = new Sayac();
		new Thread(sayac).start();
		new Thread(sayac2).start();
		System.out.println("Program sonu");
	}
}
