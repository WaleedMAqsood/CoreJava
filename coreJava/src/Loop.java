
public class Loop {
	public static void main(String[] args) {

		int value = 9;
		for (int i = 2; i <= value; i++) {
			for (int x = 2; x <= i / 2; x++) {
				if (i % x == 0)
					System.out.println(i);

			}
		}
	}
}