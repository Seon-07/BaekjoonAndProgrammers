import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int min = array[array.length-1];
        int result = array[0]-n;
        for(int a : array){
            int k = a-n;
            if(min > Math.abs(k)){
                min = Math.abs(k);
                result = k;
            }
        }
        return result+n;
    }
}