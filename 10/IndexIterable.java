import java.util.Map.Entry;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.AbstractMap.SimpleEntry;

public class IndexIterable<T,U> implements Iterable<U> {
	private Iterable<U> iterable;
	public IndexIterable(T iterable) {
		this.iterable = iterable;
	}

	public Iterator<U> iterator() {
		return new IndexIterator<T>(iterable);
	}
}
