import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int k = 1;
			for(int j = 0; j < b; j++) {
				k = (k*a)%10;
			}
			k = (k==0)?10:k;
			System.out.println(k);
		}
	}
}