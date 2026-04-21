package q2_implementRunnable;

class ImplementDemo implements Runnable{
	public void run() {
		System.out.println("Running in: "+Thread.currentThread().getName());
	}
}

public class ImplementRunnable {

	public static void main(String args[])
	{
		Thread t=new Thread(new ImplementDemo());
		t.start();		
	}
}
