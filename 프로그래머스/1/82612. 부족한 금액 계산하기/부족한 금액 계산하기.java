class Solution {
    public long solution(int price, long money, int cnt) {
        long sum = 0;
        for(int i = 1; i <= cnt; i++) {
			sum += (price * i);
		}
		return money-sum>=0 ? 0 : Math.abs(money-sum);
    }
}