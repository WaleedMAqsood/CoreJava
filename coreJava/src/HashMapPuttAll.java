import java.util.HashMap;

public class HashMapPuttAll {

	public static void main(String args[]) {

		HashMap<Integer, String> first = new HashMap<Integer, String>();
		HashMap<Integer, String> second = new HashMap<Integer, String>();

		first.put(1, "a");
		first.put(2, "b");
		first.put(3, "c");
		first.put(4, "d");

		System.out.println(first);

		second.put(5, "e");
		second.put(6, "f");
		second.put(7, "g");
		second.put(8, "g");

		System.out.println(second);

		second.putAll(first);

		System.out.print(second);

	}

}
