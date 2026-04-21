package q4_game;

import java.util.concurrent.ThreadLocalRandom;

class Shared {
	boolean playerA = true; 
	boolean gameover = false;
}

class PointTable {
	static int playerA = 0;
	static int playerB = 0;
	
	static void getPointTable() {
		System.out.println("\nScore till now: ");
		System.out.println("Player-1: " + playerA + "\nPlayer-2: " + playerB);
	}
	
	static void foundWinner() {
		
		System.out.println("===============================================================\n");

		if(playerA>=100 && playerB>=100) System.out.println("Match draw😯😯");
		else if(playerB>=100)	System.out.println("Player-2 won 🎆🎆🎊");
		else if(playerA>=100)		System.out.println("Player-1 won 🎆🎆🎊");
		
		System.out.println("===============================================================\n");
 	}
}

class PlayerA extends PointTable implements Runnable{
	Shared shared;
	
	PlayerA(Shared shared) {
		this.shared = shared;
	}
	
	public void run() {
		while(true) {
			synchronized(shared) {
				
				if(playerA>=100 || playerB>=100) {
					
					shared.notifyAll();
					break;
				}
				
				while(!shared.playerA) {
					try	{
						shared.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				if(shared.gameover) break;
				
				int num = ThreadLocalRandom.current().nextInt(1,21);
				System.out.println("\n=========================================");
				System.out.println("Player-1: " + num);
				System.out.println("=========================================");
				playerA += num;
				
				PointTable.getPointTable();
				
				shared.playerA = false;
				shared.notifyAll();
			}
		}
	}
}

class PlayerB extends PointTable implements Runnable{
	Shared shared;
	
	PlayerB(Shared shared) {
		this.shared = shared;
	}
	
	public void run() {
		while(true) {
			synchronized(shared) {
				
				if(playerA>=100 || playerB>=100) {
					
					if(!shared.gameover) {
						shared.gameover = true;
						PointTable.foundWinner();
					}
					shared.notifyAll();
					break;
				}
				
				while(shared.playerA) {
					try	{
						shared.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				if(shared.gameover) break;
				
				int num = ThreadLocalRandom.current().nextInt(1,21);
				
				System.out.println("\n=========================================");
				System.out.println("Player-2: " + num);
				System.out.println("=========================================");
				playerB += num;
				
				PointTable.getPointTable();
				
				shared.playerA = true;
				shared.notifyAll();
			}
		}
	}
}

public class GameRun {
	public static void main(String[] args) {
		
		Shared shared = new Shared();
		
		PlayerA a = new PlayerA(shared);
		Thread t1 = new Thread(a);
		
		PlayerB b = new PlayerB(shared);
		Thread t2 = new Thread(b);
		
		t1.start();
		t2.start();
	}
}
