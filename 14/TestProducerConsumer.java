import java.util.*;
public class TestProducerConsumer {
	public static void main(String []args) {
		MyQueue q = new MyQueue(2);
		Consumer c = new Consumer(q);
		Producer[] p = new Producer[]{new Producer("satu", q), new Producer("dua", q), new Producer("tiga", q),
		 new Producer("empat", q), new Producer("lima", q)};

		new Thread(c).start();
		for (Producer i: p) {
			new Thread(i).start();
		}
	}
}

class MyQueue {
	private Queue<String> q;
	private int capacity;

	public MyQueue(int capacity) {
		this.capacity = capacity;
		this.q = new LinkedList<String>();
	}

	public int size() { return this.q.size(); }

	public synchronized void put(String item) throws InterruptedException {
		if (q.size() == capacity) wait();
		this.q.add(item);
		notify();
	}

	public synchronized String take() throws InterruptedException {
		if (q.isEmpty())  wait();
		String item = q.remove();
		notify();
		return item;
	}
}

class Consumer implements Runnable {
	private MyQueue q;
	public Consumer(MyQueue q) {
		this.q = q;
	}

	public void run() {
		System.out.println("consumer start consuming\n");

		Random r = new Random();
		while(true) {
			try {
				String item = q.take();
				System.out.printf("Consumed %s\n", item);
				Thread.sleep(r.nextInt(500));
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}
}

class Producer implements Runnable {
	private MyQueue q;
	private String name;
	private long count = 0;
	public Producer(String name, MyQueue q) {
		this.q = q;
		this.name = name;
	}

	public void run() {
		System.out.printf("producer %s start producing\n", name);
		while(true) {
			count++;
			try {
				q.put(String.format("%s: %d", this.name, count));
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}
}
