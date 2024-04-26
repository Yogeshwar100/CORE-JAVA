/*
If we calling wait(),notify(),notifyAll() methods in non-synchronous code then we will get
R.E saying java.lang.IllegalMonitorStateException.

Daemon Thread will perform task until Non-Daemon thread dead.

Daemon threads will perform tasks in the background, but they will only continue to execute as long as there
are non-daemon threads running. 
*/
package mutiThreading.synchronization.ex12;

class ThreadB extends Thread {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("CHILD THREAD");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadB b=new ThreadB();
		b.setDaemon(true);
		b.start();
		System.out.println("MAIN THREAD");
		}

}
