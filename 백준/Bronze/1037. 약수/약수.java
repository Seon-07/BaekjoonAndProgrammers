import java.util.*;
class Main {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}
		l.sort(null);
		System.out.println(l.get(0)*l.get(n-1));
	}
}