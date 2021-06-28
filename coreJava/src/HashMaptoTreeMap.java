
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class HashMaptoTreeMap {

	public static void main(String[] args) {

		HashMap<String, String> hs = new HashMap<String, String>();

		hs.put("fruit", "apple");
		hs.put("car", "Nitro");
		hs.put("tv", "Tech");

		System.out.println();

		// TreeMap is sorted
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.putAll(hs);
		System.out.println(tm);

		for (Map.Entry<String, String> x : tm.entrySet()) {

			System.out.println("Key = " + x.getKey() + ", Value = " + x.getValue());

		}
	}

}
