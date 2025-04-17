class Solution {
    public int solution(int chicken) {
        int result = 0;
        while(chicken > 9){
            int sv = chicken / 10;
            result += sv;
            chicken = sv + chicken % 10;
        }
        return result;
    }
}