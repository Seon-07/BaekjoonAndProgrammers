class Solution {
    public boolean solution(int x) {
        int n = 0;
		String[] arr = (x+"").split("");
		for(String k : arr) {
			n += Integer.parseInt(k);
		}
		return x%n==0;
    }
}