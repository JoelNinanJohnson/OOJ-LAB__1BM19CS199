import java.util.*;
import java.lang.*;
class Generics<X,Y,Z>{
	X ob1;
	Y ob2;
	Z ob3;
	
	Generics(X x,Y y,Z z){
		ob1 = x;
		ob2 = y;
		ob3 = z;
	}

	void showTypes(){
		System.out.println("Type of X is "+ob1.getClass().getName());
		System.out.println("Type of Y is "+ob2.getClass().getName());
		System.out.println("Type of Z is "+ob3.getClass().getName());	
	}

	X getob1(){
		return ob1;
	}
	Y getob2(){
		return ob2;
	}
	Z getob3(){
		return ob3;
	}
}

class Prog1{
	public static void main(String args[]){
		
		Generics<Integer,Double,String> A = new Generics<Integer,Double,String>(22,1.036,"Test");

		A.showTypes();

		int i = A.getob1();
		System.out.println("Value:"+i);
		
		double d = A.getob2();
		System.out.println("Value:"+d);
		
		String str = A.getob3();
		System.out.println("Value:"+str);
	}
}