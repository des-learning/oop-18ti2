import java.util.Random;
public class TestConcurrent {
	public static void main(String []args) {
		String []texts = new String[]{"Hello", "Hi", "Bye", "Good"};
		int count = 10;


		(
		 	new Thread(
				new MyRunnable(1000)
			)
		).start();
		for (String text: texts) {
			Thread t = new MyThread(text, count);
			t.start();
		}
	}
}

class MyThread extends Thread {
	private String text;
	private int count;
	private Random r;
	public MyThread(String text, int count) {
		this.text = text;
		this.count = count;
		this.r = new Random();
	}

	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.printf("%d -> %s\n", i, text);
			try {
				Thread.sleep(r.nextInt(1000));
			} catch (InterruptedException e) { return ; }
		}
		System.out.printf("%s finished\n", text);
	}
}

class MyRunnable implements Runnable {
	private int current;
	private Random r;
	public MyRunnable(int start) {
		this.current = start;
		this.r = new Random();
	}

	public void run() {
		while (current >= 0) {
			System.out.printf("%d\n", current--);
			try {
				Thread.sleep(r.nextInt(100));
			} catch (InterruptedException e) { };
		}
		System.out.println("my runnable finished");
	}
}
