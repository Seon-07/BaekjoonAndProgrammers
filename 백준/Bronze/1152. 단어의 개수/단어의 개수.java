import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String w = s.nextLine();
		String[] a = new String [w.split(" ").length];
		if((""+w.charAt(0)).equals(" ") && a.length >0){
			System.out.println(a.length-1);
		}else {
		System.out.println(a.length);
		}
	}
}