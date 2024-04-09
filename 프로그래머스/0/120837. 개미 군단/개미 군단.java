class Solution {
    public int solution(int hp) {
        int a = 0;
        a += hp / 5;
        a += (hp%5) / 3;
        a += ((hp%5)%3);
        return a;
    }
}