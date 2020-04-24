package demo;

public class Multithreading {
	public static void main(String[] args) throws InterruptedException {
		
		final Service service = new Service();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					service.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					service.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		
	}
}