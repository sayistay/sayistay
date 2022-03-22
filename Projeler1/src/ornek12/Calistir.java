package ornek12;

public class Calistir {
	public static void main(String[] args) {
		// == < > <= >= != <>
		int a = 5;
		if (a < 2) {
			System.out.println("a < 2");
		} else {
			System.out.println(a + " >= 2");
		}
		int b = 8;
		if (a > 10 | a < b) { // | veya
			System.out.println(a * b);
		}
		if (a > 10 & a < b) { // & ve
			System.out.println(a * b);
		}
		if (a < 10 || test()) { // || veya && çift kullanıldığında sol taraf sonucun belirlenmesinde yeterli
								// olursa sağ tarafa hiç bakmıyor. Bu örnekte test metodu çağırılmıyor.
			System.out.println("deneme");
		}
		System.out.println("--------------");
		if (a < 2 && test2()) {
			System.out.println("deneme2");
		}
	}

	static boolean test() {
		System.out.println("Test çağırıldı");
		return false;
	}

	static boolean test2() {
		System.out.println("Test2 çağırıldı");
		return true;
	}
}
