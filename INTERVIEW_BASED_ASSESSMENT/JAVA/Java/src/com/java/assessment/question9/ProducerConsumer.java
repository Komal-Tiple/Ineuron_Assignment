package com.java.assessment.question9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
	public void ProdCon() {
		Queue<Integer> queue = new LinkedList<>();
		int maxSize = 10;

		Thread producerThread = new Thread(new Producer(queue, maxSize));
		Thread consumerThread = new Thread(new Consumer(queue));

		producerThread.start();
		consumerThread.start();
	}

	static class Producer implements Runnable {
		private Queue<Integer> queue;
		private int maxSize;

		public Producer(Queue<Integer> queue, int maxSize) {
			this.queue = queue;
			this.maxSize = maxSize;
		}

		@Override
		public void run() {
			Random random = new Random();

			while (true) {
				synchronized (queue) {
					while (queue.size() == maxSize) {
						try {
							queue.wait(); // Wait if the queue is full
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					int number = random.nextInt(100);
					queue.add(number);
					System.out.println("Produced: " + number);

					queue.notifyAll(); // Notify the consumer thread
				}
			}
		}
	}

	static class Consumer implements Runnable {
		private Queue<Integer> queue;

		public Consumer(Queue<Integer> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			while (true) {
				synchronized (queue) {
					while (queue.isEmpty()) {
						try {
							queue.wait(); // Wait if the queue is empty
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					int sum = 0;
					while (!queue.isEmpty()) {
						int number = queue.poll();
						sum += number;
						System.out.println("Consumed: " + number);
					}

					System.out.println("Sum: " + sum);

					queue.notifyAll(); // Notify the producer thread
				}
			}
		}
	}
}
