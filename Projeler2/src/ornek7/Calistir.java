package ornek7;

public class Calistir {
	public static void main(String[] args) {
		requestOlustur(2);
	}

	private static void requestOlustur(int i) {
		ServletInterface servlet;
		if (i == 1) {
			servlet = new Servlet1();
		} else {
			servlet = new Servlet2();
		}
		servlet.run();
	}
}
