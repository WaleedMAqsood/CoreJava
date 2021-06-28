import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetandtreeSet {

	public static void main(String[] args) {

		Set<String> value = new HashSet<String>();

		value.add("joe");
		value.add("green");
		value.add("john");
		value.add("blue");
		value.add("green");

		// set without duplicate
		System.out.println(value);

		System.out.println();

		Iterator<String> itr = value.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

		System.out.println("------------");

		// Sorted Set after passing into treeset

		Set<String> nameTreeSet = new TreeSet<String>(value);

		System.out.println(nameTreeSet);

		System.out.println("------------");

		Iterator<String> itr2 = nameTreeSet.iterator();

		while (itr2.hasNext()) {

			System.out.println(itr2.next());

		}

	}

}
