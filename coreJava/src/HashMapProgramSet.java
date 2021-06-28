import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgramSet {

	public static void main(String args[]) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");

		Set<Entry<Integer, String>> set = hash_map.entrySet();

		System.out.println(set);

		Set<Map.Entry<Integer, String>> s = hash_map.entrySet();

		for (Map.Entry<Integer, String> k : s) {

			System.out.println(k.getKey() + "   " + k.getValue());

		}

	}

}
