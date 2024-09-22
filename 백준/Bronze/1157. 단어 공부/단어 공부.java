import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<>();
		List<String> l = new ArrayList<>();
		String str = s.nextLine().toUpperCase();
		
		for(int i = 0; i < str.length(); i++) {
			int n = 1;
			if(m.containsKey(str.charAt(i)+"")){
				m.replace(str.charAt(i)+"",m.get(str.charAt(i)+"") ,m.get(str.charAt(i)+"")+1);
			}else {
				m.put(str.charAt(i)+"", n);
				l.add(str.charAt(i)+"");
			}
		}
		int max = 0;
		int cnt = 0;
		String answer = "";
		for(int k:m.values()) {
			max = (k>max)?k:max;
		}
		for(int i = 0; i < m.size(); i++) {
			if(m.get(l.get(i)) == max) {
				cnt++;
				answer = l.get(i);
			}
		}
		if(cnt != 1) {
			System.out.println("?");
		}else {
			System.out.println(answer);
		}
	}
}