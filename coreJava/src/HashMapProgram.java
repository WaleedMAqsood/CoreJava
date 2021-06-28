import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {

		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		hs.put("blue", 1);

		hs.put("Green", 2);

		hs.put("yellow", 3);

		if (hs.containsValue(3))

		{

			System.out.println("Yes it contains the value ");

			String key = getKeyforvalue(hs, 3);
			System.out.print("The Key is " + key);
		}

		else

		{

			System.out.println("No it does not");

		}

	}

	public static String getKeyforvalue(HashMap<String, Integer> hs1, int value) {

		String returnkey = "";
		for (Map.Entry<String, Integer> x : hs1.entrySet()) {

			// System.out.println(x.getKey()+" " +x.getValue());
			if (x.getValue().equals(3)) {
				returnkey = x.getKey();
				break;

			}

		}

		return returnkey;
	}

}
