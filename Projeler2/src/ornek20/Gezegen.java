package ornek20;

public enum Gezegen {
	MERKUR(20000), VENUS(15000), DUNYA(1000), MARS(300);

	private int sicaklik;

	private Gezegen(int sicaklik) {
		this.sicaklik = sicaklik;
	}

	public int getSicaklik() {
		return sicaklik;
	}

}
