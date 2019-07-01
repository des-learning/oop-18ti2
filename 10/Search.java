import java.util.List;
import java.util.Comparator;

public class Search<T> {
	private Comparator<T> comp;
	
	public Search(Comparator<T> comp) {
		this.comp = comp;
	}

	public int sequential(T needle, List<T> hay) {
		for (int i = 0; i < hay.size(); i++) {
			if (comp.compare(hay.get(i), needle) == 0)
				return i;
		}
		return -1;
	}

	public int binary(T needle, List<T> hay) {
		int left = 0;
		int right = hay.size();
		int middle = (left + right)/2;

		while(left <= right) {
			T item = hay.get(middle);
			int comparison = comp.compare(item, needle);
			if (comparison == 0) {
				return middle;
			} else if (comparison < 0) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}

			middle = (left + right)  / 2;
		}
		return -1;
	}

	public void setComparator(Comparator<T> comp) {
		this.comp = comp;
	}
}
