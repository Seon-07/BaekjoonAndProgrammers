class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 1; i < s.length(); i++){
            int cnt = 0;
            boolean e = false;
            for(int j = i-1; j >= 0; j--){
                if(s.charAt(i) == s.charAt(j)){
                    cnt++;
                    e = true;
                    break;
                }else{
                    cnt++;
                }
            }
            answer[i] = e ? cnt : -1;   
        }
        answer[0] = -1;
        return answer;
    }
}