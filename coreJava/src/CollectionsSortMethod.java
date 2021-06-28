
import java.util.*;

public class CollectionsSortMethod {
	public static void main(String[] args) {

		List<Integer> myArray = new ArrayList<Integer>();
		myArray.add(22);
		myArray.add(7);
		myArray.add(20);
		// Using static method of Collections class (Not to be confuse with Collection
		// Interface)
		Collections.sort(myArray);
		System.out.print(myArray);

	}
}