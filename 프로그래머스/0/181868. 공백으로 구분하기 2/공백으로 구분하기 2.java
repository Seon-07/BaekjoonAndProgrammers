class Solution {
    public String[] solution(String str) {
        return str.replaceAll("\\s+", " ").trim().split(" ");
    }
}