public class TestShared {
	public static void main(String []args) {
		Countdown c = new Countdown(1000);
		Counter[] counters = new Counter[]{ 
			new Counter("satu", c),
			new Counter("dua", c),
		};
		for (Counter counter: counters) {
			(new Thread(counter)).start();
		}
	}
}

class Countdown {
	private int count;
	public Countdown(int count) { this.count = count; }
	public synchronized int getCount() { return count--; }
	public synchronized boolean finished() { return count <= 0; }
}

class Counter implements Runnable {
	private Countdown count;
	private String name;
	public Counter(String name, Countdown count) {
		this.name = name; this.count = count; }
	public void run() {
		while (!count.finished()) {
			System.out.printf("%s: %d\n", name, count.getCount());
			try { Thread.sleep(100); } catch (InterruptedException e) { }
		}
	}
}
