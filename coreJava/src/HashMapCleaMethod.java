
import java.util.HashMap;

public class HashMapCleaMethod {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "haba");
		hm.put(2, "daba");
		hm.put(3, "yaba");
		hm.put(4, "jaba");
		System.out.println(hm);
		hm.clear();
		System.out.print(hm);

	}

}
