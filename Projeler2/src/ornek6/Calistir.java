package ornek6;

public class Calistir {
	public static void main(String[] args) {
		deneme(new A());
		deneme(new B());
		deneme(new E());
		deneme(new F());
		deneme(new H());

		deneme2(new B());
		deneme2(new D());
		deneme2(new E());

		deneme3(new B());
		deneme3(new G());
		deneme3(new K());

	}

	private static void deneme(A x) {
		x.x();
	}

	private static void deneme2(B b) {
		b.x();
		b.y();
	}

	private static void deneme3(I t) {
		t.y();
	}

}
