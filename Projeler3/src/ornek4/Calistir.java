package ornek4;

public class Calistir {
	public static void main(String[] args) {
		try {
			new A().a();
			System.out.println(8);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(10);
		} catch (Exception e) {
			System.out.println(11);
		}
		System.out.println(12);
	}
}
