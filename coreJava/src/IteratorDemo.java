import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String args[]) {

		ArrayList<String> myArray = new ArrayList<String>();

		myArray.add("Code");
		myArray.add("in");
		myArray.add("Java");

		// See the code definition
		Iterator<String> iterator = myArray.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}

	}

}
