
import java.util.ArrayList;
import java.util.Collections;

public class ColectionSortReverseMethods {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("b");
		list.add("a");
		list.add("c");
		list.add("d");

		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

		// using enhanced loop
		for (String counter : list) {

			System.out.println(counter);
		}

		System.out.println("---------------------");

		// using for loop
		for (int x = 0; x < list.size(); x++) {
			System.out.println(list.get(x));

		}

		System.out.println("---------------------");

		// Reversing using a static method in collections class (Not to be confused with
		// Collection Interface)
		// See code definition
		Collections.reverse(list);

		// Printing after using Collections.reverse
		for (String counter : list) {

			System.out.println(counter);
		}

	}

}
