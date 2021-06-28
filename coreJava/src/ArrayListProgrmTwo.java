import java.util.ArrayList;

public class ArrayListProgrmTwo {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		int max = 0;

		myList.add(8);
		myList.add(3);
		myList.add(6);
		myList.add(7);

		for (int i = 0; i < myList.size(); i++) {

			if (max < myList.get(i)) {
				max = myList.get(i);

			}
		}
		System.out.print(max);

	}

}
