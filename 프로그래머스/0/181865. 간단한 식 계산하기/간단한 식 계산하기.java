class Solution {
    public int solution(String str) {
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[2]);
        String c  = str.split(" ")[1];
        int answer = c.equals("+")?a+b: c.equals("-")?a-b: a*b; 
        return answer;
    }
}