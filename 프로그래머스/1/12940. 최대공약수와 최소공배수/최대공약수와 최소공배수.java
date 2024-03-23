class Solution {
    public int[] solution(int a, int b) {
       int k = 0;
		int q = 0;
		for(int i = Math.max(a, b); i >= 1; i--) {
			if(b%i==0 && a%i==0) {
				k = i;
				break;
			}
		}
		q = a*b/k;
        return new int[]{k, q};
    }
}