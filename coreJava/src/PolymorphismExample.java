class ParentClass {

	void MethodOne() {
		System.out.println("This method is in Parent class");

	}

	void MethodTwo() {
		System.out.println("This method is also  in Parent class");
	}

}

class ChildClass extends ParentClass {

	@Override
	void MethodTwo() {
		System.out.println("This is method overding");

	}

	void MethodThree() {

		System.out.print("This is a method in childClass only");

	}

}

public class PolymorphismExample {

	public static void main(String args[]) {

		/* Parent class reference is being used to refer a child class. */
		ParentClass x = new ChildClass();

		x.MethodOne();
		x.MethodTwo();

		// Downcasting Explicitly
		ChildClass y = (ChildClass) x;

		y.MethodOne();

	}

}
