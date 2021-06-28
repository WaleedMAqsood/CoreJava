import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaexpression {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();

		values.add(309);
		values.add(998);
		values.add(443);
		values.add(994);
		values.add(444);

		Comparator<Integer> com = (o1, o2) -> {

			if (o1 > o2)
				return 1;
			return -1;

		};

		// it takes the object of comparator (Interfaces cannot be instantiated)
		Collections.sort(values, com);

		for (int i : values) {
			System.out.println(i);

		}
	}
}
