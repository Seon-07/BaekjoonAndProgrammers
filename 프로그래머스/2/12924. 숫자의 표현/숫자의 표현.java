class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++){
            int sum = 0;
            int k = i;
            while(sum < n){
                sum += k;
                k++;
                if(sum == n) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}