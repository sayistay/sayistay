package ornek3;

public class Bitki extends Canli {
	static {
		System.out.println(8);
	}

	public Bitki() {
		System.out.println(9);
	}

	public Bitki(int a) {
		this();
		System.out.println(15);
		System.out.println(a);
	}
}
