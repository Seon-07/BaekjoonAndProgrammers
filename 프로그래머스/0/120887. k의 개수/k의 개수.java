class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        while(i <= j){
            for(int n = 0; n < (i+"").length(); n++){
                if((k+"").equals((i+"").charAt(n)+"")) answer++;
            }
            i++;
        }
        return answer;
    }
}