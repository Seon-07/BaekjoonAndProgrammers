class Solution {
    int[] answer = new int[2];
    int zero = 0;
    int repeat = 0;
    public int[] solution(String s) {
        while(!s.equals("1")){
            s = binary(s);
        }
        answer[0] = repeat;
        answer[1] = zero;
        return answer;
    }
    String binary(String s){
        int len = s.length();
        s = s.replace("0","");
        len = len-s.length();
        zero += len;
        repeat++;
        s = Integer.toBinaryString(s.length());
        return s;
    }
}