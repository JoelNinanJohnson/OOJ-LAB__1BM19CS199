import java.util.*;
import java.lang.*;

class Father {
	int age;
	Scanner in = new Scanner(System.in);
	Father() throws WrongAge {
		System.out.print("Enter the Father's age: ");
		age = in.nextInt();
		if(age < 0) throw new WrongAge(age);
	}
}

class Son extends Father {
	int age;
	Son() throws WrongAge {
		super();
		System.out.print("Enter the Son's age: ");
		age = in.nextInt();
		if(age < 0) throw new WrongAge(age);
		if(age > super.age || age == super.age) throw new WrongAge(age);
		System.out.println("Normal Exit");		
	}
}

class Lab8 {
	public static void main(String args[]) {
		try{
			Son s = new Son();	
		}catch(WrongAge e){
			System.out.println(e);
		}		
	}
}