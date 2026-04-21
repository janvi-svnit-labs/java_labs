package q1_extendThreads;

class ExtendDemo extends Thread
{
	public void run()
	{
		System.out.println("Running in: "+Thread.currentThread().getName());
	}
}

public class ExtendThreadsImplementation{
	public static void main(String ars[])
	{
		ExtendDemo t=new ExtendDemo();
		t.start();
	}
}
