import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> pocket = new HashSet<>();
        for(int num: nums){
            pocket.add(num);
        }
        return pocket.size() < nums.length/2 ? pocket.size() : nums.length/2;
    }
}