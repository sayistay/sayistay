
public class Ornekler3 {
	public static void main(String[] args) {
		String a = "Merhaba";
		String b = " Dünya";
		// String c = a + b;
		// System.out.println(c);

		String d = a + " nasılsın," + b + " nasıl?";

		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.append(" nasılsın,");
		sb.append(b);
		sb.append(" nasıl?");
		d = sb.toString();
	}
}
