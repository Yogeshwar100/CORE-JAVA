package mutiThreading.ex08;

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("CHILD THREAD");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println("CHILD THREAD GOT INTERRUPTED");
			}
		}
	}
}

public class Demo08 {

	public static void main(String[] args) throws InterruptedException {

		MyThread myThread = new MyThread();
		myThread.start();
		myThread.interrupt();
		System.out.println(myThread.isInterrupted());

		for (int i = 0; i < 10; i++) {
			System.out.println("MAIN THREAD");
		}

	}

}
