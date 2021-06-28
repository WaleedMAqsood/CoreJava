
public class CharArrayExample {

	public static void main(String[] args) {

		/*
		 * The int array is an array of integers.The char array of printable characters.
		 * The printwriter has the capability to print character arrays as this is how
		 * it prints string anyway. The printwriter will therefore print them like a
		 * string, without calling the toString() method to convert it to a string.
		 * 
		 */
		char[] s = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'g' };

		System.out.println(s);

		String string = new String(s);
		System.out.println(string);

		int[] d = { 4, 5, 6, 7, 8, 9 };
		System.out.println(d);

	}
}
