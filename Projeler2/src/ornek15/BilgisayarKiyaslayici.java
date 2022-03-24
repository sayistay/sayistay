package ornek15;

import java.util.Comparator;

public class BilgisayarKiyaslayici implements Comparator<Bilgisayar> {

	@Override
	public int compare(Bilgisayar o1, Bilgisayar o2) {
		return (o1.getRam() > o2.getRam()) ? 1 : (o1.getRam() < o2.getRam()) ? -1 : 0;
	}

}
