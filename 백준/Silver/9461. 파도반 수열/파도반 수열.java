import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long[] arr = new long[101];
		int j = s.nextInt();
		for (int k = 0; k < j; k++) {
			int n = s.nextInt();
			arr[0] = 1;
			arr[1] = 1;
			arr[2] = 1;
			arr[3] = 2;
			arr[4] = 2;
			arr[5] = 3;
			for (int i = 6; i <= n; i++) {
				arr[i] = arr[i - 1] + arr[i - 5];
			}
			System.out.println(arr[n-1]);
		}
	}
}