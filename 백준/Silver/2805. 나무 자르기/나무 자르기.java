import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] tree = new int[n];
		int m = sc.nextInt();

		int top = 0;
		int bottom = 1;
		
		for (int i = 0; i < n; i++) {
			tree[i] = sc.nextInt();

			top = Math.max(top, tree[i]);
		}
		
		int answer = 0;
		
		while (bottom < top) {
			int mid = (top + bottom) / 2;
			long sum = 0;

			for (int k : tree) {
				if (k - mid > 0) {
					sum += (k - mid);
				}
			}
			if(sum >= m) {
				answer = mid;
				bottom = mid+1;
			}else {
				top = mid;
			}
		}
		System.out.println(answer);
	}
}