class Solution {
    public int solution(int n) {
        int result = 1;
        int num = 1;
        while(num <= n){
            num *= result;
            result++;
        }
        return result-2;
    }
}