package ornek9;

import java.math.BigDecimal;

public class Calistir {
	public static void main(String[] args) {
		BigDecimal sayi1 = new BigDecimal("0.1");
		BigDecimal sayi2 = new BigDecimal("0.2");
		BigDecimal sayi3 = sayi1.add(sayi2);
		System.out.println(sayi3);
		sayi1 = new BigDecimal("1000000000");
		for (int i = 0; i < 19; i++) {
			sayi1 = sayi1.multiply(sayi1);
			System.out.println(i);
		}

		sayi1 = sayi1.add(new BigDecimal(
				"0.000000000000000000000000000000000000000000000000000000000000001"));
		System.out.println(sayi1.toString().length());
	}
}
