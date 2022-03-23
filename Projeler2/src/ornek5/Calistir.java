package ornek5;

public class Calistir {
	public static void main(String[] args) {
		Integer yas = null;
		Character c;
		Byte b;
		Short sh;
		Long l;
		Float f;
		Double d;
		Boolean bool;
		yas = Integer.valueOf(5);

		// primitive -> Wrapper, String
		int i = 5;
		Integer sayi = Integer.valueOf(5);
		String s = String.valueOf(i);
		// Wrapper -> String, primitive
		s = sayi.toString();
		i = sayi.intValue();
		// String -> Wrapper, primitive
		sayi = Integer.valueOf(s);
		i = Integer.parseInt(s);

	}

}
