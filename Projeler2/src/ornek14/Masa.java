package ornek14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Masa implements Comparable<Masa> {
	private int fiyat;

	@Override
	public int compareTo(Masa o) {
		return (getFiyat() > o.getFiyat()) ? 1 : (getFiyat() < o.getFiyat()) ? -1 : 0;
	}
}
