package ornek18;

class Hayvan extends Canli {
	String renk;
	int yas;

	String getRenk() {
		return renk;
	}

	int getYas() {
		// return super.yas;
		return super.getYas();
	}

}
