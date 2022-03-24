package ornek13;

public class BilgisayarKiyaslayici implements Kiyaslayici<Bilgisayar> {

	@Override
	public int kiyasla(Bilgisayar o1, Bilgisayar o2) {
		return (o1.getRam() > o2.getRam()) ? 1 : (o1.getRam() < o2.getRam()) ? -1 : 0;
	}

}
