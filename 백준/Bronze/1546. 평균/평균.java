import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double[] arr = new double[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int max = 0;
		for(double k:arr) {
			max = (int)Math.max(k, max);
		}
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i]/(double)max * 100);
		}
		double sum=0;
		for(double k : arr) {
			sum += k;
		}
		System.out.println(sum/n);
	}
}