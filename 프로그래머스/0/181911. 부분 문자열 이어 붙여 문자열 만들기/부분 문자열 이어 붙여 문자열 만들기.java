class Solution {
    public String solution(String[] str, int[][] parts) {
        String answer = "";
        int idx = 0;
        for(int[] nums : parts){
            answer += str[idx].substring(nums[0],nums[1]+1);
            idx++;
        }
        return answer;
    }
}