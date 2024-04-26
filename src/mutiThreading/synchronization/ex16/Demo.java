package mutiThreading.synchronization.ex16;

class MyThread extends Thread {

	public MyThread(ThreadGroup pg, String name) {
		super(pg, name);
	}

	@Override
	public void run() {
		System.out.println("CHILD THREAD");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Demo {
	public static void main(String[] args) throws InterruptedException {

		ThreadGroup pg = new ThreadGroup("ParentGroup");
		ThreadGroup cg = new ThreadGroup(pg, "ChildGroup");

		MyThread t1 = new MyThread(pg, "Thread1");
		MyThread t2 = new MyThread(pg, "Thread2");
		t1.start();
		t2.start();
		System.out.println("Active threads: "+pg.activeCount());
		System.out.println("Active threadGroups: "+pg.activeGroupCount());
		pg.list();
		Thread.currentThread().sleep(10000);
		System.out.println("Active threads: "+pg.activeCount());
		System.out.println("Active threadGroups: "+pg.activeGroupCount());
		pg.list();

	}

}
