package ornek14;

public class SwitchOrnegi {
	public static void main(String[] args) {
		int a = 4;
		switch (a) {
		case 10:
		case -3:
		case -5:
		case 1:
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
		case 5:
			System.out.println(5);
			break;
		case 6:
			System.out.println(6);
		default:
			System.out.println("Diğer");
		}
		String marka = "Acer";
		switch (marka) {
		case "Acer":
			System.out.println("Marka acer'dır");
			break;
		default:
			System.out.println("Marka acer değildir");
			break;
		}
	}
}
