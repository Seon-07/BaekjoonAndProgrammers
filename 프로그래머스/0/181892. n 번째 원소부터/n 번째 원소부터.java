class Solution {
    public int[] solution(int[] numList, int n) {
        int[] answer = new int[numList.length-n+1];
        int idx = 0;
        for(int i = n-1; i < numList.length; i++){
            answer[idx] = numList[i];
            idx++;
        }   
        return answer;
    }
}