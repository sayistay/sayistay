package ornek7;

public class Calistir {
	public static void main(String[] args) {
		System.out.println("Program basladi");
		try {
			A.a();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
		System.out.println("Program bitti");
	}
}
