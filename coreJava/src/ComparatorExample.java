import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Comp implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		if (o1 > o2)
			return 1;

		return -1;

	}
}

public class ComparatorExample {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();

		myList.add(309);
		myList.add(998);
		myList.add(443);
		myList.add(994);
		myList.add(444);

		/*
		 * Comparator is an interface it cannot be instantiated.Creating a Reference
		 * variable of Comparator and using the Reference variable to refer to the
		 * object of the class implementing it
		 */
		Comparator<Integer> com = new Comp();

		/*
		 * See the code definition of sort for the second parameter. Comparator can
		 * accept a super class of T Comparator <? super T>
		 */
		Collections.sort(myList, com);

		for (int i : myList) {
			System.out.println(i);

		}

	}

}
