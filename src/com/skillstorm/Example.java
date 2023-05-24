package com.skillstorm;
// This is the main class.
public class Example {



	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my code from Wednesday Week 9");
		multithreading();
		System.out.println("this is my code");
		System.out.println("I don't know how to use Git");
		System.out.println("this is my code");
		System.out.println("Tenzin was here");
	}
	
	public static void multithreading() { // no guaranteed order 
		new Thread(() -> System.out.println("thread 1")).start();
		new Thread(() -> System.out.println("thread 2 is great")).start();
		System.out.println("multithreading");

	}

}
