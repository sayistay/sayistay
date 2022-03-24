package ornek12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bilgisayar implements Kiyaslanabilir<Bilgisayar> {
	private int ram;
	private String marka;

	@Override
	public int kiyasla(Bilgisayar o) {
		if (this.getRam() > o.getRam()) {
			return 1;
		} else if (this.getRam() < o.getRam()) {
			return -1;
		} else {
			return 0;
		}
	}
}
