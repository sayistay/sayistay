package ornek10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections3 {
	public static void main(String[] args) {
		Set<String> isimler = new HashSet<>();
		isimler.add(new String("Ali"));
		isimler.add("Veli");
		isimler.add("Murteza");
		isimler.add(new String("Ali"));
		isimler.add("Aslı");
		isimler.add("Kerem");
		isimler.add("Veli");

		System.out.println(isimler);
		Iterator<String> itr = isimler.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		System.out.println("--------------");
		for (String s : isimler) {
			System.out.println(s);
		}
	}
}
