package ornek11;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
	public static void main(String[] args) {
		Integer s1 = 3;
		Integer s2 = 4;
		Integer s3 = s1 + s2;
		System.out.println(s3);

		List<Integer> sayilar = new ArrayList<Integer>();
		sayilar.add(2);
		sayilar.add(3);
		System.out.println(sayilar.get(0) * sayilar.get(1));

	}
}
