package ornek6;

public class Calistir {
	public static void main(String[] args) {
		try {
			A.a();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
