package com.skillstorm;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("this is my code");
		multithreading();
	}
	
	public static void multithreading() { // no guaranteed order 
		new Thread(() -> System.out.println("thread 1")).start();
		new Thread(() -> System.out.println("thread 2")).start();
		System.out.println("multithreading");
	}

}
