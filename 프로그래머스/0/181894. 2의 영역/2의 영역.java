import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = arr.length;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(i < min) min = i;
                if(i > max) max = i;
            }
        }
        if(max == 0) return new int[]{-1};
        return Arrays.copyOfRange(arr, min, max+1);
    }
}