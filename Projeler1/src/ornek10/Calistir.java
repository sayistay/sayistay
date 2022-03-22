package ornek10;

public class Calistir {
	public static void main(String[] args) {
		int a = 1;
		a += 5;
		a /= 2;
		a %= 3;
		a = 5;
		a += a + 1; // a = a + (a+1);
		System.out.println(a);
		a = 10;
		a++;
		++a;
		a = 3;
		System.out.println("------");
		int b = a++ + 3 * ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println("------");
		b = 3;
		a = 4;
		a = b++ + a++ * ++b;
		b += a++ * --b;
		System.out.println(a);
		System.out.println(b);
		System.out.println("------");
		a = 3;
		a = a++;
		System.out.println(a);
		System.out.println("------");
		a = 4;
		a = (a++) + (++a) + (a++) + (++a); // parantez kullanın

		a = 2 + 3 * 5;
		a = 2 + (3 * 5); // parantez kullanın

	}

}
