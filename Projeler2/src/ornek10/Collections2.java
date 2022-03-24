package ornek10;

import java.util.HashMap;
import java.util.Map;

public class Collections2 {
	public static void main(String[] args) {
		Map<Integer, String> sehirler = new HashMap<Integer, String>();
		sehirler.put(Integer.valueOf(6), "Ankara");
		sehirler.put(Integer.valueOf(34), "İstanbul");
		sehirler.put(Integer.valueOf(32), "İsparta");
		sehirler.put(Integer.valueOf(7), "Antalya");
		sehirler.put(Integer.valueOf(1), "Adana");
		sehirler.put(Integer.valueOf(32), "Isparta");

		System.out.println(sehirler.get(Integer.valueOf(7)));
		System.out.println(sehirler.get(Integer.valueOf(32)));
		System.out.println(sehirler.get(Integer.valueOf(6)));
		System.out.println(sehirler.get(Integer.valueOf(35)));
		System.out.println(sehirler.keySet());
		System.out.println(sehirler.values());
		System.out.println("---------------------------");
		System.out.println(sehirler.get(Integer.valueOf(6)).length());

	}
}
