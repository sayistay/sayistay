package ornek12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Masa implements Kiyaslanabilir<Masa> {
	private int fiyat;

	@Override
	public int kiyasla(Masa o) {
		return (getFiyat() > o.getFiyat()) ? 1 : (getFiyat() < o.getFiyat()) ? -1 : 0;
	}
}
