import java.util.Arrays;

public class ArraySortMethod {
	public static void main(String args[]) {

		String aList[] = { "a", "b", "c", "f", "d", "e" };
		show(aList);
		System.out.println("---------------------------");
		Arrays.sort(aList);
		show(aList);
	}

	public static void show(String[] list) {
		for (String counter : list) {
			System.out.println(counter);

		}

	}
}
