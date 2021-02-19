import java.util.*;
import java.lang.*;

public class NotPossible extends Exception {
	int a;
	NotPossible(int a){
		this.a = a;		
	}
	public String toString(){
		return "NOT POSSIBLE "+a;
	}
}
