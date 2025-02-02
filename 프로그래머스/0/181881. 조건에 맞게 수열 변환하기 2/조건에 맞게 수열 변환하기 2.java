import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int result = 0;
        int[] beforeArr = new int[arr.length];
        while(!Arrays.equals(beforeArr, arr)){
            beforeArr = arr.clone();
            for(int i = 0; i < arr.length; i++){
                int a = arr[i];
                if(a >= 50 && a % 2 == 0){
                    arr[i] = a / 2;
                }else if(a < 50 && a % 2 == 1){
                    arr[i] = a * 2 + 1;
                }
            }
            result++;
        }
        return result-1;
    }
}