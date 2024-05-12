class Solution {
    public int[] solution(int n) {
        String k = "";
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                k += k.equals("") ? i : ","+i;
            }
        }
        int[] answer = new int[k.split(",").length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(k.split(",")[i]);
        }
        return answer;
    }
        
}