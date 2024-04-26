/*
Joining main thread in child thread:
 
*/
package mutiThreading.ex06;

class MyThread extends Thread{
	
	static Thread mainThread;
	
	@Override
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("CHILD THREAD");
		}
	}
}
public class Demo06 {

	public static void main(String[] args) throws InterruptedException {

		MyThread.mainThread=Thread.currentThread();
		MyThread myThread=new MyThread();
		myThread.start();
		//myThread.join(); //deadlock
		for(int i=0;i<10;i++) {
			System.out.println("MAIN THREAD");
			Thread.sleep(2000);
		}
		
	}

}
