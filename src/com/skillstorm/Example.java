package com.skillstorm;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my code from Tuesday afternoon week 9.");
		multithreading();
	}
	
	public static void multithreading(String arg) {
		// TODO more code here
	}
	
	public static void multithreading() { // no guaranteed order 
		new Thread(() -> System.out.println("thread 1")).start();
		new Thread(() -> System.out.println("thread 2 is awesome")).start();
		System.out.println("multithreading");
	}

}
