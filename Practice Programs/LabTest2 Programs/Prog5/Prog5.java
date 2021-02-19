import java.util.*;
import java.lang.*;

class NewThread implements Runnable {
	String name;
	int interval;
	Thread t;
	NewThread(String name,int interval){
		this.name = name;
		this.interval = interval;
		t = new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			for(int i=1;i<=10;i++){
				System.out.println("Token Number --> "+i);
				Thread.sleep(interval);
			}
		}catch(InterruptedException e){
			System.out.println("Child Interrupted "+name);
		}
	}
}

class Prog5 {
	public static void main(String args[]){
		NewThread ob = new NewThread("Token",1000);
		try{
			ob.t.join();
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}	
	}
}