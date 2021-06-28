import java.util.HashMap;
import java.util.Map;

public class HashMapEntrySet {

	public static void main(String[] args) {

		Map<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "name1");
		hs.put(2, "name2");
		hs.put(3, "name3");

		for (Map.Entry<Integer, String> x : hs.entrySet()) {

			System.out.println(x.getKey() + "  " + x.getValue());

		}
	}

}
