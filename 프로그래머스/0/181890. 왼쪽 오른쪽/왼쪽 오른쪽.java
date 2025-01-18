import java.util.*;
class Solution {
    public String[] solution(String[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("l")){
                return Arrays.copyOfRange(arr, 0, i);
            }else if(arr[i].equals("r")){
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }else{
                continue;
            }
        }
        return new String[0];
    }
}