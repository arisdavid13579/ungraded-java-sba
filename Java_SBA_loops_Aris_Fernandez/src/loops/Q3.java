package loops;

import java.util.ArrayList;

public class Q3 {

	public static void primesn(int n) {
		// Prints primes from 1 to n. 
		ArrayList<String> primes = new ArrayList<String>();
		
		for (int i = 2; i <= n; i++) {
			boolean append = true;
			
			for (int m = 2; m <= i; m++) {
				
				if (i % m == 0) {
					if (!(i == m)) {
						append = false;
						break;
					}
				}
			}
			if (append) {
				primes.add(String.valueOf(i));
			}
		}
		
		System.out.println("The prime numbers from 1 to " + String.valueOf(n) + " are: " + String.join(", ", primes));
	}

	public static void main(String[] args) {

		primesn(100);
	}

}
