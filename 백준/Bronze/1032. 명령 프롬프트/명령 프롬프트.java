import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = s.next();
		}
		String test = arr[0];
		boolean[] check = new boolean[test.length()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (!(""+arr[i].charAt(j)).equals(""+test.charAt(j))){
					check[j] = true;
				}
			}
		}
		String answer = "";
		for(int i = 0; i < check.length; i++) {
			if(check[i] == true) {
				answer += "?";
			}else {
				answer += test.charAt(i);
			}
		}
		System.out.println(answer);
		
	}
}