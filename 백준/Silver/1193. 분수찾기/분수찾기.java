import java.util.*;
class Main {
	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int sum = 0;
		int n = 0;
		while (k > sum) {
			sum += ++n;
		}
		if (n % 2 == 0) {
			System.out.println(n - (sum - k) + "/" + (sum - k + 1));
		} else {
			System.out.println((sum - k + 1) + "/" + (n - (sum - k)));
		}
	}
}