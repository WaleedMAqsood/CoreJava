class Fruits {

	void methodFruitFirst() {
		System.out.println("This is a method in Parent class Fruit");

	}

	void methodFruitSecond() {
		System.out.println("This is a second method in Parent class Fruit");

	}

}

class Apples extends Fruits {
	int id;

	void methodApple() {
		System.out.println("This is a method in child class Apple");

	}

}

class Oranges extends Apples {

	void methodOrange() {

		System.out.println("This is a method in child class Orange");

	}

	@Override
	void methodFruitSecond() {

		System.out.println("This is a method int child class Orange");

	}
}

public class InterfaceProgram {

	public static void main(String args[]) {

		Oranges or = new Oranges();
		or.methodFruitFirst();
		or.methodApple();
		or.methodOrange();

		// Creating a variable of parent class And using the Reference variable
		// to refer to the object of the derived class
		Fruits ft = new Oranges();
		ft.methodFruitFirst();
		ft.methodFruitSecond();
	}

}
