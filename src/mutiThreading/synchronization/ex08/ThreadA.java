
package mutiThreading.synchronization.ex08;

class ThreadB extends Thread {

	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("CHILD STARTED CALCULATION");
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("CHILD WILL TRYING TO NOTIFY");
			this.notify();
		}
	}
}

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {

		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("MAIN THREAD WILL CALL WAIT()");
			b.wait();
			System.out.println("MAIN THREAD GOT NOTIFICATION");
			System.out.println(b.total);
		}

	}

}
