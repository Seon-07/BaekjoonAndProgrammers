class Solution {
    public int solution(String[] order) {
        int result = 0;
        for(String cf : order){
            result += cf.contains("cafelatte") ? 5000 : 4500;
        }
        return result;
    }
}