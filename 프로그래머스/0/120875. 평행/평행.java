class Solution {
    public int solution(int[][] dots) {
       double[] case1 = { 0, 0, 0};
		double[] case2 = { 0, 0, 0};
		int a = 0;
		case1[0] = (double)(dots[0][0] - dots[1][0]) / (double)(dots[0][1] - dots[1][1]);
		case2[0] = (double)(dots[2][0] - dots[3][0]) / (double)(dots[2][1] - dots[3][1]);
		
		case1[1] = (double)(dots[0][0] - dots[2][0]) / (double)(dots[0][1] - dots[2][1]);
		case2[1] = (double)(dots[1][0] - dots[3][0]) / (double)(dots[1][1] - dots[3][1]);
		
		case1[2] = (double)(dots[0][0] - dots[3][0]) / (double)(dots[0][1] - dots[3][1]);
		case2[2] = (double)(dots[1][0] - dots[2][0]) / (double)(dots[1][1] - dots[2][1]);
		
		for(int i = 0; i < 3; i++) {
			if(case1[i] == case2[i]) {
				a = 1;
			}
		}
		return a;
    }
}