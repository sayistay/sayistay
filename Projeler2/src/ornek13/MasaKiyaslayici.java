package ornek13;

public class MasaKiyaslayici implements Kiyaslayici<Masa> {

	@Override
	public int kiyasla(Masa o1, Masa o2) {
		return (o1.getFiyat() > o2.getFiyat()) ? 1 : (o1.getFiyat() < o2.getFiyat()) ? -1 : 0;
	}

}
