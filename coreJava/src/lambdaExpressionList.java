import java.util.List;
import java.util.ArrayList;

public class lambdaExpressionList {

	public static void main(String[] args) {

		List<String> mylist = new ArrayList<String>();

		mylist.add("Red");
		mylist.add("Green");
		mylist.add("yellow");
		mylist.add("orange");

		// Using For Loop to Print values
		for (int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}

		System.out.println("--------------------------------------");

		// Using enhanced loop to print all the values
		for (String a : mylist) {
			System.out.println(a);
		}
		System.out.println("--------------------------------------");

		// Using Lambda expression to print array List
		mylist.forEach((String values) -> System.out.print(values));

	}

}
