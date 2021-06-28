public class GenericMethodExample {

	public static <E> void print(E[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}

	}

	public static void main(String[] args) {
		Integer[] array = { 2, 4, 5, 6, 2 };
		Double[] array2 = { 3.4, 2.5, 3.3, 6.4 };

		System.out.println("Array 1 Contins:");
		print(array);

		System.out.println("Array 2 Contains");
		print(array2);

	}
}
