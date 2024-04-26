/*
NOTE:
	static synchonized methods requires class level lock.
*/
package mutiThreading.synchronization.ex05;

class Display {

	public synchronized void printNum() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public synchronized void printAlpa() {
		for (int i = 65; i < 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class MyThread extends Thread {

	Display display;

	public MyThread(Display display) {
		this.display = display;
	}

	@Override
	public void run() {
		display.printNum();
	}
}

class MyThread1 extends Thread {

	Display display;

	public MyThread1(Display display) {
		this.display = display;

	}

	@Override
	public void run() {
		display.printAlpa();
	}
}

public class Demo05 {

	public static void main(String[] args) throws InterruptedException {

		Display display = new Display();

		MyThread myThread = new MyThread(display);
		MyThread1 myThread1 = new MyThread1(display);

		myThread.start();
		myThread1.start();

	}

}
