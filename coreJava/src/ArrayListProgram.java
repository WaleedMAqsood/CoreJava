import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {

		// In Java Collections only store objects no primitives are allowed.
		// Objects called wrappers represent primitive types

		// List is an interface we cannot directly instantiate it.But what we can do is
		// create an object of those classes which implements List (See Code
		// Definitions)
		List<Integer> myList = new ArrayList<Integer>();

		/*
		 * Here what is actually happening is, there is a concept of auto-boxing and
		 * auto-unboxing When you try to store an int in List<Integer> Java compiler
		 * converts it to an integer
		 */
		myList.add(6);
		myList.add(5);
		myList.add(3);
		myList.add(2);

		for (int i : myList) {

			System.out.println(i);

		}

	}

}
