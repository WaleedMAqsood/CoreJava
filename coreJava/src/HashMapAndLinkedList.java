import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class HashMapAndLinkedList {
	public static void main(String[] args) {
		HashMap<Integer, String> view = new HashMap<Integer, String>();

		view.put(1, "name1");
		view.put(2, "name2");
		view.put(3, "name3");

		// See code definition
		List<String> myList = new LinkedList<String>(view.values());
		System.out.print(myList.get(1));

	}

}
