//THREAD PRIORITY: 1-10
//Default Thread priority for every thread is 5.
//1=> MIN_PRIORITY,5=>NORM_PRIORITY,10=>MAX_PRIORITY
//Child thread priority will be inherited from parent thread.
//If we pass argument other than 1 to 10 in setPriority() we will get CE: java.lang.IllegalArgumentException 

package mutiThreading.ex03;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("CHILD THREAD");

		}
	}
}

public class Demo03 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.setPriority(10);//Some OS won't provides support for Thread Priority
		myThread.start();
		System.out.println("Thread Priority of CHILD THREAD:"+ myThread.getPriority());
		System.out.println("Thread Priority of MAIN THREAD:"+ Thread.currentThread().getPriority());
		for (int i = 0; i < 5; i++) {
			System.out.println("MAIN THREAD");
		}
	}

}
