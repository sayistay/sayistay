package ornek16;

import java.util.stream.IntStream;

public class Streams {
	public static void main(String[] args) {
		IntStream.range(1, 10).filter(Streams::filtre1).filter(Streams::filtre2)
				.forEach(Streams::yazdir);
	};

	static boolean filtre1(int sayi) {
		System.out.println("filtre1:" + sayi);
		return sayi > 4;
	}

	static boolean filtre2(int sayi) {
		System.out.println("filtre2:" + sayi);
		return sayi % 2 == 0;
	}

	static void yazdir(int s) {
		System.out.println("yazdir:" + s);
		System.out.println(s);
	}

}
