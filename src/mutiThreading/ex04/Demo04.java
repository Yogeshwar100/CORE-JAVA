/*
yield() => It will pause the current executing thread and will give chance to Thread having same priority. 
Once that thread completes it will again resume execution.
Used in case of Thread which takes long time to finish execution or
If you have logic that needs to be executed by another thread before continuing with the current thread's execution
*/
package mutiThreading.ex04;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("CHILD THREAD");
			Thread.yield();
		}
	}
}

public class Demo04 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("MAIN THREAD");
		}

	}

}
