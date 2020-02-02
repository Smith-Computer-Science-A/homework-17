import java.util.ArrayList;

public class Homework17 {

	/* Determine whether or not the ArrayList is sorted. Return true if it
	 * is sorted in non-decreasing order (each element is at lest as big as
	 * the one before it), false otherwise.
	 */

	 public static boolean problem1(ArrayList<Integer> l) {

 	}

	/* Sort the ArrayList l. You can use either selection sort or insertion
	 * sort. You must program the sort to get credit.
	 */

	public static void problem2(ArrayList<Integer> l) {

	}

	/* Given an unsorted ArrayList l of ints, return the first index of the
	 * int n. If the value is not in the ArrayList, return -1.
	 */

	public static int problem3(ArrayList<Integer> l, int n) {

	}

	/* Given a sorted ArrayList l of ints, return the first index of the
	 * int n. If the value is not in the ArrayList, return -1. You must
	 * program binary search to receive credit.
	 */

	public static int problem4(ArrayList<Integer> l, int n) {

	}

	/* Given an ArrayLis l of ints, return the maximum value in the list.
	 */

	public static int problem5(ArrayList<Integer> l) {

	}

	public static void main(String[] args) {
		boolean passed = true;

		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 50; i += 2) {
			l.add(0, i);
		}

		if (problem1(l)) {
			System.out.println("Fail 1");
			passed = false;
		} else {
			System.out.println("Pass 1");
		}

		problem2(l);
		if (!problem1(l)) {
			System.out.println("Fail 2");
			passed = false;
		} else {
			System.out.println("Pass 2");
		}

		l.add(5, 100);
		if (problem3(l, 100) != 5) {
			System.out.println("Fail 3.1");
			passed = false;
		} else if (problem3(l, 200) != -1) {
			System.out.println("Fail 3.2");
			passed = false;
		} else {
			System.out.println("Pass 3");
		}

		l.remove(5);
		if (problem4(l, 4) != 2) {
			System.out.println("Fail 4.1");
			passed = false;
		} else if (problem4(l, 200) != -1) {
			System.out.println("Fail 4.2");
			passed = false;
		} else {
			System.out.println("Pass 4");
		}

		if (problem5(l) != 48) {
			System.out.println("Fail 5");
			passed = false;
		} else {
			System.out.println("Pass 5");
		}

		if (passed) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
