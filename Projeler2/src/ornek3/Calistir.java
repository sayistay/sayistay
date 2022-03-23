package ornek3;

public class Calistir {
	static {
		System.out.println(12);
	}

	public static void main(String[] args) {
		System.out.println("Program basladi");
		new Bitki(14);
		System.out.println("------");
		new Bitki(14);
		System.out.println("Program bitti");
	}
}
