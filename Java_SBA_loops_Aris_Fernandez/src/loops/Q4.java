package loops;

import java.util.ArrayList;

public class Q4 {

	public static void palinnum(int n) {
		// Checks if n is a palindrome and prints the result to screen
		ArrayList<String> temp_arr = new ArrayList<String>();
		String strn = String.valueOf(n);

		for (String s : strn.split("")) {
			temp_arr.add(0, s);
		}

		String outval = String.join("", temp_arr);
		String outstr;

		if (Integer.parseInt(outval) == n) {
			outstr = "Yes, " + String.valueOf(n) + " is a palindrome because " + String.valueOf(outval)
					+ " in reverse is " + String.valueOf(n);

		} else {
			outstr = "No, " + String.valueOf(n) + " is NOT a palindrome because " + String.valueOf(n)
					+ " in reverse is " + String.valueOf(outval);
		}

		System.out.println(outstr);
	}

	public static void main(String[] args) {

		palinnum(123454321);
		System.out.println("");
		palinnum(123455321);

	}

}
