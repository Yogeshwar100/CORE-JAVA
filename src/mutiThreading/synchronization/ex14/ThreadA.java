package mutiThreading.synchronization.ex14;


public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		ThreadGroup g1 = new ThreadGroup("FIRST GROUP");
		System.out.println(g1.getParent().getName());

		ThreadGroup g2 = new ThreadGroup(g1, "SECOND GROUP");
		System.out.println(g2.getParent().getName());

	}

}
