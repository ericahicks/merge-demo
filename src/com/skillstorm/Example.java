package com.skillstorm;
// This is the main class.
public class Example {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("this is my code");
		System.out.println("now it has Tony's code");
		multithreading();
	}
	
	public static void multithreading() { // no guaranteed order 
		new Thread(() -> System.out.println("thread 1")).start();
		new Thread(() -> System.out.println("thread 2 is great")).start();
		System.out.println("multithreading");
	}

}
