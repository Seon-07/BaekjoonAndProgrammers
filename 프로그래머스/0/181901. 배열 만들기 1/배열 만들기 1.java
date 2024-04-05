class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int idx = 0;
        while(k*(idx+1) <= n){
            answer[idx] = k * (idx+1);
            idx++;
        }
        return answer;
    }
}