import java.util.HashMap;

public class HashMapCountSizeMethod {

	public static void main(String[] args) {

		// int countvalues=0;
		HashMap<Integer, String> count = new HashMap<Integer, String>();

		count.put(1, "namea");
		count.put(2, "nameb");
		count.put(3, "namec");

		/*
		 * for (Integer y: count.keySet()) {
		 * 
		 * countvalues++; } System.out.print(countvalues);
		 */
		System.out.print(count.size());
	}

}
