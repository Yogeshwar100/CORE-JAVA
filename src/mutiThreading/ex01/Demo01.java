package mutiThreading.ex01;

class MyThread extends Thread {

	public void run() {
		Thread.currentThread().setName("MyThread");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("CHILD THREAD");
		}
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Thread.currentThread().setName("YogiThread");
		System.out.println(Thread.currentThread());
		//System.out.println(10/0);
		MyThread myThread = new MyThread();// Thread instantiation
		myThread.start(); // Starting of Thread 
		for (int i = 0; i < 5; i++) {
			System.out.println("MAIN THREAD");
		}
	}

}
