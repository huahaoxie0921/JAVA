package demo;

import java.util.LinkedList;

public class Service {

	LinkedList<Order> queue = new LinkedList<>();
	int capacity = 5;

	public void produce() throws InterruptedException {
		int count = 1;
		while (count <= 100) {
			synchronized (this) {
				while (queue.size() == capacity)
					wait();

				queue.add(new Order(count++));

				notify();

				Thread.sleep(100);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (queue.size() == 0)
					wait();

				Order order = queue.removeFirst();
				order.setState("FULFILLED");
				
				System.out.println("Order " + order.getId() + " has been " + order.getState());

				notify();

				Thread.sleep(200);
			}
		}
	}
}