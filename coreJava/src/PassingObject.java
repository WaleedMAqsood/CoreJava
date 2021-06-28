
class Example2 {

	int value;

	Example2(int value) {
		this.value = value;

	}

	Example2() {
		value = 0;

	}

}

public class PassingObject {

	public static void main(String args[]) {

		Example2 x = new Example2(44);

		// Here the reference is being passed
		method(x);

		System.out.print(x.value);
	}

	public static void method(Example2 test) {

		// Changing the reference to refer to a different memory location The changes
		// will not be reflected back
		test = new Example2();

		test.value = 324;

	}

}
