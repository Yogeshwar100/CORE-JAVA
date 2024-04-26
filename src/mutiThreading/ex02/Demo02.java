package mutiThreading.ex02;

class MyThread extends Thread{
	
	public void start() {
		super.start();
		System.out.println("start method");
	}
	
	public void run() {
		System.out.println("run method");
	}
	
}
public class Demo02 {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
		System.out.println("main method");
	}

}
