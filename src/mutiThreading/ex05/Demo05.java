/*
 join() method:
 If a thread wants to wait until completing some other thread then we should go for join() method.
 While thread is in waiting state, other thread may be interrupt it that is why join() method throws Interrupted Exception.
 
 */
package mutiThreading.ex05;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("CHILD THREAD");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo05 {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.join();
		//myThread.join(10000);
		for (int i = 0; i < 10; i++) {
			System.out.println("MAIN THREAD");
		}
	}
}