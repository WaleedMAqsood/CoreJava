
class Example {
	int value;

	Example(int value) {
		this.value = value;

	}
}

public class PassingObjectTwo {

	public static void main(String args[]) {

		Example x = new Example(44);

		// Here the reference is being passed
		method(x);

		System.out.print(x.value);
	}

	public static void method(Example test) {

		// They are referencing to the same memory location so any changes here will be
		// reflected back
		test.value = 555;

	}

}
