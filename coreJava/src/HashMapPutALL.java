import java.util.HashMap;
import java.util.Map;

public class HashMapPutALL {

	public static void main(String[] args)

	{

		HashMap<Integer, String> first = new HashMap<Integer, String>();
		HashMap<Integer, String> Second = new HashMap<Integer, String>();

		first.put(1, "haba");
		first.put(2, "daba");
		first.put(3, "yaba");
		first.put(4, "jaba");

		Second.putAll(first);

		for (Map.Entry<Integer, String> x : Second.entrySet()) {

			System.out.println(x.getKey() + " " + x.getValue());

		}

	}

}
