class Solution {
    public int solution(int[] sides) {
        int result = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int sum = sides[0] + sides[1];
        result += sum - max - 1;
        result += min;
        return result;
    }
}