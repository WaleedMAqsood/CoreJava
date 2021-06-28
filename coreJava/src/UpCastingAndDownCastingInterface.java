interface myInterface {

	void method1();

}

class myclass1 implements myInterface {

	public void method1() {

		System.out.println("This method is in myclass1");

	}

	void method2() {

		System.out.println("This method is in myclass1");
	}

}

class myclass2 extends myclass1 {

	public void method3() {
		System.out.println("This is in myclass2 which extends myclass1");

	}

	public void method4() {
		System.out.println("This is in myclass2 which extends myclass1");

	}

}

public class UpCastingAndDownCastingInterface {

	public static void main(String args[]) {

		myInterface d = new myclass2();
		d.method1();

		// Downcasting Explicitly
		myclass2 x = (myclass2) d;
		x.method3();
		x.method4();

	}
}
