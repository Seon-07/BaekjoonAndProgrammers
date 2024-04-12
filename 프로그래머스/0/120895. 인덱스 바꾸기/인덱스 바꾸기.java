class Solution {
    public String solution(String str, int num1, int num2) {
        if(num1 == num2){
            return str;
        }
        String[] strArr = str.split("");
        String s = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = s;
        String answer = "";
        for(int i = 0; i < strArr.length; i++){
            answer += strArr[i];
        }
        return answer;
    }
}