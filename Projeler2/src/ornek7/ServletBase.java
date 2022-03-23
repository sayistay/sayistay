package ornek7;

public abstract class ServletBase implements ServletInterface {

	@Override
	public void run() {
		System.out.println("Auth. kontrolü yapılıyor");
		islemYap();
		System.out.println("Database connection'i kapatiliyor.");
	}

	public abstract void islemYap();

}
