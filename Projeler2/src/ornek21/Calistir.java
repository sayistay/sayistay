package ornek21;

import ornek21.Bilgisayar.Disk;
import ornek21.Bilgisayar.Ram;

public class Calistir {
	public static void main(String[] args) {
		Bilgisayar bilgisayar = new Bilgisayar();
		Ram ram = new Ram();
		bilgisayar.setRam(ram);

		Disk disk = bilgisayar.new Disk();
		bilgisayar.setDisk(disk);
	}
}
