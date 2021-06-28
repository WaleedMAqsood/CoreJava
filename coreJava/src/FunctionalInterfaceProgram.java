import java.util.ArrayList;

interface Assessment {

	boolean check(Employment Employment);

}

class AssessmentPerformence implements Assessment {

	public boolean check(Employment Employment) {
		return (Employment.getperformanceRating() >= 5);

	}

}

class AssessmentName implements Assessment {
	public boolean check(Employment Employment) {

		return (Employment.getName().startsWith("p"));

	}

}

class Employment {
	String name;
	int performanceRating;
	double salary;

	Employment(String nm, int rating, double sal) {
		name = nm;
		performanceRating = rating;
		salary = sal;
	}

	public String getName() {

		return name;
	}

	public int getperformanceRating() {

		return performanceRating;

	}

	public double getSalary() {

		return salary;

	}

	public String toString() {

		return name + ":" + performanceRating + ":" + salary;

	}

}

public class FunctionalInterfaceProgram {

	public static void main(String[] args) {

		Employment e1 = new Employment("james", 5, 3434);
		Employment e2 = new Employment("dave", 4, 1234.00);
		Employment e3 = new Employment("Joe", 4, 8764);
		Employment e4 = new Employment("Jay", 4, 2769);

		ArrayList<Employment> empArr = new ArrayList<Employment>();

		empArr.add(e1);
		empArr.add(e2);
		empArr.add(e3);
		empArr.add(e4);

		for (Employment x : empArr) {
			if (x.getperformanceRating() >= 5) {
				System.out.println(x);

			}

		}
		Assessment rule = new AssessmentPerformence();

		for (Employment y : empArr) {
			if (rule.check(y))
				System.out.println(y);

		}

		checkMethod(empArr, new AssessmentPerformence());

	}

	static void checkMethod(ArrayList<Employment> list, Assessment rule) {

		for (Employment e : list) {

			if (rule.check(e))
				System.out.println(e);

		}

	}
}
