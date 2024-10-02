import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sumY = 0;
		int sumM = 0;
		for(int i = 0; i < n; i++) {
			int a =  s.nextInt();
			sumY += ((a/30)*10)+10;
			sumM += ((a/60)*15)+15;
		}
		System.out.print((sumY>sumM)?"M ":(sumY<sumM)?"Y ":"Y M ");
		System.out.println(Math.min(sumY, sumM));
	}
}