import java.util.*;

class ThreadRandom implements Runnable {
	Thread t;
	ThreadRandom() {
		t = new Thread(this,"Random Integer Thread");
		t.start();
	}

	public void run() {
		try {
			Random R = new Random();
			for (int i = 0; i < 5; i++) {
				int n = R.nextInt(100);
				System.out.println("Random Integer : " +n);
				
				if((n%2) == 0) {
					new ThreadSq(n);
				}
				else {
					new ThreadCu(n);
				}
				Thread.sleep(1000);
			}	
		}catch(InterruptedException e){
			System.out.println("RandomIntegerThread Interrupted");
		}
	}
}

class ThreadSq implements Runnable {
	int num;
	Thread s;
	ThreadSq(int num) {
		this.num = num;
		s = new Thread(this,"Square Thread");
		s.start();
	}

	public void run() {
		System.out.println("Square of "+num+" = "+(num*num));
	}
}
class ThreadCu implements Runnable {
	int num;
	Thread c;
	ThreadCu(int num) {
		this.num = num;
		c = new Thread(this,"Cube Thread");
		c.start();
	}

	public void run() {
		System.out.println("Cube of "+num+" = "+(num*num*num));
	}
}

class ThreadPractice2 {
	public static void main(String args[]){
		ThreadRandom R = new ThreadRandom();
		try {
			R.t.join();
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
	}
}