package HashMapStudent;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {

	public static void main(String[] args) {

		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
		hm = info();

		for (Map.Entry<Integer, Student> x : hm.entrySet()) {

			System.out.println(x.getKey() + " " + x.getValue().getStudentid() + " " + x.getValue().getName() + " "
					+ x.getValue().getBirthday() + " " + x.getValue().getGender() + " " + x.getValue().getCourse()
					+ "");

		}

	}

	private static HashMap<Integer, Student> info() {

		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();

		hm.put(1, new Student("2123", "Clark Kent", "22", "July 9", "Male", " Java"));
		hm.put(2, new Student("2124", "Bruce Wayne", "24", "July 12", "Male", " Java"));
		hm.put(3, new Student("2125", "Sara John", "26", "June 23", "Female", "Java"));
		hm.put(4, new Student("2126", "Ron Don", "26", "January 1", "Female", " Java"));
		hm.put(5, new Student("2127", "Joe Don", "24", "December 2", "Male", " Java"));
		hm.put(6, new Student("2128", "Jay Won", "23", "October 4", "Female", " Java"));

		return hm;

	}
}