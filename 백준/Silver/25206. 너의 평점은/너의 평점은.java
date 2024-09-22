import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double sum = 0;
		int k = 0;
		for (int i = 0; i < 20; i++) {
			String str[] = s.nextLine().split(" ");
			String a = str[2].substring(0, 1);
			double sc = 0;
			switch (a) {
			case "A":
				sc = 4;
				break;
			case "B":
				sc = 3;
				break;
			case "C":
				sc = 2;
				break;
			case "D":
				sc = 1;
				break;
			case "F":
				sc = 0;
				break;
			case "P":
				break;
			}
			if (!a.equals("P")) {
				if (!a.equals("F")) {
					sc += (str[2].substring(1, 2).equals("+")) ? 0.5 : 0;
				}
				sum += Long.parseLong(str[1].substring(0, 1)) * sc;
				k += Long.parseLong(str[1].substring(0, 1));
			}
		}
		System.out.println(sum / (double) k);
	}
}