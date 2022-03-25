package ornek1;

public class Calistir2 {
	public static void main(String[] args) {
		try {
			int a = 3;
			int b = 0;
			if (b < 10) {
				// hata ver
				ArithmeticException ex = new ArithmeticException(
						"sayi 10'dan küçük");
				throw ex;
			}
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println("Hata oluştu");
			System.out.println(ex);
			System.out.println(ex.getMessage());
		}
	}
}
