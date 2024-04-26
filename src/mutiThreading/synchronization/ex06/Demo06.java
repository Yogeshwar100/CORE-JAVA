
package mutiThreading.synchronization.ex06;

class Display {

	public void greet(String name) {
		;;;;;;;;;;;
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Morning:");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);

			}
		}
		;;;;;;;;;;
	}
}

class MyThread extends Thread {

	Display display;
	String name;

	public MyThread(Display display, String name) {
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {
		display.greet(name);
	}
}

public class Demo06 {

	public static void main(String[] args) throws InterruptedException {

		Display display = new Display();

		MyThread myThread = new MyThread(display, "MS DHONI");
		MyThread myThread1 = new MyThread(display, "YUVRAJ SINGH");

		myThread.start();
		myThread1.start();

	}

}
