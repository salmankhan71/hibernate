package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UnsafeArrayListExample {

	public static void main(String[] args) throws InterruptedException  {
		List<Integer> stmt = Collections.synchronizedList(new ArrayList<>());
		stmt.add(1);
		stmt.add(2);
		stmt.add(3);
		stmt.add(4);

		// Create a thread pool of size 10

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		// Create a Runnable task that increments each element of the ArrayList by one

		Runnable task = () -> {
			incrementArrayList(stmt);
		};
		// Submit the task to the executor service 100 times.
		// All the tasks will modify the ArrayList concurrently

		for (int i = 0; i < 100; i++) {
			executorService.submit(task);
		}
			executorService.awaitTermination(60, TimeUnit.SECONDS);
			System.out.println(stmt);
		}
	

	private static void incrementArrayList(List<Integer> stmt) {
		synchronized (stmt) {
			for (int i = 0; i < stmt.size(); i++) {
				Integer value = stmt.get(i);
				stmt.set(i, value + 1);
			}
		}

	}

}
