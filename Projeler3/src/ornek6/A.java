package ornek6;

public class A {
	public static void a() throws Exception {
		try {
			throw new RuntimeException("4");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception("5", e);
		} finally {
			System.out.println("2");
			// throw new Exception("8");
		}
	}

}
