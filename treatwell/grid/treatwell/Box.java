/**
 * @author jakerbailey
 * @version 31-1-2019
 * 
 * This class provides a method that, when given parameters representing width and height, will draw a box of size width by height.
 */

package treatwell;

import java.util.ArrayList;

public class Box {

	/*
	 * The draw method first checks if either of the parameters are less than or
	 * equal to 1. This is because if that were the case, then a suitable box could
	 * not be drawn. An appropriate error message is then printed.
	 * 
	 * Once both width and height are known to be above 1, an ArrayList of char[]'s
	 * is instantiated.
	 * 
	 * Three char[]'s are instantiated, representing the top, middle and bottom of
	 * the box. The left most and right most 'edges' of each row is then assigned
	 * the appropriate character. A for loop then iterates through the middle of the
	 * arrays and assigns the appropriate character, either ' ' for a middle row, or
	 * '-'/'-' for a top or bottom row. The middle row is copied as many times as
	 * necessary, to correct the height of the box. All char[]'s are then added to
	 * the ArrayList box.
	 * 
	 * The helper method visualise() is then called, to print out each character
	 * within the ArrayList<char[]> passed as a parameter.
	 */
	public static void draw(int w, int h) {

		if (w <= 1 || h <= 1) {
			System.out.println("Error: Please select value for height or width above 1, thank you.");
		} else {

			ArrayList<char[]> box = new ArrayList<char[]>();

			char[] t = new char[w];
			char[] b = new char[w];
			char[] m = new char[w];

			t[0] = '┌';
			t[w - 1] = '┐';
			b[0] = '└';
			b[w - 1] = '┘';
			m[0] = '│';
			m[w - 1] = '│';

			for (int i = 1; i < w - 1; i++) {

				t[i] = '-';
				b[i] = '-';
				m[i] = ' ';
			}

			box.add(t);

			for (int j = 1; j < h - 1; j++) {

				char[] copy = m;

				box.add(copy);
			}

			box.add(b);

			visualise(box);

		}

	}

	/*
	 * This method iterates through each char[] within the ArrayList a, and prints
	 * every element.
	 */
	public static void visualise(ArrayList<char[]> a) {

		for (int i = 0; i < a.size(); i++) {

			for (int j = 0; j < a.get(0).length; j++) {

				System.out.print(a.get(i)[j]);
			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		draw(30, 5);

	}

}
