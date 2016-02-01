package alacret;

import java.util.Set;
import java.util.TreeSet;

public class AstronomicalRecordsEasy {
	public int minimalPlanets(int[] x, int[] y) {
		Set<Double> r = new TreeSet<Double>();

		for (int i = (y.length - 1); i > 0; i--)
			for (int j = (x.length - 1); j > 0; j--)
				r.add((((double) y[i]) / ((double) y[i - 1])));

		for (int i = (x.length - 1); i > 0; i--)
			r.add((((double) x[i]) / ((double) x[i - 1])));

		int size = r.size();

		if (size < x.length && size < y.length)
			return Math.max(x.length, y.length);
		return size;
	}
}
