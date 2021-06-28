import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUsingAnnoymus {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();

		values.add(322);
		values.add(432);
		values.add(222);
		values.add(343);
		values.add(233);

		Comparator<Integer> com = new Comparator<Integer>() {
			// Anonymous class
			public int compare(Integer o1, Integer o2) {

				if (o1 > o2)
					return 1;
				return -1;

			}
		};

		Collections.sort(values, com);

		for (int i : values) {
			System.out.println(i);

		}

	}

}
