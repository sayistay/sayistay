package ornek3;

public class Canli {
	static {
		System.out.println(3);
	}

	public Canli() {
		this(4);
	}

	public Canli(int a) {
		System.out.println(5);
		System.out.println(a);
	}
}
