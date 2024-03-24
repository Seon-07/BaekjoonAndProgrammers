class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] q = t.split("");
        for(int i = 0; i < t.length()-p.length()+1; i++){
            String number = "";
            for(int j = 0; j < p.length(); j++){
                number += q[j+i];
            }
            if(Long.parseLong(number) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}