import java.util.*;

import java.util.Iterator;

public class SetandIterator {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();

		s.add("No");
		s.add("duplicates");
		s.add("duplicates");
		s.add("allowed");

		System.out.println(s);
		Iterator<String> iterator = s.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
