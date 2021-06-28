import java.util.ArrayList;

interface Validate1 {

	boolean check(Employee emp);
}

class Employee {
	String name;
	int performanceRating;
	double salary;

	Employee(String nm, int rating, double sal) {
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

public class FunctionalInterfaceLambdaExpression {

	public static void main(String[] args) {

		Employee e1 = new Employee("haba", 5, 9999);
		Employee e2 = new Employee("daba", 4, 1234.00);
		Employee e3 = new Employee("jaba", 4, 8764);
		Employee e4 = new Employee("xapa", 4, 2769);

		ArrayList<Employee> empArr = new ArrayList<Employee>();

		empArr.add(e1);
		empArr.add(e2);
		empArr.add(e3);
		empArr.add(e4);

		Validate1 validatePrefor = e -> e.getperformanceRating() >= 5;

		filter(empArr, validatePrefor);

	}

	static void filter(ArrayList<Employee> list, Validate1 rule) {

		for (Employee e : list)

		{

			if (rule.check(e))

				System.out.print(e);

		}
	}
}