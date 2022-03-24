package ornek10;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		List<Object> liste = new ArrayList<>();
		liste.add("Muammer");
		liste.add("Veli");
		liste.add(Integer.valueOf(3));
		System.out.println("Size:" + liste.size());
		System.out.println(liste.get(1));
		System.out.println(liste);
		liste.remove(1);
		System.out.println(liste);
		System.out.println(((String) liste.get(0)).length());

		List<String> liste2 = new ArrayList<>();
		liste2.add("Kamuran");

		System.out.println(liste2.get(0).length());

	}
}
