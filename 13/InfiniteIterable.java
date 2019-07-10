import java.util.Iterator;
import java.util.NoSuchElementException;

public class InfiniteIterable<T> implements Iterable<T> {
	private T item;
	public InfiniteIterable(T item) {
		this.item = item;
	}
	
	public Iterator<T> iterator() {
		return new InfiniteIterator<T>(item);
	}
}

class InfiniteIterator<T> implements Iterator<T> {
	private T item;
	public InfiniteIterator(T item) {
		this.item = item;
	}

	public boolean hasNext() { return true; }

	public T next() {
		if (!hasNext()) throw new NoSuchElementException();
		return item;
	}
}
