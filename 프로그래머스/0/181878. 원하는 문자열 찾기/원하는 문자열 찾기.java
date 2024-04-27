class Solution {
    public int solution(String str, String pat) {
        return str.toLowerCase().contains(pat.toLowerCase())?1:0;
    }
}