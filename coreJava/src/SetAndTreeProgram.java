import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetAndTreeProgram {

	public static void main(String[] args) {

		Set<Integer> value = new HashSet<Integer>();

		value.add(3);
		value.add(5);
		value.add(1);
		value.add(10);
		value.add(3);

		// set without duplicate
		System.out.println(value);

		System.out.println();

		Iterator<Integer> itr = value.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("------------");

		// Sorted Set after passing into treeset

		Set<Integer> nameTreeSet = new TreeSet<Integer>(value);

		System.out.println(nameTreeSet);

		System.out.println("------------");
		Iterator<Integer> itr2 = nameTreeSet.iterator();

		while (itr2.hasNext()) {

			System.out.println(itr2.next());

		}

	}

}