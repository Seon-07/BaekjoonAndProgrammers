class Solution {
    public int solution(String A, String B) {
        int result = 0;
        while(result < A.length()){
            if(A.equals(B.substring(result) + B.substring(0, result))){
                return result;
            }
            result++;
        }
        return -1;
    }
}