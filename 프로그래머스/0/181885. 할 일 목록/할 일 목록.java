class Solution {
    public String[] solution(String[] todo, boolean[] finished) {
        String answer = "";
        for(int i = 0; i < todo.length; i++){
            answer += finished[i] ? "":todo[i]+",";
        }
        return answer.split(",");
    }
}