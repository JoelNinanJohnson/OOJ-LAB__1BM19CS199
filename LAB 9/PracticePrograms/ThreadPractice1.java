import java.util.*;
import java.lang.*;

class OddThread extends Thread {
	int odd_sum=0;
	OddThread(){
		super("ODD Thread");
		System.out.println("Child Thread: "+this);
		start();
	}
	public void run(){
		try{
			for(int i=1;i<=100;i++){
				if(i%2 != 0){
					odd_sum = odd_sum + i;
					Thread.sleep(100);
				}
			}
		}catch(InterruptedException e){
			System.out.println("Child Interrupted");
		}
		System.out.println("Sum of Odd Numbers from 1 to 100: "+odd_sum);
	}
}

class ThreadPractice1 {
	public static void main(String args[]){
		int even_sum=0;
		new OddThread();
		try{
			for(int i=1;i<=100;i++){
				if(i%2 == 0){
					even_sum = even_sum + i;
					Thread.sleep(200);
				}
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Sum of Even Numbers from 1 to 100: "+even_sum);	
	}
}