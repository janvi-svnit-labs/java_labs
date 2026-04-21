package q6_fiboAndPrime;

class SharedData {
	boolean fibo = false;
}

class Fibo extends Thread{
	
	SharedData SharedData;

	Fibo(SharedData SharedData) {
		this.SharedData = SharedData;
		setPriority(8);
	}
	
	public void run() {
		
		long a =1 , b=1;
		
		try{
			synchronized(SharedData) {
				System.out.println("Fibonacci series: ");
				
				System.out.print(a + " " + b);
				for(int i = 3;i<=50;i++) {
					long c= a+b;
					System.out.print(" " + c);
					b = a;
					a = c;
				}
				
				System.out.println("Thread is sleeping . . .");
				Thread.sleep(1000);
				
				SharedData.fibo = true;
				SharedData.notify();
				
				SharedData.wait();
			}
			
			for(int i = 51; i<=60 ; i++) {
				long c = a+b;
				System.out.print(" " + c);
				b=a;
				a=c;
			}
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Prime extends Thread{
	
	SharedData SharedData;
	
	Prime (SharedData SharedData) {
		this.SharedData = SharedData;
		setPriority(5);
	}
	
	public void run() {
		try{
			synchronized(SharedData) {
				while(!SharedData.fibo)
					SharedData.wait();
				
				System.out.print("Prime Numbers: ");
			
				int count = 0 , i = 2;
				while(count<25) {
					if(isPrime(i)) {
						System.out.print(i+" ");
						count ++;
					}
					i++;
				}
				SharedData.notify();
			}
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	boolean isPrime(int k) {
		for(int i=2;i<=Math.sqrt(k);i++) {
			if(k%i == 0) return false;
		}
		return true;
	}

}

public class FiboPrimeDemo {
	public static void main(String[] args) {
		
		
		SharedData shared = new SharedData();
		
		Fibo f = new Fibo(shared);
		Prime p =new Prime(shared);
		
		f.start();
		p.start();
	}
}
