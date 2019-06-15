package loops;

import java.util.ArrayList;

public class Q1 {

	public static ArrayList<Integer> fibinner(int n) {
		// Return an ArrayList of the Fibonacci numbers.

		ArrayList<Integer> output = new ArrayList<Integer>();
		output.add(0);
		
		if (n == 1) {
			return output;
		} 
		else if (n == 2) {
			output.add(1);
			return output;
		} 
		else {
			output.add(1);
			for (int i = 1; i < (n - 1); i++) {
				output.add(output.get(i) + output.get(i - 1));
			}
			return output;
		}
	}

	public static void fibn(int n) {
		// Prints to screen the Fibonacci numbers in a clearer format.

		ArrayList<Integer> outputnum = new ArrayList<Integer>();
		outputnum = fibinner(n);
		ArrayList<String> outputstr = new ArrayList<String>();
		
		for (Integer i : outputnum) {
			outputstr.add(i.toString());

		}
		
		System.out.println(
				("The first " + String.valueOf(n) + " Fibbonacci numbers are: " + String.join(", ", outputstr)));

	}

	public static void main(String[] args) {

		fibn(16);
	}

}
