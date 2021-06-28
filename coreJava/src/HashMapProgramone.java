import java.util.HashSet;

public class HashMapProgramone {

	static HashSet<String> values() {

		HashSet<String> hs = new HashSet<String>();

		hs.add("name1");
		hs.add("name2");
		hs.add("3");

		return hs;

	}

	public static void main(String[] args) {

		System.out.print(values());

	}
}
