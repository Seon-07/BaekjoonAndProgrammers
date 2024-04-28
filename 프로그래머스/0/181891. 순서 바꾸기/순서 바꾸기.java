class Solution {
    public int[] solution(int[] nums, int n) {
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i < n){
                answer[nums.length - n + i] = nums[i];
            }else{
                answer[i-n] = nums[i];
            }
        }
        return answer;
    }
}