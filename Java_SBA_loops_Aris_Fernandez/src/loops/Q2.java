package loops;

public class Q2 {

	public static void factorialfor(int n) {
		int output = 1;
		for (int m = 1; m < (n + 1); m++) {
			output *= m;
		}

		System.out.println(String.valueOf(n) + "! = " + String.valueOf(output));
	}

	public static void factorialwhile(int n) {
		int m = 0;
		int output = 1;
		while (m < n) {
			m += 1;
			output *= m;

		}
		System.out.println(String.valueOf(n) + "! = " + String.valueOf(output));
	}

	public static void main(String[] args) {
		System.out.println("------------FOR-----------");
		factorialfor(0);
		factorialfor(1);
		factorialfor(5);

		System.out.println("-----------WHILE----------");
		factorialwhile(0);
		factorialwhile(1);
		factorialwhile(5);
	}

}
