class Solution {
    public String solution(String str, String alp) {
        String answer = "";
        for(char k : str.toCharArray()){
            answer +=(""+k).equals(alp)?(""+k).toUpperCase():k;
        }
        return answer;
    }
} 