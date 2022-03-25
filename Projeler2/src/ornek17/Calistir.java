package ornek17;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Calistir {
	// final değeri değiştirilemez anlamına gelir.
	public static final Locale TURKCE = new Locale("TR");

	public static void main(String[] args) {
		List<String> isimler = Arrays.asList("ali", "şeyma", "çınar", "baha",
				"ırmak", "zeynep");
		Collections.sort(isimler);
		isimler.forEach(System.out::println);

		System.out.println("------");
		Collator collator = Collator.getInstance(TURKCE);
		Collections.sort(isimler, (s1, s2) -> collator.compare(s1, s2));
		isimler.forEach(System.out::println);
	}
}
