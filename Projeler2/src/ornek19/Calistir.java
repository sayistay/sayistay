package ornek19;

public class Calistir {
	public static void main(String[] args) {
		Cinsiyet c = Cinsiyet.ERKEK;
		if (c == Cinsiyet.ERKEK) {
			System.out.println("Erkek");
		}

		System.out.println(c);
		System.out.println(c.name());
		System.out.println(c.ordinal());
	}
}
