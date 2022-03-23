package ornek4;

public class Calistir {
	public static void main(String[] args) {
		hesapla();
		hesapla("Merhaba");
		hesapla(new Integer(5));
		hesapla((String) null);
		hesapla((Integer) null);
	}

	static void hesapla() {
		System.out.println("Hesapla");
	}

	static void hesapla(String s) {
		System.out.println("Hesapla string:" + s);
	}

	static void hesapla(Integer i) {
		System.out.println("Hesapla integer:" + i);
	}

}
