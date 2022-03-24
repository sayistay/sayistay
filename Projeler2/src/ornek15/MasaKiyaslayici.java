package ornek15;

import java.util.Comparator;

public class MasaKiyaslayici implements Comparator<Masa> {

	@Override
	public int compare(Masa o1, Masa o2) {
		return (o1.getFiyat() > o2.getFiyat()) ? 1 : (o1.getFiyat() < o2.getFiyat()) ? -1 : 0;

	}

}
