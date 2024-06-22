class Solution {
    public int solution(int order) {
        return (order+"").length() - (order+"").replace("3","").replace("6","").replace("9","").length();
    }
}