
public class Ornekler2 {
	public static void main(String[] args) {
		// açıklama satırı
		/* satır içi açıklama */
		/**
		 * java doc açıklaması
		 */
		String s = null;
		s = new String("Levent");
		// s = "Levent";

		// String s2 = new String("Levent");
		String s2 = "Levent";
		if (s == s2) {
			System.out.println("Esit");
		} else {
			System.out.println("Esit degil");
		}

		if (s.equals(s2)) {
			System.out.println("Esit");
		} else {
			System.out.println("Esit degil");
		}

	}

}
