class Solution {
    public int solution(String[] babbling) {
       String[] can = {"aya", "ye", "woo", "ma"};
		int cnt = 0;
		for(int i = 0; i <babbling.length; i++) {
			for(String j : can) {
				if(babbling[i].indexOf(j) != -1) {
					String str = babbling[i].replace(j, " ");
					babbling[i] = str;
				}
			}
		}
		for(int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replace(" ", "");
		}
		for(String k : babbling) {
			if(k == "") {
				cnt++;
			}
		}
		return cnt;
    }
}