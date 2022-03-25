package ornek1;

public class Calistir {
	public static void main(String[] args) {
		try {
			int a = 3;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println("Hata oluştu");
			System.out.println(ex);
			System.out.println(ex.getMessage());
		}
	}
}
