import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListAndSet {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);

		System.out.print(removeduplicates(list));

	}

	public static Set<Integer> removeduplicates(List<Integer> ls) {

		// Set does not take duplicate values
		Set<Integer> temp = new HashSet<Integer>();
		temp.addAll(ls);
		return temp;
	}

}
