class Solution {
    public int[] solution(String my_string) {
        int[] result = new int[52];
        for(char s : my_string.toCharArray()){
            result[Character.isLowerCase(s) ? s - 71 : s - 65]++;
        }
        return result;
    }
}