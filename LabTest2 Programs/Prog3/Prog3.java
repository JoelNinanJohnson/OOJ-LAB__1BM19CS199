import MathOperations.*;
import java.util.*;

class Prog3 {
	public static void main(String args[]){
		double x,y;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two numbers:");
		x = in.nextDouble();
		y = in.nextDouble();

		System.out.println("Sum        --> "+x+" + "+y+" = "+Addition.add(x,y));
		System.out.println("Difference --> "+x+" - "+y+" = "+Subtraction.subtract(x,y));
		System.out.println("Product    --> "+x+" * "+y+" = "+Multiplication.multiply(x,y));
		System.out.println("Quotient   --> "+x+" / "+y+" = "+Division.divide(x,y));
	}
} 