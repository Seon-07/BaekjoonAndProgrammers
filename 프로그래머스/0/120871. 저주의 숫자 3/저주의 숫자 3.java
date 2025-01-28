class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++){
            result++;
            while(result % 3 == 0 || (result+"").indexOf("3") != -1){
                result++;
            }
        }
        return result;
    }
}