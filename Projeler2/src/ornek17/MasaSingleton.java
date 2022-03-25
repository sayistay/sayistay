package ornek17;

// Singleton Pattern
public class MasaSingleton {
	private static MasaSingleton instance;

	private MasaSingleton() {
	}

	public static MasaSingleton getInstance() {
		if (instance == null) {
			instance = new MasaSingleton();
		}
		return instance;
	}
}
