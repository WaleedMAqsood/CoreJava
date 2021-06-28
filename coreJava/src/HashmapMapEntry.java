import java.util.*;

public class HashmapMapEntry {
	public static void main(String args[]) {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		// hashmap does not allow duplicate key

		hs.put(1, "namea");
		hs.put(2, "nameb");
		hs.put(3, "namec");

		System.out.println("This is the value " + hs.get(2));

		for (String y : hs.values()) {

			System.out.println(y);

		}
		System.out.println("-------------------------------------------------");

		for (Integer z : hs.keySet()) {

			System.out.println(z);

		}
		System.out.println("-------------------------------------------------");

		for (Map.Entry<Integer, String> g : hs.entrySet()) {

			System.out.println(g.getKey() + " " + g.getValue() + "  " + g);

		}

		System.out.println("-------------------------------------------------");

		/*
		 * System.out.println(hs);
		 * 
		 * 
		 * System.out.println(hs.entrySet());
		 * 
		 * for (Map.Entry<Integer,String> x:hs.entrySet() {
		 * System.out.println(x.getKey()+" "+x.getValue()); }
		 */

	}

}
