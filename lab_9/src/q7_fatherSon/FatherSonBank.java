package q7_fatherSon;

import java.util.concurrent.ThreadLocalRandom;

class Share {
	boolean son = false;
}

class Bank {
	 public static int amount = 600;
	 
}

class Father extends Bank implements Runnable {
	
	Share share;
	
	Father(Share share) {
		this.share = share;
	}

	public void run() {
		while(true) {
			synchronized(share) {
				while(share.son) {
					try {
						share.wait();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				int debit = ThreadLocalRandom.current().nextInt(1,200);
				System.out.print("Father added " + debit);
				System.out.println("\n=================================");
				System.out.println("Previous amount: " + Bank.amount);
				Bank.amount += debit;
				System.out.println("New amount: " + Bank.amount);
				System.out.println("=================================\n");
				
				if(Bank.amount>=2000) {
					share.son = true;
					share.notifyAll();
					continue;
				}
			}
		}
	}
	
}

class Son extends Bank implements Runnable{

	Share share;
	Son(Share share) {
		this.share = share;
		
	}
	
	public void run() {
		while(true) {
			synchronized(share) {
				while(!share.son) {
					try {
						share.wait();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				int withdraw = ThreadLocalRandom.current().nextInt(1, 150);
				System.out.print("Son used " + withdraw);
				System.out.println("\n=================================");
				System.out.println("Previous amount: " + Bank.amount);
				Bank.amount -= withdraw;
				System.out.println("New amount: " + Bank.amount);
				System.out.println("=================================\n");
				if(Bank.amount<500) {
					share.son = false;
					share.notifyAll();
					continue;
				}
			}
		}
	}
	
}

public class FatherSonBank {
	public static void main(String[] args) {
		
		Share share = new Share();
		
		Father p = new Father(share);
		Son c = new Son(share);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
	}
}
