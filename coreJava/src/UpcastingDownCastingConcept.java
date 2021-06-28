class Fruit {
	String name;

	void method() {
		System.out.println("This is a method in Parent class Fruit");

	}

}

class Apple extends Fruit {
	int id;

	void method() {
		System.out.println("This is a method in child class Apple");

	}

}

public class UpcastingDownCastingConcept {

	public static void main(String args[]) {

		Fruit ft = new Apple();
		ft.name = "Geeks";

		// ft.id wil not be accessable because it is in child class
		System.out.println(ft.name);

		// This method is overridden
		ft.method();

		/*
		 * We cannot implicitly downcast it will result in an error we will have to
		 * explicitly downcast
		 */

		// Downcasting Explicitly

		Apple ap = (Apple) ft;

		ap.id = 1;
		System.out.println(ap.id);
		System.out.println(ap.name);
		ap.method();

	}

}
