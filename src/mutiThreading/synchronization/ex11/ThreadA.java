//If we calling wait(),notify(),notifyAll() methods in non-synchronous code then we will get R.E saying java.lang.IllegalMonitorStateException.
package mutiThreading.synchronization.ex11;

class ThreadB extends Thread {

}

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().isDaemon());
		//After starting Thread we can't set it as Daemon thread. 
		//Thread.currentThread().setDaemon(true);//RE: java.lang.IllegalThreadStateException 
		ThreadB b=new ThreadB();
		System.out.println(b.isDaemon());
		b.setDaemon(true);
		System.out.println(b.isDaemon());
		}

}
