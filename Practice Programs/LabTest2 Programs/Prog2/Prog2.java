import java.util.*;
import java.lang.*;

class company {
	int year_of_joining;
	Scanner in = new Scanner(System.in);
	company() throws NotPossible {
		System.out.println("Enter the Employee's Year of Joining: ");
		year_of_joining = in.nextInt();
		if(year_of_joining < 2005) throw new NotPossible(year_of_joining);
	}
}

class employee extends company {
	int age;
	employee() throws NotPossible {
		super();
		System.out.println("Enter the Employee's age: ");
		age = in.nextInt();
		if(age < 18 || age > 60) throw new NotPossible(age);
		System.out.println("Normal Exit");		
	}
}

class Prog2 {
	public static void main(String args[]) {
		try{
			employee ob = new employee();	
		}catch(NotPossible e){
			System.out.println(e);
		}		
	}
}