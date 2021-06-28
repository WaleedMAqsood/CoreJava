interface TestInterface1 {

	// default method
	default void show() {
		System.out.println("Default methof in Inaterface");
	}

	// Abstract method in interface
	void print();
}

interface TestInterface2 {

	// Default method
	default void show() {
		System.out.println("Default TestInterface2");
	}
}

class myclass implements TestInterface1 {

	// default method does not need to be implemented
	// void print method needs to be implemented and it should be public
	public void print() {

		System.out.print("This is the void print method from the interface");

	}

}

// Implementation class code 
public class DefaultMethodInInterface implements TestInterface1, TestInterface2 {
	// Overriding default show method
	public void show() {
		// use super keyword to call the show
		// method of TestInterface1 interface
		TestInterface1.super.show();

		// use super keyword to call the show
		// method of TestInterface2 interface
		TestInterface2.super.show();
	}

	public static void main(String args[]) {
		DefaultMethodInInterface d = new DefaultMethodInInterface();
		d.show();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}
}