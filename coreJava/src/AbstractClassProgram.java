
abstract class AbstractExpl {

	// static method cannot be overridden
	void myMethod() {

		System.out.print("Methods can have implemenations in abstract classes");
	}

	// abstract method in abstract class
	public abstract int sum(int x, int y);

	public abstract double multiplication(double x, double y);
}

class Calc extends AbstractExpl {
	// This class is extending an abstract class
	// All abstract methods need to be implemented in the class extending it

	public int sum(int x, int y) {

		return x + y;

	}

	public double multiplication(double x, double y) {

		return x + y;

	}
}

public class AbstractClassProgram {

	public static void main(String[] args) {
		/*
		 * Abstract class cannot be instantiated. So what we are doing here is we are
		 * Creating a reference variable of an abstract class. And using the Reference
		 * variable to refer to the object of the derived class.
		 */
		AbstractExpl obj = new Calc();
		int sum = obj.sum(44, 55);
		double multi = obj.multiplication(20, 4);
		System.out.println("The Sum is :" + sum);
		System.out.print("The Multiplication is :" + multi);

	}
}
