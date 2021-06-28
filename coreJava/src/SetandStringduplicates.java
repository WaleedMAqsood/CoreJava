
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class SetandStringduplicates {
	public static void main(String[] args) {

		String array[] = new String[] { "A", "A", "B", "B", "C", "C" };
		List<String> arraylist = Arrays.asList(array);
		System.out.print(removeduplicates(arraylist));

	}

	public static Set<String> removeduplicates(List<String> values) {

		Set<String> tempSet = new HashSet<String>();
		for (String x : values)
			tempSet.add(x);
		return tempSet;

	}

}
