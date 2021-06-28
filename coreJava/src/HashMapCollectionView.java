import java.util.*;

public class HashMapCollectionView {

	public static void main(String args[]) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "yellow");
		hs.put(2, "green");
		hs.put(3, "Blue");
		hs.put(4, "black");
		// hashmap can have duplicate values
		hs.put(5, "Blue");

		// Collection View
		System.out.println("Collection view is: " + hs.values());
	}
}