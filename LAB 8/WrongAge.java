import java.util.*;
import java.lang.*;

public class WrongAge extends Exception {
	int a;
	WrongAge(int a){
		this.a = a;		
	}
	public String toString(){
		return "WRONG INPUT AGE "+a;
	}
}
