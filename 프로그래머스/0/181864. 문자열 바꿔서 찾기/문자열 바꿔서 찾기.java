class Solution {
    public int solution(String str, String pat) {
        return str.replace("A","C").replace("B","A").replace("C","B").indexOf(pat) == -1 ? 0 : 1;
    }
}