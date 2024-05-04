class Solution {
    public String[] solution(String[] strArr) {
        String answer = "";
        for(String str : strArr){
            if(!str.contains("ad")){
                answer += answer.equals("") ? str : ","+str;
            }
        }
        return answer.split(",");
    }
}