import java.util.HashMap;

public class ClearHashMapProgram {
	public static void main(String args[]) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "Red");
		hs.put(2, "Green");
		hs.put(3, "Black");
		hs.put(4, "White");
		hs.put(5, "Blue");

		System.out.println("Is hash map empty: " + hs.isEmpty());

		hs.clear();

		System.out.println("Is hash map empty: " + hs.isEmpty());
	}
}
