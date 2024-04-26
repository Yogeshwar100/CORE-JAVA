/*
Joining main thread in child thread:
 
*/
package mutiThreading.ex07;

public class Demo07 {

	public static void main(String[] args) throws InterruptedException {

		Thread.currentThread().join(); //deadlock
		System.out.println("MAIN THREAD");

	}

}
